package com.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinition {

	WebDriver driver;
	
//	Given user is already on login page
	@Given("^user is already on login page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/Eclipse Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com");
	}
	
//	When title of login page is free CRM
	@When("^title of login page is free CRM$")
	public void title_of_login_page_is_free_CRM(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
	}
	
//	Then user enters username and password
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("email")).sendKeys("adithya396@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Adithya@007");
	}
	   
//	Then user clicks on login button
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
	   WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]"));
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click();", loginButton);
	}
	
//	And user is on home page
	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		String title = driver.getTitle();
		System.out.println("Home Page title is"+ title);
		Assert.assertEquals("Cogmento CRM", title);
	}
	
}
