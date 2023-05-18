package test_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_base.Hrms_base;

public class Hrms_page extends Hrms_base {
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='login_password']")
	WebElement password;
	
	@FindBy(xpath="//a[text()='Information Center']")
	WebElement informationcenter;
	
	@FindBy(xpath="//a[text()='Member List']")
	WebElement memberlist;
	
	@FindBy(xpath="//span[@id='select2-stype-container']")
	WebElement searchtype;
	
	@FindBy(xpath="//input[@id='course']")
	WebElement searchfor;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement search;
	
	@FindBy(xpath="//a[text()='Saniya Mittal']")
	WebElement saniya;
	
	@FindBy(xpath="//a[text()='Joining Details']")
	WebElement joining;
	
	@FindBy(xpath="//input[@name='mail_id']")
	WebElement mail;
	
	@FindBy(xpath="//input[@class='bluebutton']")
	WebElement update;
	
	@FindBy(xpath="//a[text()='Ratan Singh']")
	WebElement user2;
	
	@FindBy(xpath="//a[text()='Sohail Singh']")
	WebElement user3;
	
	@FindBy(xpath="//a[text()='Shiya Singh']")
	WebElement user4;
	
	public Hrms_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement username()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement Information()
	{
		return informationcenter;
	}
	public WebElement Memberlist()
	{
		return  memberlist;
	}
	public WebElement Searchtype()
	{
		return searchtype;
	}
	public WebElement Searchfor()
	{
		return searchfor;
	}
	public WebElement Search()
	{
		return search;
	}
	public WebElement Saniya()
	{
		return saniya;
	}
	public WebElement Joining()
	{
		return joining;
	}
	public WebElement Mail()
	{
		return mail;
	}
	public WebElement Update()
	{
		return update;
	}
	public WebElement user2()
	{
		return user2;
	}
	public WebElement user3()
	{
		return user3;
	}
	public WebElement user4()
	{
		return user4;
	}
}
