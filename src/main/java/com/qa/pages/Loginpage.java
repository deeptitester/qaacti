package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.jitubase.DriverScript;

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
	
	public void validatelogin(String username,String passward){
		
	}
		
	
	
	
	
	
}
