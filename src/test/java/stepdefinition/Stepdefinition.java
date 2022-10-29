package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
	public WebDriver driver;

@Given("^user Launch The browser$")
public void user_Launch_The_browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"G:\\chrome\\my_workworkspace\\ShopRite1\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	
}
@When("^user Launch The Given url$")
public void user_Launch_The_Given_url() throws Throwable {
	driver.get("https://www.shoprite.com/sm/pickup/rsid/3000/");
}

@When("^user search The Milk in Search Box$")
public void user_search_The_Milk_in_Search_Box() throws Throwable {
  
}

@Then("^Should Be Navigate The Milk Page$")
public void should_Be_Navigate_The_Milk_Page() throws Throwable {
   
}



}
