package navigationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Config;

public class CheckoutPage {

	@FindBy(xpath="//*[@id=\"top-cart-btn-checkout\"]")
	WebElement Gotocheckout;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement Enteremail;
	
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement Enterpassword;
	
	@FindBy(xpath="//*[@class=\"action action-login secondary\"]")
	WebElement Signin ;
	
	@FindBy(xpath="//*[@class=\"input-text\" and @name=\"company\"]")
	WebElement company;
	
	@FindBy(xpath="//*[@class=\"input-text\"  and @name=\"street[0]\"]")
	WebElement Address;
	
	@FindBy(xpath="//*[@class=\"input-text\"  and @name=\"city\"]")
	WebElement City;
	
	@FindBy(xpath="//*[@class=\"input-text\"  and @name=\"postcode\"]")
	WebElement PostalCode;
	
	@FindBy(xpath="//*[@class=\"input-text\"  and @name=\"telephone\"]")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//*[@class=\"select\"  and @name=\"region_id\"]")
	WebElement State;
	
	@FindBy(xpath="//*[@class=\"select\"  and @name=\"country_id\"]")
	WebElement Country;

	@FindBy(xpath="//*[@class=\"radio\" and @name=\"ko_unique_4\"]")
	WebElement shippingmethod;
	
	@FindBy(xpath="//*[@class=\"button action continue primary\"]")
	WebElement nextbutton;

	@FindBy(xpath="//*[@name=\"payment[cc_number]\"]")
	WebElement creditcard;
	
	@FindBy(xpath="//*[@class=\"select month\" and @id=\"paradoxlabs_firstdata-cc-exp-month\"]")
	WebElement month;
	
	@FindBy(xpath="//*[@class=\"select year\" and @id=\"paradoxlabs_firstdata-cc-exp-year\"]")
	WebElement year;
	
	@FindBy(xpath="//*[@class=\"input-text cvv\" and @id=\"paradoxlabs_firstdata-cc-cid\"]")
	WebElement cardverify;
	
	@FindBy(xpath="//*[@class=\"action primary checkout\"  and @title=\"Place Order\" ]")
	WebElement placeorder;
	
	@FindBy(xpath="//*[@name=\"payment[card_id]\"]")
	WebElement paymentinfo;
	
	
	@FindBy(xpath="//*[@id=\"btn-minicart-close\"]")
	WebElement cancelbutton;
	
	
	public void Checkout_link() {
		
		Gotocheckout.click();
		
		
	}
	
	
	
public void Email() {
		
	
//	System.out.println("Enter Email:");
	Enteremail.sendKeys("deepak11@gmail.com");
		System.out.println(Enteremail.getText());
	}
public void Password() {
		
	
//	System.out.println("Enter Password:");
	Enterpassword.sendKeys("87501501cd@");
		System.out.println(Enterpassword.getText());
	}
	
public void Signin_button() {
	
	Signin.click();
	
}

public void Checkout_form() {
	
	company.sendKeys("yspl");
	Address.sendKeys(Config.Address());
	City.sendKeys(Config.City());
	Select state=new Select(State);
	         state.selectByVisibleText("California");
			
	PostalCode.sendKeys(Config.Zipcode());

	PhoneNumber.sendKeys(Config.Phoneno());
	
	
	
}

public void Radio_button() {
	
	shippingmethod.click();
	nextbutton.click();
	
}

public void Payment_info() {
	
	Select state=new Select(paymentinfo);
    state.selectByVisibleText("Add new card");
	
	
}


public void Payment_Gateway(WebDriver driver) {
	
	
	
	/*WebDriverWait obj =new WebDriverWait(driver, 30);
	obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name=\"payment[cc_number]\"]")));*/
	try {
		Thread.sleep(5000);
	} catch (Exception e) {
		// TODO: handle exception
	}
    creditcard.sendKeys(Config.getCardNumber());
	Select state=new Select(month);
    state.selectByVisibleText("03 - March");
    Select state1=new Select( year);
    state1.selectByVisibleText("2021");
    cardverify.sendKeys(Config.Cvnumber());
   
	
}
public void Place_Order() {
	
	 placeorder.click();
}	

public void Checkout_cancel() {
	
	cancelbutton.click();
	
	
}
}
