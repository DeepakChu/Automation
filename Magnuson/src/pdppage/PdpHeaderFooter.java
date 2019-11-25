package pdppage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class PdpHeaderFooter {
	
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
	public void PdpHeaderFooter()
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
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		System.out.println("Header Elements on Pdp page:");
		objhomepage.header_element();
		System.out.println("Footer Elements on Pdp page:");
		objhomepage.footer_element();
	}
	
	
	
}
