package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public  TestBase(){
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\Selenium Java\\com.selenium.java2\\src\\test\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);		
		} 
		catch (IOException e) {
			e.getMessage();
		}
	}
	public String getReportConfigPath(){
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}

public static void initialization(){
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");	
		 driver = new ChromeDriver(); 
	}
//	else if(browserName.equals("FF")){
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\gourav\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");	
//		 driver = new FirefoxDriver(); 
//	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
//	driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
//	
	driver.get(prop.getProperty("url"));
	
}
}