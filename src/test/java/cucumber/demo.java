package cucumber;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


	public class demo {
		WebDriver driver;
		@Given("^user is on the login page$")
		public void user_is_on_the_login_page() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2d.02.11\\chromedrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	        driver.manage().window().maximize();
	       
	   	}
		

	@When("^Given user is on the login pagen  user enters correct credentials$")
	public void given_user_is_on_the_login_pagen_user_enters_correct_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("tutorial");
	    driver.findElement(By.name("password")).sendKeys("tutorial");
	    driver.findElement(By.name("login")).click();
		
	}
		
		@Then("^user can do the successful login$")
		public void user_can_do_the_successful_login() throws Throwable {
	        Assert.assertEquals("Find a Flight: Mercury Tours:",driver.getTitle());
	        driver.close();
		   
		}

		public class Credentials{
	        public String username;
	        public String password;
	    }


		@When("^user enters below credentails and clicks sing in$")
		public void user_enters_below_credentails_and_clicks_sing_in(List<Credentials> userdata) throws Throwable {
			for(Credentials credentials:userdata){

		          driver.findElement(By.name("userName")).sendKeys(credentials.username);
		          driver.findElement(By.name("password")).sendKeys(credentials.password);
		          driver.findElement(By.name("login")).click();
		          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		           driver.navigate().to("http://demoaut.com/");
		         	}
		}

		
		@Then("^the expected behavior could be$")
		public void the_expected_behavior_could_be() throws Throwable {
		    System.out.println("end");
		    
		}


	}
