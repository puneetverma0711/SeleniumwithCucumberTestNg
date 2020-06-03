package com.shop.Util;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class ShopUtilities  {
	public static long PAGELOAD_TIMEOUT=40;
	public static long EXPLICITWAIT_TIMEOUT=25;
	public static long FLUENTWAIT_TIMEOUT=30;
	public static long FLUENTWAIT_POLLINGTIME=1;
	public static String DASHBOARD_Text="Hi";
	public static String PRODUCTPAGE_Text="Online Shopping Store | Buy Online: Mobiles Phone, Computers, Tablets Pc, Home Appliances | Lowest Price shop in India at ShopClues";
	public static JavascriptExecutor js;
	public static Assert asst;
	public static String searchdata="mobile";
	
	public static void sendkeys(WebDriver driver,WebElement element, int timeout,String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
 	
	}
	
	public static void enter(WebDriver driver,WebElement element, int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.ENTER);
 	
	}
	
	public static Assert verify(String actual,String expected) {
        asst.assertEquals(actual, expected);    
		return asst;
		
		
	}
	
	
	public static String gettext(WebDriver driver,WebElement element, int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
	return element.getText();
 	
	}
	
	public static void click(WebDriver driver,WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);

	}
	
}
