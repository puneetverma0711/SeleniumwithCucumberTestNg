package stepDefinations;

import java.util.Iterator;

import org.openqa.selenium.WebElement;

import com.shop.Base.ShopBase;
import com.shop.Pages.ShopDashboardPage;
import com.shop.Pages.ShopLoginPage;
import com.shop.Pages.ShopProductListPage;
import com.shop.Util.ShopUtilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ShopProductList extends ShopBase {
ShopLoginPage loginpage;
	ShopDashboardPage dashboardpage;
	ShopProductListPage productpage;
	
	@Given("^user is on product list page$")
	public void user_is_on_product_list_page() throws Throwable {
	   ShopBase.initialization();
	   loginpage=new ShopLoginPage();
	   loginpage.clickonsignbutton();
	   Thread.sleep(7000);   
	   dashboardpage=loginpage.login(resb.getString("username"), resb.getString("password"));
	   Thread.sleep(4000);
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
	

	
	@Then("^user quit the browser$")
	public void user_quit_the_browser() throws Throwable {
		ShopBase.quit();
	}
	
	
	
}
