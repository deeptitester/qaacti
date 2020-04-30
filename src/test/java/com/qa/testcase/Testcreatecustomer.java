package com.qa.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.jitubase.DriverScript;
import com.qa.pages.Loginpage;
import com.qa.pages.Taskpage;
import com.qa.pages.Timetrackpage;

public class Testcreatecustomer extends DriverScript {
	Loginpage lp;
	 Taskpage Tp;
	 Timetrackpage TT;
	public  Testcreatecustomer()
	{
		super();
    }
	@BeforeMethod
	public void pretest(){
		initapp();
		 lp = new Loginpage();
		  Tp = new Taskpage();
		 TT = new Timetrackpage();
	}
  @Test
   public void testcreatecustomer()
   {
	   lp.validatelogin("admin", "manager");
	String userlogged = TT.getuserloggedintext();
	System.out.println(userlogged);
	TT.taksmenu();
	Tp.addnew();
   }
}
