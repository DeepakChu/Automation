package navigationpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class CartPage {

	
	@FindBy(xpath="//*[@class=\"action showcart\"]")
	WebElement showcart;
	
	@FindBy(xpath="//*[@class=\"action viewcart\"]")
	WebElement viewandeditcard;
	
	@FindBy(xpath="//*[@class=\"col subtotal\" ]/span/span")
	WebElement pricebefore;
	
	@FindBy(xpath="//*[@class=\"control qty\"]")
	WebElement quantitybefore;
	
	@FindBy(xpath="//*[@class=\"action update\"]")
	WebElement updatecard;
	
	@FindBy(xpath="//*[@class=\"radio\" and @name=\"ko_unique_4\"]")
	WebElement shippingmethod;
	
	@FindBy(xpath="//*[@class=\"action primary checkout\"  and @title=\"Proceed to Checkout\"]")
	WebElement checkoutbutton;
    @FindBy(xpath="//*[@title=\"Qty\"]")
    WebElement quantext;
    @FindBy(xpath="//*[@class=\"action action-edit\"]")
WebElement editcart;
    @FindBy(xpath="//*[@id=\"qty\"]")
    WebElement quantityedit;
    @FindBy(xpath="//*[@id=\"product-updatecart-button\"]")
    WebElement updatecartinside;
    @FindBy(xpath="//*[@class=\"col subtotal\"]/span[@class=\"price-excluding-tax\"]")
    WebElement subtotalamount;

public void showcart_link() {
	
	showcart.click();
	
}

public void viewandeditcard_link() {
	
	viewandeditcard.click();
	System.out.println("Product Price before changing the quantity:");
	System.out.println(pricebefore.getText());
	
}

public void quantitybefore(WebDriver driver)  {
	System.out.println("Price after changing quantityfrom 1 to 2 :");
	editcart.click();
	try {
		Thread.sleep(2000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	quantityedit.sendKeys("2");
	updatecartinside.click();
	try {
		Thread.sleep(4000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println("Amount after changing quantity from 1 to 2:"+subtotalamount.getText());
	
	
	/*Actions objtext =new Actions(driver);
	
	objtext.moveToElement(quantitybefore).click(quantitybefore);
	objtext.sendKeys(Keys.CONTROL+"a");
	objtext.sendKeys(Keys.DELETE);
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	quantext.sendKeys("2");
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	objtext.build().perform();*/
	
		
}

/*public void updatecart() {
	
	updatecard.click();

}*/

public void checkout_button() {
	
	if (checkoutbutton.isDisplayed()) {
		System.out.println("Checkout button is present on cart page");
	}

	else {
		System.out.println("Checkout button is not present on cart page");
	}
	
}

}