package com.qa.pages;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.jitubase.DriverScript;

	public class Taskpage  extends DriverScript 
	{


	     @FindBy(xpath="//div[@class='title ellipsis']") WebElement Addnew;
	     @FindBy(xpath="//div[@class='item createNewCustomer']") WebElement newcustomer;
	     @FindBy(xpath="//input[@placeholder='Enter Customer Name']") WebElement customernametab;
	     @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement customerdescription;
	     @FindBy(xpath="//div[contains(text(),'Create Customer')]") WebElement createcustomertab;
	     
	
	public void taskpage()
	{
		PageFactory.initElements(driver, this);
	}
    public void addnew(){
    	Addnew.click();
    }
    public void newcustomer(){
    	newcustomer.click();
    }
    public void customername(String customername)
    {
    	customernametab.sendKeys(customername);
    }
    
   public void cudtomerdescription(String description)
   {
	   customerdescription.sendKeys(description);
   }
   public void ceatecustomer(){
	   createcustomertab.click();
   }
    

}