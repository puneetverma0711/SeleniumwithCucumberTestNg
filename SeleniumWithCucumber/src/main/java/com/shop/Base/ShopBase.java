package com.shop.Base;


import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import com.shop.Util.ShopUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;



public class ShopBase  {
	// public static Properties prop;
	 public static ResourceBundle resb;
	 public static WebDriver driver;
public static Wait<WebDriver> wait;
	
	public ShopBase() {
		
		try {
			
			resb=ResourceBundle.getBundle("Shop");

       } catch (Exception ex) {
           ex.printStackTrace();
       }
		
		
	}
	
	
	
	
	
	public  static void  initialization() {
		String browsername=resb.getString("browser");
		if(driver==null) { 
		if(browsername.equals("chrome")) {
			ChromeOptions options=new ChromeOptions();
			Map<String, Object> prefs=new HashMap<String,Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			//1-Allow, 2-Block, 0-default
			options.setExperimentalOption("prefs",prefs);
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); 
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
			
			
			
		}else if(browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();  
			driver=new FirefoxDriver();
			
		}
	
		}
		
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(ShopUtilities.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(ShopUtilities.IMPLICITWAIT_TIMEOUT, TimeUnit.SECONDS);
driver.get(resb.getString("url")); 

	
	}
	
	
	public static void quit() {
		
		driver.quit();
		driver=null;
		
	}
	
public static void close() {
		
		driver.close(); 
		driver=null;
		
	}
	
	
}
