package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base {
	
	By authenticationLinkLocator = By.linkText("Sign in");
	By authenticationPageLocator = By.xpath("//*[@id=\"center_column\"]/h1");
	
	

	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
