package stepDefinations;

import static org.testng.Assert.assertEquals;

import com.shop.Base.ShopBase;
import com.shop.Pages.ShopDashboardPage;
import com.shop.Pages.ShopLoginPage;
import com.shop.Pages.ShopProductListPage;
import com.shop.Util.ShopUtilities;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ShopDashboard extends ShopBase {
ShopLoginPage loginpage;
ShopDashboardPage dashboardpage;
ShopProductListPage productpage;	
	
	@Given("^user is on dashbaord page$")
	public void user_is_on_dashbaord_page() throws Throwable {
	    ShopBase.initialization();
	   loginpage=new ShopLoginPage(); 
	   loginpage.clickonsignbutton();
	    dashboardpage=loginpage.login(ShopBase.resb.getString("username"), ShopBase.resb.getString("password")); 
	}

	@Then("^user type \"([^\"]*)\" into the search field$")
	public void user_type_into_the_search_field(String searchdata) throws Throwable {
		// Thread.sleep(5000);
		dashboardpage.searchText(ShopUtilities.searchdata);
	}
	
	

	@Then("^user hit enter into the search field$")
	public void user_hit_enter_into_the_search_field() throws Throwable {
		productpage=dashboardpage.hitenteronsearchfield();
	}

	@Then("^user is on product detail page$")
	public void user_is_on_product_detail_page() throws Throwable {
	    String actualpagetitle=dashboardpage.verifyproductpage();
	    ShopUtilities.verify(actualpagetitle,ShopUtilities.PRODUCTPAGE_Text);
	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		ShopBase.quit();
	}
	
	
}
