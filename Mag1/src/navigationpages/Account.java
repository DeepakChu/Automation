package navigationpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account {

	
	
	@FindBy(xpath="(//*[@class=\"action switch\"])[2]")
	WebElement account;
	@FindBy(xpath="(//*[@href=\"http://kttapeb2b.commercestaging.com/customer/account/\"])[2]")
	WebElement myaccount;
	@FindBy(xpath="(//*[@class=\"action edit\"])[2]")
	WebElement editname;
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement firsteditname;
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lasteditname;
	@FindBy(xpath="//*[@class=\"action save primary\"]")
	WebElement saveaccountnameinfo;
	@FindBy(xpath="//*[@class=\"message-success success message\"]")
	WebElement infotext;
	public void editname()
	{
		account.click();
		myaccount.click();
		editname.click();
		firsteditname.clear();
		firsteditname.sendKeys("Lakshay");
		lasteditname.clear();
		lasteditname.sendKeys("Ahuja");
		saveaccountnameinfo.click();
		System.out.println("Message after editing first name and last name"+infotext.getText());
	}
}
