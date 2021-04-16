package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAnAccountPage extends Base{
	
	By authenticationLinkLocator = By.linkText("Sign in");
	By authenticationPageLocator = By.xpath("//*[@id=\"center_column\"]/h1");
	
	By createAnAccountEmail = By.id("email_create");
	By createAnAccountBtn = By.id("SubmitCreate");
	
	By customerFirstname = By.id("customer_firstname");
	By createAnAccountMessageError = By.id("create_account_error");
	
	public CreateAnAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public Boolean createAnAccountUser() throws InterruptedException  {
		click(authenticationLinkLocator);
		Thread.sleep(2000);
		if(isDisplayed(authenticationPageLocator)) {
			type("4@4.com",createAnAccountEmail);
			
			click(createAnAccountBtn);
			Thread.sleep(2000);
			
			if (isDisplayed(customerFirstname)) {
				return true;
			}
		}
		
		return false;
	}
	
	public Boolean createAnAccountInvalidUser()throws InterruptedException{
		
		click(authenticationLinkLocator);
		Thread.sleep(2000);
		if(isDisplayed(authenticationPageLocator)) {
			type("4",createAnAccountEmail);
			
			click(createAnAccountBtn);
			Thread.sleep(2000);
			
				if (isDisplayed(createAnAccountMessageError)) {
				return true;
			}
		}
		
		return false;
	}
	
}

