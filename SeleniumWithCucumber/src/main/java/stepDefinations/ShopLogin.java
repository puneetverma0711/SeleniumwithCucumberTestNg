package stepDefinations;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.core.util.Assert;

import com.shop.Base.ShopBase;
import com.shop.Pages.ShopDashboardPage;
import com.shop.Pages.ShopLoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class ShopLogin extends ShopBase {
	ShopLoginPage shoploginpage;
	ShopDashboardPage shopdashbaordpage;
	
	@Given("^user is on shopclues web page$")
	public void user_is_on_shopclues_web_page() throws Throwable {
	 ShopBase.initialization();
		
	}

	@Then("^user click on signin link$")
	public void user_click_on_signin_link() throws Throwable {
		shoploginpage=new ShopLoginPage(); 
		shoploginpage.clickonsignbutton();
		
		
	}

	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password) throws Throwable {
		Thread.sleep(5000);
		shopdashbaordpage=shoploginpage.login(username, password);
		
	}


	@Then("^user is on shopclues dashboardpage$")
	public void user_is_on_shopclues_dashboardpage() throws Throwable {
		String dashbaordtext=shoploginpage.dashboardwelcometext();
		String a[]=dashbaordtext.split(" ");
		assertEquals(a[0], "Hi"); 
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		ShopBase.quit();
	}
	
	
	
}
 

