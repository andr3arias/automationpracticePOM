package com.project.pom;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CreateAnAccountValidEmailTest {
	
	private WebDriver driver;
	CreateAnAccountPage createAnAccountPage;
	

	@Before
	public void setUp() throws Exception {
		createAnAccountPage = new CreateAnAccountPage(driver);
		driver = createAnAccountPage.chromeDriverConnection();
		createAnAccountPage.visit("http://automationpractice.com");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		Boolean response = createAnAccountPage.createAnAccountUser();
		 assertTrue(response);
	}

}
