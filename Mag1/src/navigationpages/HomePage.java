package navigationpages;

import java.util.List;

import org.apache.xalan.xsltc.compiler.sym;
//import org.omg.PortableServer.POAPackage.ObjectAlreadyActiveHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class HomePage {

	public WebDriver driver;
	
    @FindBy(xpath="(//*[@class=\"DismissButton__closeButtonImage-spg526-0 kzJcQX ResetElements__Img-sc-8e6zl9-4 needsclick DismissButton__closeButtonImage-spg526-0 kzJcQX dXiMfc\"])[1]")
	WebElement popup;
	@FindBy(xpath="//*[@class=\"logo\"]")
	WebElement logo;
	@FindBy(xpath="(//*[@href=\"http://kttapeb2b.commercestaging.com/company/account/create/\"])[3]")
	WebElement dealeraccount;
	@FindBy(xpath="//*[@id=\"company_name\"]")
	WebElement companyname;
	@FindBy(xpath="//*[@id=\"legal_name\"]")
	WebElement companylegalname;
	@FindBy(xpath="//*[@id=\"company_email\"]")
	WebElement companyemail;
	@FindBy(xpath="//*[@id=\"street0\"]")
	WebElement street;
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	@FindBy(xpath="//*[@id=\"region_id\"]")
	WebElement state;
	@FindBy(xpath="//*[@id=\"postcode\"]")
	WebElement postalcode;
	@FindBy(xpath="//*[@id=\"telephone\"]")
	WebElement telephone;
	@FindBy(xpath="//*[@id=\"email_address\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"gender\"]")
	WebElement gender;
	@FindBy(xpath="//*[@class=\"action save primary\"]")
	WebElement submit;
	@FindBy(xpath="//*[@class=\"message-success success message\"]")
	WebElement successmsg;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement loginemail;
	@FindBy(xpath="(//*[@id=\"pass\"])[1]")
	WebElement loginpass;
	@FindBy(xpath="(//*[@id=\"send2\"])[1]")
	WebElement signin;
	@FindBy(xpath="//*[@id=\"newsletter\"]")
	WebElement subscription;
	@FindBy(xpath="//*[@class=\"action subscribe primary\"]")
	WebElement subscriptionclick;
	@FindBy(xpath="//*[@class=\"message-success success message\"]")
	WebElement subscriptionmsg;
	public void headerlogo()
	{
		if(logo.isDisplayed())
		{
			System.out.println("Logo is present on gated page");
		}
	}
	
	public void popup()
	{
	popup.click();
	}
	
	public void applyfordealer(WebDriver driver)
	{
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", dealeraccount);
		//dealeraccount.click();
		companyname.sendKeys("YSPL");
		companylegalname.sendKeys("QAYSPL");
		companyemail.sendKeys("qayspl123@gmail.com");
		street.sendKeys("276/8 california");
		city.sendKeys("california");
		Select objstate = new Select(state);
		objstate.selectByVisibleText("California");
		postalcode.sendKeys("19001");
		telephone.sendKeys("8222835572");
		email.sendKeys("lakshay12345@gmail.com");
		firstname.sendKeys("lakshay");
		lastname.sendKeys("Ahuja");
		Select objgender = new Select(gender);
		objgender.selectByVisibleText("Male");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		submit.click();
		System.out.println("Message after apply dealer account"+successmsg.getText());
		
	}
	
	public void loginaccount()
	{
		loginemail.sendKeys("sweety16.nagpal@gmail.com");
		loginpass.sendKeys("sweety@123");
		signin.click();
		System.out.println("User is logged in succesfully");
		
	}
			
	
	public void subscription()
	
	{
		subscription.sendKeys("qayspl1@gmail.com");
		subscriptionclick.click();
		System.out.println("Subscription Message"+subscriptionmsg.getText());
	}
}
