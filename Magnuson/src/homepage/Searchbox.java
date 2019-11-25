package homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.HomePage;
import navigationpages.NavigationPage;
import utility.Config;

public class Searchbox {
	public NavigationPage objnav = new NavigationPage();

	public WebDriver driver;
	public HomePage objhomepage;
	

	@BeforeClass
	public void Loginpage() {

		driver = Config.chromePath();
		driver.get("https://www.braxton-bragg.com/");
		driver.manage().window().maximize();
		objhomepage = objnav.navigatetohomepage(driver);

}


@Test

	public void Searchbox()
	{

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		objhomepage.popup1();
		objhomepage.search_box();

	}

}