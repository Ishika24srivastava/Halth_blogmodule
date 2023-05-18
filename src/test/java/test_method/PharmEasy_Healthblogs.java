package test_method;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test_base.PharmEasy_base;
import test_page.PharmEasy_page;

public class PharmEasy_Healthblogs extends PharmEasy_base {
	
	PharmEasy_page pharmeasyhealthblogs;
	public ExtentTest test;
	public ExtentReports extent;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		pharmeasyhealthblogs=new PharmEasy_page();
	}
	
	
	
	@BeforeTest
	public void x() 
	{
		
		extent=new ExtentReports("./reports\\Healthblogs_testexecutionReport1.html",true);	
	}
	
	
	@AfterTest
	public void y() 
	{
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=1)
	public void Healthblogs() throws InterruptedException
	{
		test=extent.startTest("Verify whether Health blogs page  Loads Successfully");
		test.log(LogStatus.INFO, "Health  blogs page load  is intiated");
		test.log(LogStatus.INFO,"Health blogs page  Successfully");
		pharmeasyhealthblogs.Healthblog_module();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String actual="https://pharmeasy.in/blog/category/chronic-ailments/hypertension/";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Health blog page  loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Health blog page is not loaded properly");
		}
		assertEquals(actual,url);
		
	}
	
	@Test(priority=2)
	public void Cranberry() throws InterruptedException
	{
		test=extent.startTest("Verify whether  Cranberry  page  Loads Successfully");
		test.log(LogStatus.INFO, "Cranberry page load  is intiated");
		test.log(LogStatus.INFO,"Cranberry page  Successfully");
		pharmeasyhealthblogs.Cranberry();
		String titile=driver.getTitle();
		String actual="क्रैनबेरी (Cranberry in hindi): उपयोग, लाभ, साइड इफ़ेक्ट, और अन्य जानकारी! - PharmEasy Blog";
		if(actual.equals(titile)) {
			test.log(LogStatus.PASS, "Cranberry nutrition details  loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Cranberry nutrition details is not loaded properly");
		}
		assertEquals(actual,titile);
		}
	
	
	
	@Test(priority=3)
	public void Thyroid()
	{
		test=extent.startTest("Verify whether Thyroid  page Loads Successfully");
		test.log(LogStatus.INFO, "Thyroid  page load  is intiated");
		test.log(LogStatus.INFO,"Thyroid  page load Successfully");
		pharmeasyhealthblogs.Thyroid_h();
		String titile=driver.getTitle();
		String actual="Chronic Ailments Archives - PharmEasy Blog";
		if(actual.equals(titile)) {
			test.log(LogStatus.PASS, "Cranberry  use details  loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Cranberry use  details is not loaded properly");
		}
		assertEquals(actual,titile);
	}
	
	@Test(priority=4)
	public void Home_remedies() throws InterruptedException
	{
		test=extent.startTest("Verify whether Home remedies  page Loads Successfully");
		test.log(LogStatus.INFO, "Home remedies  page load  is intiated");
		test.log(LogStatus.INFO,"Home remedies  page load Successfully");
		pharmeasyhealthblogs.Homeremedies();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String actual="https://pharmeasy.in/blog/category/home-remedies/";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Home remedies pag loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Home remedies page is not loaded properly");
		}
		assertEquals(actual,url);
	}
	
	@Test(priority=5,enabled=false)
	public void Blog_page() throws InterruptedException
	{
		test=extent.startTest("Verify whether Blog  page Loads and deatils viewed Successfully");
		test.log(LogStatus.INFO, "Blog  page Loads and deatils viewed is intiated");
		test.log(LogStatus.INFO,"Blog  page Loads and deatils viewed Successfully");
		pharmeasyhealthblogs.Blogpage();
		String url=driver.getCurrentUrl();
		String actual="https://pharmeasy.in/blog/ayurveda-uses-benefits-side-effects-of-tomato-juice/";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Blog  page Loads and deatils viewed properly");
		}
		else {
			test.log(LogStatus.FAIL, "Blog  page Loads and deatils viewed is not properly");
		}
		assertEquals(actual,url);
	}
	
	@Test(priority=6,enabled=false)
	public void Lifestyles() throws InterruptedException
	{
		test=extent.startTest("Verify whether Lifestyles and Ayureda page  Loads and deatils viewed Successfully");
		test.log(LogStatus.INFO, "Lifestyles and Ayureda page loads  and deatils viewed is intiated");
		test.log(LogStatus.INFO,"Lifestyles and Ayureda page  Loads and deatils viewed Successfully");
		pharmeasyhealthblogs.Lifestyle();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String actual="https://pharmeasy.in/blog/category/lifestyle/ayurveda/";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Blog  page Loads and deatils viewed properly");
		}
		else {
			test.log(LogStatus.FAIL, "Blog  page Loads and deatils viewed is not properly");
		}
		assertEquals(actual,url);
	}
	
	@Test(priority=7,enabled=false)
	public void Ayurveda() throws InterruptedException
	{
		test=extent.startTest("Verify whether best blogs content viewed Successfully");
		test.log(LogStatus.INFO, "Best blogs content viewed is intiated");
		test.log(LogStatus.INFO,"Best blogs content viewed Successfully");
		pharmeasyhealthblogs.Ayurved();
		String url=driver.getTitle();
		String actual="Ayurveda Archives - PharmEasy Blog";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Email entered and subscribed properly");
		}
		else {
			test.log(LogStatus.FAIL, "Email entered and subscribed is not properly");
		}
		assertEquals(actual,url);
	}
	
	
	
	@Test(priority=8,enabled=false)
	public void Email() throws InterruptedException
	{
		test=extent.startTest("Verify whether email entered and subscribed Successfully");
		test.log(LogStatus.INFO, "Email entered and subscribed is intiated");
		test.log(LogStatus.INFO,"Email entered and subscribed Successfully");
		pharmeasyhealthblogs.Email();
		String url="abc@gmail.com";
		String actual=driver.findElement(By.xpath("(//input[@placeholder='Enter Your Email ID'])[2]")).getAttribute("value");
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Email entered and subscribed properly");
		}
		else {
			test.log(LogStatus.FAIL, "Email entered and subscribed is not properly");
		}
		assertEquals(actual,url);
	}
	
	@Test(priority=9,enabled=false)
	public void Wellness() throws InterruptedException
	{
		test=extent.startTest("Verify whether wellness page loaded  Successfully");
		test.log(LogStatus.INFO, "wellness page loaded is intiated");
		test.log(LogStatus.INFO,"wellness page loaded Successfully");
		pharmeasyhealthblogs.Wellness();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		/*if(actual.equals(url)) {
			test.log(LogStatus.PASS, "wellness page loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "wellness page is not loaded  properly");
		}
		assertEquals(actual,url);*/
	}
	
	@Test(priority=10,enabled=false)
	public void  Health_todays() throws InterruptedException
	{
		test=extent.startTest("Verify whether  health todays  and other desired  page loaded  Successfully");
		test.log(LogStatus.INFO, " Health todays  and other desired  page  is intiated");
		test.log(LogStatus.INFO," Health todays  and other desired  page loaded  Successfully");
		pharmeasyhealthblogs.Healthtoday();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		/*if(actual.equals(url)) {
			test.log(LogStatus.PASS, "wellness page loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "wellness page is not loaded  properly");
		}
		assertEquals(actual,url);*/
	}
	
}
