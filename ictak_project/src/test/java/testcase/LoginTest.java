package testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AdminMentorLogin;

public class LoginTest extends TestBase{
	String Expected_Home="Admin Dashboard";
	String  Expected_Message="Invalid username or password";
	String Expected_msg="404: NOT_FOUND";
	AdminMentorLogin lobj;
	@BeforeClass
	public void objinit()
	{
		lobj=new AdminMentorLogin(driver);
		
	}
	
@Test(priority=1)
public void TC_1_1_1() throws InterruptedException 
{
	
	lobj.logbuttonclk();		
}
@Test(priority=2)
public void TC_2_1_1() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	String act_result=lobj.adminDashboard();
	Assert.assertEquals(act_result,Expected_Home);
	}
@Test(priority=3)
public void TC_2_1_2() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("1111");
	lobj.buttonClick();
	String errmsg=lobj.errorMessage();
	Assert.assertEquals(errmsg, Expected_Message);
}
@Test(priority=4)
public void TC_2_1_3() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("icexample.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	String errmsg=lobj.errorMessage();
	Assert.assertEquals(errmsg, Expected_Message);
}
@Test(priority=5)
public void TC_2_1_4() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.blankusername();
	lobj.setPassword("0000");
	lobj.buttonClick();
	
}
@Test(priority=6)
public void TC_2_1_5(){
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.blankpassword();
	lobj.buttonClick();
	
}
@Test(priority=7)
public void TC_2_1_6() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.blankemailpassword();
	lobj.buttonClick();		
}
@Test(priority=8)

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
@Test(priority=9)
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
@Test(priority=10)

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

}
@Test(priority=11)

public void TC_3_1_4() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.blankTopic();
	lobj.pjduration("6 months");
	lobj.butadd();
	
	
}
@Test(priority=12)

public void TC_3_1_5() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.blankDurtopic();
	lobj.butadd();
	
	
}
@Test(priority=13)
public void TC_3_1_6() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.pjtopic("@#$%%%&**(");
	lobj.pjduration("+-**///");
	lobj.butadd();
	lobj.invalidFormats();
	
}
@Test(priority=14)
public void TC_3_1_7() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.pjtopic("@#$%%%&**( ");
	lobj.pjduration("8888");
	lobj.butadd();
	lobj.invalidFormats();
	
}
@Test(priority=15)
public void TC_3_1_8() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.pjtopic("abcdef+*-/*/*/");
	lobj.pjduration("+*-*/**-++");
	lobj.butadd();
	lobj.invalidFormats();
	
}
@Test(priority=16)

public void TC_3_1_9() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.pjtopic("Software Tester");
	lobj.pjduration("Months");
	lobj.butadd();
	lobj.invalidFormats();
}
@Test(priority=17)
public void TC_3_2_1() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.pjtopic("Software Tester");
	lobj.pjduration("6 Months");
	lobj.butadd();
	lobj.editmodifybutton();
	lobj.clearfields();
	lobj.pjtopic("Software Engineer");
	lobj.pjduration("6");
	lobj.updatebutton();		
}
@Test(priority=18)
public void TC_3_2_2() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.pjtopic("Software Tester");
	lobj.pjduration("6 Months");
	lobj.butadd();
	lobj.editmodifybutton();
	lobj.clearfields();
	lobj.pjtopic("Software Tester");
	lobj.pjduration("8");
	lobj.updatebutton();		
	
}
@Test(priority=19)
public void TC_3_2_3() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.pjtopic("Software Tester");
	lobj.pjduration("6 Months");
	lobj.butadd();
	lobj.editmodifybutton();
	lobj.clearfields();
	lobj.pjtopic("Python");
	lobj.pjduration("4");
	lobj.updatebutton();	
	
}
@Test(priority=20)
public void TC_3_3_1() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.addProj();
	lobj.pjtopic("COBOL");
	lobj.pjduration("1");
	lobj.butadd();
	lobj.deletebut();
	lobj.okbutton();
}
@Test(priority=21)
public void TC_4_1_1() {
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("ictak@example.com");
	lobj.setPassword("0000");
	lobj.buttonClick();
	lobj.logout();
	driver.get("https://ictak-internship-portal-client.vercel.app/admin");
	String error=lobj.errorcode();
	Assert.assertEquals(error, Expected_msg);
	
	
}
@Test(priority=22)
public void TC_5_1_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
	
}
@Test(priority=23)
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
@Test(priority=24)
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
@Test(priority=25)
public void TC_5_1_4()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.blankusername();
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();

}
@Test(priority=26)
public void TC_5_1_5()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.blankpassword();
	lobj.buttonClick();
	
}
@Test(priority=27)
public void TC_5_1_6()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.blankemailpassword();
	lobj.buttonClick();

	
	
}
@Test(priority=28)
public void TC_5_2_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
}
@Test(priority=29)
public void TC_5_3_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
	lobj.clickrefmaterial();
	}
@Test(priority=30)
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
@Test(priority=31)
public void TC_5_5_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
	lobj.clickrefmaterial();
	lobj.addrefmaterial();
	lobj.blanktopicurl();
	lobj.enter_refmaterial("Tutorials Point");
	lobj.add_date("20/08/2024");
	lobj.add_status("completed");
	lobj.submitbtn();
	}
@Test(priority=32)
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
@Test(priority=33)

public void TC_5_7_1()
{
	driver.get("https://ictak-internship-portal-client.vercel.app/");
	lobj.logbuttonclk();
	lobj.setEmail("anandhu@example.com");
	lobj.setPassword("Mentor@1234");
	lobj.buttonClick();
	lobj.viewbtn();
	}
@Test(priority=34)
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