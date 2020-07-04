package stepDefinations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.shop.Base.ShopBase;
import com.shop.Pages.ShopDashboardPage;
import com.shop.Pages.ShopLoginPage;
import com.shop.Pages.ShopProductListPage;
import com.shop.Util.ShopUtilities;
import com.shop.comparators.SortComparater;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ShopProductList extends ShopBase {
ShopLoginPage loginpage;
	ShopDashboardPage dashboardpage;
	ShopProductListPage productpage;
	static List<Integer> productprices=new ArrayList<Integer>();
	@Before
	public void user_is_on_product_list_page() throws Throwable {
	   ShopBase.initialization();
	   loginpage=new ShopLoginPage();
	   loginpage.clickonsignbutton();
	   //Thread.sleep(7000);   
	   dashboardpage=loginpage.login(resb.getString("username"), resb.getString("password"));
	 //  Thread.sleep(4000);
	   dashboardpage.searchText(ShopUtilities.searchdata);
	   productpage=dashboardpage.hitenteronsearchfield();
	    
	}

	
	@Then("^user get all the mobile related products$")
	public void user_get_all_the_mobile_related_products() throws Throwable {
		Iterator<WebElement> productlistiterator=ShopProductListPage.getmobileproducts().iterator();
		while(productlistiterator.hasNext()) {
			WebElement product=productlistiterator.next();
			String productname=ShopProductListPage.getproductName(product);		
				System.out.println("available mobile products: " +productname);

		}

		
	}
	
	
	
	@Then("^user get all the mobile related products price$")
	public void user_get_all_the_mobile_related_products_price() throws Throwable {
		
		Iterator<WebElement> productpricelistiterator=ShopProductListPage.getmobileproductsprice().iterator();
		
		while(productpricelistiterator.hasNext()) {
			WebElement product=productpricelistiterator.next();
			String productprice=ShopProductListPage.getproductName(product);
			String p[]=productprice.split("[^\\w]");
			storedprices(p[1]);

		}
		
		
	}
	
	
	
	@Then("^user get all the mobile related products price in asc order$")
	public void user_get_all_the_mobile_related_products_price_in_asc_order() throws Throwable {
		Collections.sort(productprices);
		  for(int price:productprices) {
			  System.out.println(price);    
			  
		  }
		
		
	}
	
	
	
	@Then("^user get all the mobile related products price in dsc order$")
	public void user_get_all_the_mobile_related_products_price_in_dsc_order() throws Throwable {
		Collections.sort(productprices,new SortComparater());
		  for(int price:productprices) {
			  System.out.println(price);    
			  
		  }
		
		
	}
		
		
		
		
	
	

	@After
	public void user_quit_the_browser() throws Throwable {
		ShopBase.quit();
	}
	
	
	public static List<Integer> storedprices(String price){
		productprices.add(Integer.parseInt(price));
		return productprices;
	}
	
	
	
}
