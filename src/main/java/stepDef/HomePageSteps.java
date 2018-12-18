package stepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase
{
	
	//HomePage homePage =new HomePage();
	

	
	@Given("^User open browser$")
	public void user_open_browser() throws Throwable {
		TestBase.initialization();
	    //throw new PendingException();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		LoginPage login = new LoginPage();
		
		login.login(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("secretAns"));
	}


}
