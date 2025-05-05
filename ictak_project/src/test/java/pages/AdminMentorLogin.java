package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminMentorLogin {
	WebDriver driver;
	public AdminMentorLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void logbuttonclk()
	{
		WebElement logbtn=driver.findElement(By.xpath("//button[@class='btn2']"));
		logbtn.click();
	}
public void setEmail(String mailid)
{
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys(mailid);
	
}
public void setPassword(String pass)
{
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys(pass);
}
public void buttonClick()
{
	WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
	button.click();
}
public String adminDashboard()
{
	WebElement admindash=driver.findElement(By.xpath("//div[text()='Admin Dashboard']"));
	String getText=admindash.getText();
	return getText;
}
public String errorMessage()
{
	WebElement errormsg = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-1tmw1eq']"));
	String error=errormsg.getText();
	return error;
}
public void blankusername() {
	WebElement emailField = driver.findElement(By.name("email"));
	String validationMessage = (String)((JavascriptExecutor) driver)
	    .executeScript("return arguments[0].validationMessage;", emailField);
	System.out.println("Validation Message: " + validationMessage);

}
public void blankpassword() {
	WebElement passwordField = driver.findElement(By.name("password"));
	String validationMessage = (String)((JavascriptExecutor) driver)
	        .executeScript("return arguments[0].validationMessage;", passwordField);

	    System.out.println("Validation Message (blank password): " + validationMessage);
}
public void blankemailpassword() {
	 WebElement emailField = driver.findElement(By.name("email"));
	 //   WebElement passwordField = driver.findElement(By.name("password"));
	    String validationMessage = (String)((JavascriptExecutor) driver)
	            .executeScript("return arguments[0].validationMessage;", emailField);

	        System.out.println("Validation Message (blank email and password): " + validationMessage);
}
public void addProj() {
	WebElement addpj=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']"));
	addpj.click();
}
public void pjtopic(String top) {
	WebElement topic=driver.findElement(By.xpath("//input[@name='topic']"));
	topic.sendKeys(top);
}
public void pjduration(String duration) {
	WebElement dur=driver.findElement(By.xpath("//input[@name='duration']"));
	dur.sendKeys(duration);
}
public void butadd() {
	WebElement add=driver.findElement(By.xpath("//button[text()='Add']"));
	add.click();
}
public void blankDuration()   {
	WebElement durationField = driver.findElement(By.name("duration"));
    String validationMessage = (String)((JavascriptExecutor) driver)
            .executeScript("return arguments[0].validationMessage;", durationField);

    System.out.println("Validation Message (blank duration): " + validationMessage);
   
}
public void alertmessage()
{
	try {
	Alert alert=driver.switchTo().alert();
	String alerttext=alert.getText();
	System.out.println("Alert message:"+alerttext);
	alert.accept();
	}catch(NoAlertPresentException e) {
		System.out.println("no alert is present "+e.getRawMessage());
	}catch (Exception e) {
        System.out.println("Unhandled exception occurred: " + e.getMessage());
	}
}
public String mentorDashboard()
{
	WebElement mentordash=driver.findElement(By.xpath("[//div[text()='Dashboard']"));
	String getText=mentordash.getText();
	return getText;
}
public void clickrefmaterial()
{
	WebElement ref_material=driver.findElement(By.xpath("//span[text()='Reference Materials']"));
	ref_material.click();
	
}
public void addrefmaterial()
{
	WebElement refmaterialbtn=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1ob9j0a']"));
	refmaterialbtn.click();
}
public void addtopic(String topics)
{
	WebElement topic=driver.findElement(By.xpath("//input[@name='topic']"));
	topic.sendKeys(topics);
}
public void enter_refmaterial(String reference)
{
	WebElement addrefmaterial=driver.findElement(By.id("referenceMaterial"));
	addrefmaterial.sendKeys(reference);
}
public void add_date(String date)
{
	WebElement dates=driver.findElement(By.id("postedDate"));
	dates.sendKeys(date);
}
public void add_url(String url)
{
	WebElement urls=driver.findElement(By.id("url"));
	urls.sendKeys(url);
}
public void add_status(String stat)
{
	WebElement status=driver.findElement(By.id("status"));
	status.sendKeys(stat);
}
public void submitbtn()
{
	WebElement subbtn=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-125w45g']"));
	subbtn.click();
}
public void cancelbtn()
{
	WebElement canbtn=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorSecondary MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorSecondary css-1b51foz']"));
	canbtn.click();
}
/*public void addreferencealert()
{
	try {
	Alert alert2=driver.switchTo().alert();
	String alerttext2=alert2.getText();
	System.out.println("Alert message:"+alerttext2);
	alert2.accept();
	}catch(NoAlertPresentException e) {
		System.out.println("no alert is present"+e.getRawMessage());
	}catch (Exception e) {
        System.out.println("Unhandled exception occurred: " + e.getMessage());
	}
}*/
public void alertaddreference()   {
	WebElement topic=driver.findElement(By.xpath("//input[@name='topic']"));
	WebElement urls=driver.findElement(By.id("url"));
    String validationMessage = (String)((JavascriptExecutor) driver)
            .executeScript("return arguments[0].validationMessage;", topic);

    System.out.println("Validation Message (blank topic and blank url): " + validationMessage);
   
}

public void blanktopicurl()
{
	WebElement topic=driver.findElement(By.xpath("//input[@name='topic']"));
	//WebElement urls=driver.findElement(By.id("url"));
	 String validationMessage = (String)((JavascriptExecutor) driver)
	            .executeScript("return arguments[0].validationMessage;", topic);

	        System.out.println("Validation Message (blank topic and url): " + validationMessage);
}
public void viewbtn()
{
	WebElement viewbutton=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary view-button css-iq9zr2"
			+ "']"));
	viewbutton.click();
}
public void logoutbtn()
{
	WebElement logout=driver.findElement(By.xpath("//span[text()='Logout']"));
	logout.click();
	
}
}
