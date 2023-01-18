package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL="https://sakshingp.github.io/assignment/login.html#";
	public String username="Admin";
	public String password="Admin@123";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
}
