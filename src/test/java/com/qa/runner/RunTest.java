
package com.qa.runner;

import java.io.File;
import java.io.FileReader;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "D:\\Selenium Java\\com.selenium.java2\\src\\test\\java\\com\\qa\\features\\freeCRM.feature", //the path of the feature files
			glue={"stepDef"}, //the path of the step definition files
			plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html","json:target/cucumber-reports/cucumber.json"},
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}	
			
			)
	 
	public class RunTest {
		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File("D:\\Selenium Java\\com.selenium.java2\\src\\test\\java\\com\\qa\\config\\extent-config.xml"));
			

		}
	 
	}
