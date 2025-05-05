package testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AdminMentorLogin;

public class LoginTest extends TestBase{
	String Expected_Home="Admin Dashboard";
	String  Expected_Message="Invalid username or password";
	AdminMentorLogin lobj;
	@BeforeClass
	public void objinit()
	{
		lobj=new AdminMentorLogin(driver);
		
	}
	
@Test
public void TC_1_1_1() throws InterruptedException 
{
	
	lobj.logbuttonclk();		
}
@Test
public void TC_2_1_1() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	String act_result=lobj.adminDashboard();
	Assert.assertEquals(act_result,Expected_Home);
	}
@Test
public void TC_2_1_2() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("1111");
	lobj.buttonClick();
	String errmsg=lobj.errorMessage();
	Assert.assertEquals(errmsg, Expected_Message);
}
}