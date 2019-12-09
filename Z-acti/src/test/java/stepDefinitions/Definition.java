package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Definition {
	WebDriver driver;
	@Given("Open chrome browser and enter the site")
	public void open_chrome_browser_and_enter_the_site() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Z-YU\\Desktop\\eclipse\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		Thread.sleep(500);
	}

	@When("i enter the valid {string} and valid {string}")
	public void i_enter_the_valid_and_valid(String uname, String pass) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
	}

	@Then("i should be able to login to the app successfully")
	public void i_should_be_able_to_login_to_the_app_successfully() throws InterruptedException {
		boolean img= driver.findElement(By.xpath("//div/img[@src='/img/default/top_nav/default-logo.png?hash=274618146']")).isDisplayed();
		Assert.assertTrue(img);
		Thread.sleep(3000);
		driver.quit();
	}
}
