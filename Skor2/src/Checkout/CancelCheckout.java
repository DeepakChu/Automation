package Checkout;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.CartPage;
import navigationpages.CheckoutPage;
import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class CancelCheckout {
	
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
		
	    public void CancelCheckout()
		
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
objcheckout.Checkout_cancel();
	    System.out.println("Checkout has benn cancelled successfully");
	    
	    
	    }		
		
		
		
		
		
		
}