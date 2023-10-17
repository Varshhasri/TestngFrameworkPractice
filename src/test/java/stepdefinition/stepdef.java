package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pageobject.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdef {
	
	WebDriver driver;  loginpage lgp;
	
	@Given("user Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		lgp = new loginpage(driver);
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	   
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String mail, String pwd) {
		lgp.enterEmail(mail);
		lgp.enterPassword(pwd);
	    
	}

	@When("Click on Login")
	public void click_on_login() {
		lgp.clickOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String exptitle) {
		String actualtitle = driver.getTitle();
		if(actualtitle.equals(exptitle)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	    
	}

	@When("User click on the log out link")
	public void user_click_on_the_log_out_link() {
		//lgp.clickOnLogOutButton();
		lgp.getClass();
	   
	}

	@When("Close the Browser")
	public void close_the_browser() {
		driver.close();
	    
	}


}
