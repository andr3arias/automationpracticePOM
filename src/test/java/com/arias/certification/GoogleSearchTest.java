package com.arias.certification;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void testGooglePage() {
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.clear();
		
		searchbox.sendKeys("automation practice");
		
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		assertEquals("automation practice - Buscar con Google", driver.getTitle());
	}
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
	
	/*@Test void localizadores() {
	 
	By locator = By.id("id_del_elemento");
	
	By locator_name = By.name("name_elemnt");
	
	By locator_className = By.className("clase_elemento");
	
	By locator_tagName = By.tagName("tag");
	
	By locator_linktext = By.linkText("texto_link");
	
	By locator_partialLinkText = By.partialLinkText("parte_texto");
	
	By locator_cssSelector = By.cssSelector("input[name='q']");
	
	By locator_Xpath = By.xpath("//input[@name='q']");
	
	// JavaScript
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement searchBox = (WebElement)js.executeScript("return document.getElementsByName('q')[0]");
	
}*/
}
