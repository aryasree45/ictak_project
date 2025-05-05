package pages;

import org.openqa.selenium.By;
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
}
