package Cart;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class Pinwith {

	
	
	public NavigationPage objnav = new NavigationPage();

	public WebDriver driver;
	public HomePage objhomepage;
	public PlpPage objplppage;
	public PdpPage objpdppage;
	

	@BeforeClass
	public void Loginpage() {

		driver = Config.chromePath();
		driver.get("https://dev-delhi.skorpoints.com/challenge_management/completed/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);
		objplppage = objnav.navigatetoplppage(driver);
	   objpdppage = objnav.navigatetopdp(driver);
	}
	
	@Test
	public void headerfooter() throws InterruptedException
	{
		/*
		 * objhomepage.popup1(); System.out.println("Header Elements on Home page:");
		 * objhomepage.header_element(); try { Thread.sleep(3000); } catch (Exception e)
		 * { // TODO: handle exception }
		 * System.out.println("Footer Elements on Home page:");
		 * objhomepage.footer_element();
		 */
		try 
		{ Thread.sleep(5000);
} 
		catch (Exception e)
		  {  
			}
		objhomepage.username();
		objhomepage.password();
		objhomepage.login();
		try 
		{ Thread.sleep(5000);
} 
		catch (Exception e)
		  {  
			}
		
		objhomepage.create();
		 Thread.sleep(5000);

		
		objhomepage.create1();
		 Thread.sleep(5000);

		
		objplppage.Title(driver);
		
	}	
}
