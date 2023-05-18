package test_method;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test_base.Hrms_base;
import test_page.Hrms_page;
import test_page.PharmEasy_page;

public class Hrms_method extends Hrms_base {
	Hrms_page hrms;
	public ExtentTest test;
	public ExtentReports extent;
	String actual;
	String title;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		hrms=new Hrms_page();
	}
	
	
	
	@BeforeTest
	public void x() 
	{
		
		extent=new ExtentReports("C:\\Users\\isrivastava\\eclipse-workspace\\Pharmeasy_application\\HrmsTest_ExecutionReport.html",true);	
	}
	
	@AfterTest
	public void y() 
	{
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=1)
	public void Username() throws InterruptedException
	{
		test=extent.startTest("Verify whether user name entered Successfully");
		test.log(LogStatus.INFO, " user name entered is intiated");
		test.log(LogStatus.INFO," user name entered Successfully");
		hrms.username().sendKeys("pratibha");
		Thread.sleep(1000);
		hrms.password().sendKeys("bebo123");
		hrms.password().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		title=driver.getTitle();
		System.out.println(title);
		actual="::: Human Resource Management System - bebo technologies";
		if(actual.contains(title)) {
			test.log(LogStatus.PASS, " Login successfully ");
		}
		else {
			test.log(LogStatus.FAIL,  "Login not  successfully");
		}
		assertEquals(actual,title);
	}
	
	
	
	
	@Test(priority=2)
	public void Information_centre() throws InterruptedException
	{
		test=extent.startTest("Verify whether Information centre is clicked Successfully");
		test.log(LogStatus.INFO, "Information centre is clicked intiated");
		test.log(LogStatus.INFO," Information centre is clicked Successfully");
		hrms.Information().click();
		Thread.sleep(1000);
		hrms.Memberlist().click();
		Thread.sleep(1000);
		title=driver.getTitle();
		System.out.println(title);
		actual="::: Human Resource Management System - bebo technologies";
		if(actual.contains(title)) {
			test.log(LogStatus.PASS, " Information  centre and member list clicked successfully ");
		}
		else {
			test.log(LogStatus.FAIL,  "Information  centre and member list  is not clicked successfully");
		}
		assertEquals(actual,title);
	}
	
	
	
	@Test(priority=3)
	public void  Search_type() throws InterruptedException
	{
		test=extent.startTest("Verify whether Search type is clicked  Successfully");
		test.log(LogStatus.INFO, " Search type is clicked  intiated");
		test.log(LogStatus.INFO," Search type is clicked Successfully");
		hrms.Searchtype().click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//option[text()='Member First Name']"));
		ac.moveToElement(w1);
		w1.click();
		title=driver.getTitle();
		System.out.println(title);
		actual="::: Human Resource Management System - bebo technologies";
		if(actual.contains(title)) {
			test.log(LogStatus.PASS, "Searched type is selected  successfully ");
		}
		else {
			test.log(LogStatus.FAIL,  "Searched type is not clicked successfully");
		}
		assertEquals(actual,title);
		}
	
	@Test(priority=4)
	public void  Search_for() throws InterruptedException
	{
		test=extent.startTest("Verify whether Search  for is clicked  Successfully");
		test.log(LogStatus.INFO, " Search for is clicked  intiated");
		test.log(LogStatus.INFO," Search for is clicked Successfully");
		hrms.Searchfor().sendKeys("Saniya");
		Thread.sleep(5000);
		hrms.Search().click();
		Thread.sleep(1000);
		hrms.Saniya().click();
		hrms.Joining().click();
		title=driver.getTitle();
		actual="::: Human Resource Management System - bebo technologies";
		if(actual.contains(title)) {
			test.log(LogStatus.PASS, "Searched  for is selected  successfully ");
		}
		else {
			test.log(LogStatus.FAIL,  "Searched  for is not clicked successfully");
		}
		assertEquals(actual,title);
	}
	
	@Test(priority=5)
	public void  User1_mailupadte() throws InterruptedException
	{
		test=extent.startTest("Verify whether mail  is entered and change Successfully");
		test.log(LogStatus.INFO, "mail and change is entered initiated");
		test.log(LogStatus.INFO,"mail and change  is entered Successfully");
		hrms.Mail().clear();
		hrms.Mail().sendKeys("arkumar@qasource.com");
		hrms.Update().click();
		Thread.sleep(1000);
		String actual="arkumar@qasource.com";
		String text= hrms.Mail().getAttribute("value");
		System.out.println(text);
		if(actual.contains(text)) {
			test.log(LogStatus.PASS, "Mail updated successfully ");
		}
		else {
			test.log(LogStatus.FAIL,  "Mail  is not updated successfully");
		}
		assertEquals(actual,text);
	}
	
	
	@Test(priority=6)
	public void  User2move_button() throws InterruptedException
	{
		test=extent.startTest("Verify Update button clicked   Successfully");
		test.log(LogStatus.INFO, "  Update button clicked   intiated");
		test.log(LogStatus.INFO," Update button clicked Successfully");
		driver.get("http://10.10.3.192/hrms/home.php#");
		hrms.Searchtype().click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//option[text()='Member First Name']"));
		ac.moveToElement(w1);
		w1.click();
		Thread.sleep(1000);
		title=driver.getTitle();
		System.out.println(title);
		actual="::: Human Resource Management System - bebo technologies";
		if(actual.contains(title)) {
			test.log(LogStatus.PASS, "Move to the information centre and member list  successfully ");
		}
		else {
			test.log(LogStatus.FAIL,  "Move to the information centre and member list  is not clicked successfully");
		}
		assertEquals(actual,title);
		}
	
	@Test(priority=7)
	public void  User2_button() throws InterruptedException
	{
		test=extent.startTest("Verify  moved to inforamtion centre    Successfully");
		test.log(LogStatus.INFO, "moved to inforamtion centre     intiated");
		test.log(LogStatus.INFO," moved to inforamtion centre   Successfully");
		hrms.Searchfor().sendKeys("Ratan");
		hrms.Search().click();
		hrms.user2().click();
		Thread.sleep(1000);
		title=driver.getTitle();
		System.out.println(title);
		actual="::: Human Resource Management System - bebo technologies";
		assertEquals(actual,title);
		}
	
	
	
	@Test(priority=8)
	public void  User2_mailupadte() throws InterruptedException
	{
		test=extent.startTest("Verify whether mail  is entered and change  Successfully");
		test.log(LogStatus.INFO, " mail and change is entered   intiated");
		test.log(LogStatus.INFO,"mail and change  is entered  Successfully");
		hrms.Joining().click();
		hrms.Mail().clear();
		hrms.Mail().sendKeys("arkumar@qasource.com");
		Thread.sleep(1000);
		hrms.Update().click();
		String actual="arkumar@qasource.com";
		String text= hrms.Mail().getAttribute("value");
		System.out.println(text);
		if(actual.contains(text)) {
			test.log(LogStatus.PASS, "Mail updated successfully ");
		}
		else {
			test.log(LogStatus.FAIL,  "Mail  is not updated successfully");
		}
		assertEquals(actual,text);
	}
	
	
	@Test(priority=9)
	public void  Mail3_button() throws InterruptedException
	{
		test=extent.startTest("Verify Update button clicked   Successfully");
		test.log(LogStatus.INFO, "  Update button clicked   intiated");
		test.log(LogStatus.INFO," Update button clicked Successfully");
		driver.get("http://10.10.3.192/hrms/home.php#");
		hrms.Searchtype().click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//option[text()='Member First Name']"));
		ac.moveToElement(w1);
		w1.click();
		Thread.sleep(1000);
		title=driver.getTitle();
		actual="::: Human Resource Management System - bebo technologies";
		assertEquals(actual,title);
		}
	
	@Test(priority=10)
	public void  User3_button() throws InterruptedException
	{
		test=extent.startTest("Verify  moved to inforamtion centre    Successfully");
		test.log(LogStatus.INFO, "moved to inforamtion centre     intiated");
		test.log(LogStatus.INFO," moved to inforamtion centre   Successfully");
		hrms.Searchfor().sendKeys("Sohail");
		hrms.Search().click();
		Thread.sleep(1000);
		title=driver.getTitle();
		System.out.println(title);
		actual="::: Human Resource Management System - bebo technologies";
		assertEquals(actual,title);
		}
	
	@Test(priority=11)
	public void  User3_movebutton() throws InterruptedException
	{
		test=extent.startTest("Verify  moved to  user 3 Successfully");
		test.log(LogStatus.INFO, "moved to  user 3intiated");
		test.log(LogStatus.INFO," moved to  user 3   Successfully");
		hrms.user3().click();
		Thread.sleep(1000);
		title=driver.getTitle();
		System.out.println(title);
		actual="::: Human Resource Management System - bebo technologies";
		assertEquals(actual,title);
		}
	
	@Test(priority=12)
	public void  User3_mailupadte() throws InterruptedException
	{
		test=extent.startTest("Verify whether mail  is entered and change  Successfully");
		test.log(LogStatus.INFO, " mail and change is entered   intiated");
		test.log(LogStatus.INFO,"mail and change  is entered  Successfully");
		hrms.Joining().click();
		hrms.Mail().clear();
		hrms.Mail().sendKeys("arkumar@qasource.com");
		hrms.Update().click();
		Thread.sleep(1000);
		String actual="arkumar@qasource.com";
		String text= hrms.Mail().getAttribute("value");
		System.out.println(text);
		if(actual.contains(text)) {
			test.log(LogStatus.PASS, "Mail updated successfully ");
		}
		else {
			test.log(LogStatus.FAIL,  "Mail  is not updated successfully");
		}
		assertEquals(actual,text);
		
	}
	
	
	@Test(priority=13)
	public void  user4_button() throws InterruptedException
	{
		test=extent.startTest("Verify Update button clicked   Successfully");
		test.log(LogStatus.INFO, "  Update button clicked   intiated");
		test.log(LogStatus.INFO," Update button clicked Successfully");
		driver.get("http://10.10.3.192/hrms/home.php#");
		hrms.Searchtype().click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//option[text()='Member First Name']"));
		ac.moveToElement(w1);
		w1.click();
		hrms.Searchfor().sendKeys("Shiya");
		hrms.Search().click();
		hrms.user4().click();
		Thread.sleep(1000);
		title=driver.getTitle();
		System.out.println(title);
		actual="::: Human Resource Management System - bebo technologies";
		assertEquals(actual,title);
		}
	
	@Test(priority=14)
	public void  Mail4_mailupadte() throws InterruptedException
	{
		test=extent.startTest("Verify whether mail  is entered and change  Successfully");
		test.log(LogStatus.INFO, " mail and change is entered   intiated");
		test.log(LogStatus.INFO,"mail and change  is entered  Successfully");
		hrms.Joining().click();
		hrms.Mail().clear();
		hrms.Mail().sendKeys("arkumar@qasource.com");
		hrms.Update().click();
		Thread.sleep(1000);
		String actual="arkumar@qasource.com";
		String text= hrms.Mail().getAttribute("value");
		System.out.println(text);
		if(actual.contains(text)) {
			test.log(LogStatus.PASS, "Mail updated successfully ");
		}
		else {
			test.log(LogStatus.FAIL,  "Mail  is not updated successfully");
		}
		assertEquals(actual,text);
		
	}
	
	/*@AfterMethod
	public void run()
	{
		if(actual.equals(title)) {
			test.log(LogStatus.PASS, "Data entered as well as login work properly");
		}
		else {
			test.log(LogStatus.FAIL, "Data entered as well as login is not  work  properly");
		}
	}*/
	@AfterSuite()
	public void close()
	{
		terminate();
	}
}
