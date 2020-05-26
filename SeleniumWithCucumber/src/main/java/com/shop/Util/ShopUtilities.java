package com.shop.Util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopUtilities  {
	public static long PAGELOAD_TIMEOUT=40;
	public static long IMPLICITWAIT_TIMEOUT=20;
	public static long EXPLICITWAIT_TIMEOUT=25;
	public static long FLUENTWAIT_TIMEOUT=30;
	public static long FLUENTWAIT_POLLINGTIME=1;
	public static String DASHBOARD_Text="Deals Summary";
	public static String CONTACTS_Text="Contacts";
	public static String COMPANIES_Text="Companies";
	public static String DEALS_Text="Deals";
	public static String TASKS_Text="Tasks";
	public static String CASES_Text="Cases";
	public static JavascriptExecutor js;
	
	public static void sendkeys(WebDriver driver,WebElement element, int timeout,String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
 	
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
