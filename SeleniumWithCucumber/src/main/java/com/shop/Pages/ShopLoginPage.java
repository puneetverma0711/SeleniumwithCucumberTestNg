package com.shop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shop.Base.ShopBase;
import com.shop.Util.ShopUtilities;


public class ShopLoginPage extends ShopBase  {

	
	
	@FindBy(xpath="//div[@class='sc_rlinks_btm']/ul/li[position()=6]/a[contains(text(),'Sign In')]") 
	static WebElement signinlink;
	
	@FindBy(id="main_user_login") 
	static WebElement username;
	
	
	@FindBy(name="password") 
	static WebElement password;
	
	
	@FindBy(id="login_button")  
	static WebElement loginbtn;
	
	
	@FindBy(xpath="//a[contains(text(),'Hi Puneet')]")
	static WebElement shopdashboardpagetext;      
	 
	
	
	public ShopLoginPage() {
		PageFactory.initElements(ShopBase.driver, this);		
	}
	
	
	
	
	public void clickonsignbutton() {
		ShopUtilities.click(driver, signinlink);  
		
	}
	
	
	
	public  ShopDashboardPage login(String un, String pass) {
		ShopUtilities.sendkeys(driver, username, 20, un);
		ShopUtilities.sendkeys(driver, password, 20, pass);
		ShopUtilities.click(driver, loginbtn);  
		
		return new ShopDashboardPage();
		
	}
	
	
	public  String dashboardwelcometext() {
		return  ShopUtilities.gettext(driver, shopdashboardpagetext, 20);  
		
		
	}
	
	
	
}
