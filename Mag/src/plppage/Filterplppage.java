package plppage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PlpPage;
import utility.Config;

public class Filterplppage {
	 public NavigationPage objnav = new NavigationPage();

		public WebDriver driver;
		public HomePage objhomepage;
		public PlpPage objplppage;
		

		@BeforeClass
		public void Loginpage() {

			driver = Config.chromePath();
			driver.get("https://www.braxton-bragg.com/");
			driver.manage().window().maximize();
			objhomepage = objnav.navigatetohomepage(driver);
			objplppage = objnav.navigatetoplppage(driver);

}
		
		@Test
		public void Filterplplist() {
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
			objplppage.price_link();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			objplppage.pricerange_link();
			System.out.println("Price range list after using filter from (INR 0.00-INR 7255.78)/n");
			objplppage.range_list();
			
		
		
		
		}	
		
		
}