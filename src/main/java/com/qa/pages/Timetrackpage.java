package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.jitubase.DriverScript;

public class Timetrackpage extends DriverScript 
{
     @FindBy(id="container_tasks") WebElement homepage;
     @FindBy(id="logoutLink")WebElement logout;
      @FindBy (xpath="//a[@class='userProfileLink username']") WebElement johndoe;

   public Timetrackpage(){
	   PageFactory.initElements(driver, this);
   }
     
     public void clicklogout()
     {
    	 logout.click();
     }
     
     public void taksmenu(){
    	 homepage.click(); 
     }
     public String getuserloggedintext(){
    	 return johndoe.getText();
     }
     
}
