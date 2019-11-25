package navigationpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class PdpPage {
	
	@FindBy(xpath = "//*[@href=\"https://www.braxton-bragg.com/alpha-dry-core-bit-1-1-2-in-8365.html\"]/img")
	WebElement productname;

	@FindBy(xpath = "//*[@class=\"action towishlist\"]")
	WebElement wishlist;

	@FindBy(xpath = "//*[@id=\"email\" and @name=\"login[username]\"]")
	WebElement email;

	@FindBy(xpath = "//*[@id=\"pass\" and @name=\"login[password]\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"send2\"]")
	WebElement signinlink;
	
	@FindBy(xpath = "//*[@class=\"product media\"]")
	WebElement Pdpimagetest;
	
	@FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
	WebElement AddtoCartLink;
	
	@FindBy(xpath = "//*[@class=\"message-success success message\"]")
	WebElement addtocartmessage;

	@FindBy(xpath = "//*[@class=\"page-title-wrapper product\"]")
	WebElement pdpitemtitle;
	
	@FindBy(xpath = "//*[@class=\"product attribute description\"]")
	WebElement pdpitemoverview;
	
	@FindBy(xpath = "//*[@id=\"qty\"]")
	WebElement pdpitemquantity;
	
	@FindBy(xpath = "//*[@class=\"header-menu-outer\"]")
	WebElement pdpmenu;


	public void productname()
	{
		productname.click();	}
		
	public void wishlist()
{
		wishlist.click();	}

		public void email()
		{
			email.click();
			email.sendKeys("deepak11@gmail.com");
		}

	
		public void password()
		{
			password.click();	
		   password.sendKeys("87501501cd@");
		}
	
		public void signinlink()
		{
			signinlink.click();	
			System.out.println(signinlink.getText());
		}
		
		public void imagetest()
		{
			if (Pdpimagetest.isDisplayed()) {
				System.out.println("Image is present on PDP page");
			}

			else {
				System.out.println("Image is not present on PDP page");
			}
		}
		
		public void addtocart()
		{
			System.out.println(AddtoCartLink.getText());
			AddtoCartLink.click();	
		   
		}
	
		public void addtocartmessage()
		{
			System.out.println(addtocartmessage.getText());
			
		   
		}
		
		public void PDPdata()
		{
			System.out.println("Product Title is :");
			System.out.println(pdpitemtitle.getText());
			System.out.println("Product description is :");
			System.out.println(pdpitemoverview.getText());
			System.out.println("Product Quantity is :");
			System.out.println(pdpitemquantity.getAttribute("value"));
			
		   
		}
		
		public void pdpmenu()
		{
			System.out.println(pdpmenu.getText());
			
		   
		}
}
