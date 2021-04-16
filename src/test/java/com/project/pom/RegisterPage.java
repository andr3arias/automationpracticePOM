package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends Base {
	
	By authenticationLinkLocator = By.linkText("Sign in");
	By authenticationPageLocator = By.xpath("//*[@id=\"center_column\"]/h1");
	
	By createAnAccountEmail = By.id("email_create");
	By createAnAccountBtn = By.id("SubmitCreate");
		
	By customerFirstname = By.id("customer_firstname");
	By LAST_NAME = By.xpath("//input[@id='customer_lastname']");
	By EMAIL = By.xpath("//input[@name='email']");
	By PASSWORD = By.xpath("//input[@id='passwd']");
	By ADDRESS = By.xpath("//input[@id='address1']");
	By CITY = By.xpath("//input[@id='city']");
	By STATE = By.xpath("//select[@id='id_state']");
	By ZIP_POSTAL_CODE = By.xpath("//input[@id='postcode']");
	By COUNTRY = By.xpath("//select[@id='id_country']");
	By MOBILE_PHONE = By.xpath("//input[@id='phone_mobile']");
	By HOME_PHONE = By.xpath("//input[@id='phone']");
	By ADDRESS_ALIAS = By.xpath("//input[@id='alias']");
	By REGISTER_BUTTON = By.xpath("//button[@id='submitAccount']");
	By SAVE_BUTTON = By.xpath("//*[@id='submitAddress']");
	By dropdownList_States = By.name("id_state");

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void registerUser() throws InterruptedException {
		click(authenticationLinkLocator);
		Thread.sleep(2000);
		
		type("4@4.com",createAnAccountEmail);
		click(createAnAccountBtn);
		Thread.sleep(2000);
		
		type("Alana",customerFirstname);
		type("Arias",LAST_NAME);
		type("123456",PASSWORD);
		type("Calle 14",ADDRESS);
		type("Nowhere",CITY);
		selectDropdownList_States();
		type("00000",ZIP_POSTAL_CODE);
		type("57832014",MOBILE_PHONE);
		//click(REGISTER_BUTTON);
	}
	
	public String selectDropdownList_States() {
		WebElement dropdownList = findElement(dropdownList_States);
		List<WebElement> options = dropdownList.findElements(By.tagName("option"));
		for (int i=0; i<options.size(); i++) {
			if(getText(options.get(i)).equals("Arkansas")) {
				click(options.get(i));
			}
		}
		String selectedOption = "";
		for (int i=0; i< options.size(); i++) {
			if(options.get(i).isSelected())
				selectedOption = getText(options.get(i));
		}
		return selectedOption;
	}
	

}
