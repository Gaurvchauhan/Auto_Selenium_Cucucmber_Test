package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.utils.*;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//input[@id='ctl00__cph__Login1_tbx_UserId']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='ctl00__cph__Login1_tbx_Password']")
	WebElement password;
	
	@FindBy(xpath="//a[@id='ctl00__cph__Login1_lbt_login']")
	WebElement loginBtn;
	
	@FindBy(id="ctl00__cph__Login1_tbx_SecretAnswer")
	WebElement secretAns;
	
	@FindBy(xpath="//a[@id='ctl00__cph__Login1_lbt_login']")
	WebElement login2;
	
	//Initializing the Page Objects:
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un, String pwd,String sAns){
		try{
	
	username.sendKeys(un);

	password.sendKeys(pwd);
		
	loginBtn.click();

	secretAns.sendKeys(sAns);

	login2.click();
	
//		    	JavascriptExecutor js = (JavascriptExecutor)driver;
//		    	js.executeScript("arguments[0].click();", loginBtn);
		
		
		    	
		//return new HomePage();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		//return new HomePage();
}}