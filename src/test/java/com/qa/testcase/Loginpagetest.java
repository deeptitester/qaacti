package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.jitubase.DriverScript;
import com.qa.pages.Loginpage;

//* script: login page
//*Tester :Deepti
//* Verified by : jitu
//*Date created :04/28/2020
//*Date modified:04/29/2020


public class Loginpagetest extends DriverScript
{ 
  Loginpage lp;

  public Loginpagetest()
  {
	  super();
  }
   @BeforeMethod
   public void pretest()
   {
	 initapp(); 
	 lp = new Loginpage();
   }
  @AfterMethod
  public void loginpagetest()
  {
	  driver.close();
	  
  }
  @Test(priority=1)
   public void testverifyactilogo()
   {
	   Loginpage lp = new Loginpage();
	   boolean flag = lp.verifyactilogo();
	   System.out.println(flag);
	  
   }
  @Test(priority=2)
   public void testvelidateloginfunction()
   {
	Loginpage lp = new Loginpage();
	lp.validatelogin("admin", "manager");
	
	   
   }
  @Test
  public void testvelidateloginfunction1(){
	  lp.validatelogin(prop.getProperty("username"),prop.getProperty("passward"));
  }
}
