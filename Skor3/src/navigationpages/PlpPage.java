package navigationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlpPage {

	

	public WebDriver driver;
	
	
	
	@FindBy(xpath = "//*[@id=\"input_7\"]")
	WebElement title;
	
	@FindBy(xpath = "//*[@id=\"select_8\"]")
	WebElement category;
	
	@FindBy(xpath = "//*[@id=\"select_option_16\"]")
	WebElement category1 ;
	
	@FindBy(xpath = "(//*[@class=\"md-datepicker-expand-triangle ng-scope\"])[2]")
	WebElement date ;
	
	
	
	
	@FindBy(xpath="//*[@aria-label=\"Tuesday September 10 2019\"]")
	WebElement datelast;
	
	@FindBy(xpath = "//*[@id=\"input_14\"]")
	WebElement description ;
	
	@FindBy(xpath = "//*[@name=\"rule0\"]")
	WebElement rules ;
	
	@FindBy(xpath = "(//*[@class=\"md-raised md-accent md-button md-default-theme md-ink-ripple\"])[2]")
	WebElement save;
	
	public void Title(WebDriver driver)
	{
		
		title.sendKeys("Pin1");
		category.click();
		category1.click();
		//date.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//datelast.click();
		
		description.sendKeys("jgcdgfsuihvduihduihvdivhdivhihvdiv");
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		js.executeScript("window.scrollBy(0,500)");
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rules.sendKeys("sdvdvsdvsdvsdvs");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		save.click();
		
		
	}
	

}