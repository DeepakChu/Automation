package Checkout;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import navigationpages.CartPage;
import navigationpages.CheckoutPage;
import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class CheckoutProcess {
	
	 public NavigationPage objnav = new NavigationPage();

		public WebDriver driver;
		public HomePage objhomepage;
		public PlpPage objplppage;
		public PdpPage objpdppage;
		public CartPage objcartpage ;
		public CheckoutPage objcheckout;

		@BeforeClass
		public void Loginpage() {

			driver = Config.chromePath();
			driver.get("https://www.braxton-bragg.com/");
			driver.manage().window().maximize();
			objhomepage = objnav.navigatetohomepage(driver);
			objplppage = objnav.navigatetoplppage(driver);
			 objpdppage = objnav.navigatetopdp(driver);
			objcartpage=objnav.navigatetocartpage(driver);
			objcheckout=objnav.navigatetocheckoutpage(driver);
		}			
		
		@Test
		
	    public void CheckoutProcess()

	    
	    
	    {
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				objhomepage.popup1();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			objplppage.categorylist_link();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			objplppage.polish_link();
			objpdppage.productname();
			objpdppage.addtocart();
			System.out.println("Message after product is added:");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			objpdppage.addtocartmessage();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			objcartpage.showcart_link();
			objcheckout.Checkout_link();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			objcheckout.Email();
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			objcheckout.Password();
			objcheckout.Signin_button();
			try {
				Thread.sleep(15000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			objcheckout.Checkout_form();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			objcheckout.Radio_button();
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			objcheckout.Payment_info();
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		objcheckout.Payment_Gateway(driver);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			objcheckout.Place_Order();
	    
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		try
		{

		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./screenshot/"+"checkoutvalidationerror"+".png"));
		System.out.println("screenshot Taken");
		}
		catch(Exception e)
		{
		System.out.println("Exception while taking screenshot"+e.getMessage());
		}

		
		/*@AfterTest
		public void quit()
		{
			driver.quit();
		}*/
		
}
}