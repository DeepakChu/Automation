package plppage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PlpPage;
import utility.Config;

public class Sorting {

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
		public void Sorting() {
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
			System.out.println("List of products on PLP page before sorting:");
			objplppage.categoryproduct_list();
			System.out.println("List of products on PLP page after sorting:");
			objplppage.sorting_list();
		
		}

		
		
		
}
