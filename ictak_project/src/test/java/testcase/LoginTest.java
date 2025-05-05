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
@Test
public void TC_2_1_3() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("icexample.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	String errmsg=lobj.errorMessage();
	Assert.assertEquals(errmsg, Expected_Message);
}
@Test
public void TC_2_1_4() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.blankusername();
	lobj.setPassword("0000");
	lobj.buttonClick();
	
}
@Test
public void TC_2_1_5(){
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.blankpassword();
	lobj.buttonClick();
	
}
@Test
public void TC_2_1_6() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.blankemailpassword();
	lobj.buttonClick();		
}
@Test

public void TC_3_1_1() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.pjtopic("Software Testing");
	lobj.pjduration("6");
	lobj.butadd();
	
	
}
@Test
public void TC_3_1_2() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.pjtopic("Software Testing");
	lobj.pjduration("6 months");
	lobj.butadd();
}
@Test

public void TC_3_1_3() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.pjtopic("Software Testing");
	lobj.blankDuration();
	lobj.butadd();
	lobj.alertmessage();

}
@Test
public void TC_5_1_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
	
}
@Test
public void TC_5_1_2()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("12301");
	lobj.buttonClick();
	String errmsg=lobj.errorMessage();
	Assert.assertEquals(errmsg, Expected_Message);
}
@Test
public void TC_5_1_3()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anand@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
	String errmsg=lobj.errorMessage();
	Assert.assertEquals(errmsg, Expected_Message);
}
@Test
public void TC_5_1_4()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.blankusername();
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();

}
@Test
public void TC_5_1_5()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.blankpassword();
	lobj.buttonClick();
	
}
@Test
public void TC_5_1_6()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.blankemailpassword();
	lobj.buttonClick();

	
	
}
@Test
public void TC_5_2_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
}
@Test
public void TC_5_3_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
	lobj.clickrefmaterial();
	}
@Test
public void TC_5_4_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
	lobj.clickrefmaterial();
	lobj.addrefmaterial();
	lobj.addtopic("HTML Basics ");
	lobj.enter_refmaterial("Tutorials Point");
	lobj.add_date("20/08/2024");
	lobj.add_url("https://example.com ");
	lobj.add_status("completed");
	lobj.submitbtn();
	lobj. alertmessage();
	}
@Test
public void TC_5_5_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
	lobj.clickrefmaterial();
	lobj.addrefmaterial();
	lobj.addtopic(" ");
	lobj.enter_refmaterial("Tutorials Point");
	lobj.add_date("20/08/2024");
	lobj.add_url(" ");
	lobj.add_status("completed");
	lobj.submitbtn();
	lobj.alertaddreference();
	}
@Test
public void TC_5_6_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
	lobj.clickrefmaterial();
	lobj.addrefmaterial();
	lobj.addtopic("JAVA");
	lobj.enter_refmaterial("Tutorials Point");
	lobj.add_date("16/08/2024");
	lobj.add_url("htt://example_com ");
	lobj.add_status("completed");
	lobj.submitbtn();
	lobj. alertmessage();
	}
@Test

public void TC_5_7_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
	lobj.viewbtn();
	}
@Test
public void TC_5_8_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
	lobj.logoutbtn();
	}
}