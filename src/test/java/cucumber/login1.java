package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login1 {
	static{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2d.02.11\\chromedrivers\\chromedriver_win32\\chromedriver.exe");
	}
	WebDriver driver = new ChromeDriver();
	@Given("i have choosen to login")
	public void i_have_choosen_to_login() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 WebElement register=driver.findElement(By.linkText("SignIn"));
		  register.click();
		  
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("enduser enters the valid credentials and click on submit button")
	public void enduser_enters_the_valid_credentials_and_click_on_submit_button() {
		WebElement username=driver.findElement(By.name("userName"));
		  username.sendKeys("Lalitha");
		  WebElement password=driver.findElement(By.name("password"));
		  password.sendKeys("Password123");
		  WebElement login=driver.findElement(By.name("Login"));
		  login.click();
		  System.out.println("Login Successful");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Then("user gets successfull message")
	public void user_gets_successfull_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Given("enduser is on the login page")
	public void enduser_is_on_the_login_page() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("enduser enters the invalid credentials and click on submit button")
	public void enduser_enters_the_invalid_credentials_and_click_on_submit_button() {
		WebElement username=driver.findElement(By.name("userName"));
		  username.sendKeys("lllll");
		  WebElement password=driver.findElement(By.name("password"));
		  password.sendKeys("Passwor");
		  WebElement login=driver.findElement(By.name("Login"));
		  login.click();
		  System.out.println("Login unsuccessful");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user gets error message")
	public void user_gets_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("i should login successfully")
	public void i_should_login_successfully() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
