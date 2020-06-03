package com.shop.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shop.Base.ShopBase;
import com.shop.Util.ShopUtilities;

public class ShopDashboardPage extends ShopBase {

	@FindBy(id="autocomplete")
	static WebElement searchbox;
	
	
	public ShopDashboardPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void searchText(String searchdata) {
		ShopUtilities.sendkeys(driver, searchbox, 15, searchdata);
		ShopUtilities.enter(driver, searchbox, 15);
	}
	
	public ShopProductListPage hitenteronsearchfield() {
		ShopUtilities.enter(driver, searchbox, 15);
		return new ShopProductListPage();
	}
	
	public String verifyproductpage() {
		return driver.getTitle();
		
	}
}
