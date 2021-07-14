package stepDefinitn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("^Open chrome browser$")
	public void Open_chrome_browser() throws Throwable {
	   // System.out.println("Open browser");
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\madasuvamsi\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	}

	@Then("^Get Valid URL$")
	public void Get_Valid_URL() throws Throwable {
	    System.out.println("valid URL");
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	}
	@When("^Login with valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void Login_with_valid_and(String uname, String pass) throws Throwable {
	    
	
	System.out.println("login with username and password");
	driver.findElement(By.name("txtUsername")).sendKeys(uname);
	driver.findElement(By.name("txtPassword")).sendKeys(pass);
	driver.findElement(By.name("Submit")).click();
	}

	@Then("^User Login successfully$")
	public void User_Login_successfully() throws Throwable {
	    System.out.println("Login sucessfully");
	}

	@Then("^Close the chrome browser$")
	public void Close_the_chrome_browser() throws Throwable {
	    System.out.println("Close the browser");
	}
	
}
