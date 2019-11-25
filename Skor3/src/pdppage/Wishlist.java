package pdppage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class Wishlist {

	 public NavigationPage objnav = new NavigationPage();

		public WebDriver driver;
		public HomePage objhomepage;
		public PlpPage objplppage;
		public PdpPage objpdppage;
		

		@BeforeClass
		public void Loginpage() {

			driver = Config.chromePath();
			driver.get("https://www.braxton-bragg.com/");
			driver.manage().window().maximize();
			objhomepage = objnav.navigatetohomepage(driver);
			objplppage = objnav.navigatetoplppage(driver);
		   objpdppage = objnav.navigatetopdp(driver);
		}



@Test
public void Wishlist() {
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
	objpdppage.wishlist();
	System.out.println("Wishlist Link is present");
	objpdppage.email();
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	objpdppage.password();
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	objpdppage.signinlink();
	System.out.println( "Product added in WishList");
	


}
}