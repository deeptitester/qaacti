package com.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.jitubase.DriverScript;

//* script: login page
//*Tester :Deepti
//* Verified by : jitu
//*Date created :04/28/2020
//*Date modified:04/29/2020
public class Loginpage extends DriverScript

  {
   //***********************page WebElement***********************
	
	@FindBy(id="logoContainer") WebElement Actilogo;
	@FindBy(id="username")WebElement usernametab;
	@FindBy(name="pwd")WebElement pwdtab;
	@FindBy(id="loginButton")WebElement logintab;
	
	//***********************page Initialization***********************
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//***********************page Initialization***********************
	public   boolean verifyactilogo()
	{
     return Actilogo .isDisplayed()	;
	}
	
	public void validatelogin(String username,String passward)
	{
		usernametab.sendKeys(username);
		pwdtab.sendKeys(passward);
		logintab.click();
	}
	
		
	public String verifyloginpage(){
		return driver.getTitle();
	}
	
	
	
	
}
