package com.testCases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObject.LoginPage;

public class TC_Login extends BaseClass{
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		
		lp.clickLogin();
		
		if (driver.getTitle().equals("Demo App")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	
	@Test (dependsOnMethods= {"loginTest"})
	public void AmountHeader()
	{
		WebElement element=driver.findElement(By.id("amount"));
		element.click();
		
		Select se= new Select(element);
		
		List originalList= new ArrayList();
		List tempList=new ArrayList();
		
		List<WebElement>options=se.getOptions();
		
		for (WebElement e : options) {
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		
		Collections.sort(tempList);
		
		if (originalList==tempList) {
			System.out.println("Values are Sorted .....");
		}
		else {
			System.out.println("Values are not Sorted ????");
		}
	}

}
