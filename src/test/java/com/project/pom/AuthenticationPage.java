package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends Base {
	
	By authenticationLinkLocator = By.linkText("Sign in");
	
	By EMAIL = By.xpath("//input[@name='email']");
	By PASSWORD = By.xpath("//input[@id='passwd']");
	By SIGN_IN_BUTTON = By.xpath("//*[@id='SubmitLogin']");
	By dropdownList_States = By.name("id_state");
	By ERROR_MESSAGE = By.xpath("//p[contains(.,'There is 1 error')]");
	By ORDER_HISTORY = By.xpath("//span[contains(.,'Order history and details')]");

	public AuthenticationPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void AuthenticationUser() throws InterruptedException {
		click(authenticationLinkLocator);
		Thread.sleep(2000);
		
		type("santiyabwana@gmail.com",EMAIL);
		type("123456",PASSWORD);
		click(SIGN_IN_BUTTON);
		Thread.sleep(2000);
		
	}
	
	public void AuthenticationInvalidUser() throws InterruptedException {
		click(authenticationLinkLocator);
		Thread.sleep(2000);
		
		type("4",EMAIL);
		type("123456",PASSWORD);
		click(SIGN_IN_BUTTON);
		Thread.sleep(2000);
		
	}
	
	

}
