package com.shop.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shop.Base.ShopBase;

public class ShopProductListPage extends ShopBase {

	
	@FindBy(xpath="//h2")  
	static List<WebElement> products;
	
	@FindBy(xpath="//span[@class='p_price']")    
	static List<WebElement> productsprice;
	
	
	public ShopProductListPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public static List<WebElement>  getmobileproducts() {
	
		return products;
		
	}
	
	
	public static List<WebElement>  getmobileproductsprice() {
		
		return productsprice;
		
	}
	
	
	public static String getproductName(WebElement product) {	
		return product.getText();
	
	}
	
	
	
	
	
}
