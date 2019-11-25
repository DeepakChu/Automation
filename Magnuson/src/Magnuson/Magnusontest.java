package Magnuson;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Magnusontest {
	




	@Test
	public class MagnLive
	{

	public void  MagnusonTest() throws InterruptedException {
		
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\deepak.chander\\eclipse-workspace\\Magnuson\\exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Chrome browser open");
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		driver.get("https://www.magnusonhotels.com/");
	System.out.println("Browser launch");
		Thread.sleep(4000);
		
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

	System.out.println("Clicked on login button");


	Thread.sleep(3000);

	driver.manage().window().maximize() ;
	driver.findElement(By.xpath("//input[@type='text' and @name='login_email']")).sendKeys("rahul@gmail.com");

	System.out.println("Send email Id");


	driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/input[1]")).sendKeys("Singh@11");
	System.out.println("Send pasword ");

	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	System.out.println("Clicked on Login button ");

	Thread.sleep(8000);
		//driver.findElement(By.xpath("//span[contains(text(),'iris')]")).click();
		
		System.out.println("Login successfully");
		Thread.sleep(8000);

		System.out.println("Clicked on My Account button");

	/*	java.util.List<WebElement> elements = driver.findElements(By.xpath("//ul[contains(@class,'user-dropdown')]//li//a//i"));
		
		System.out.println(elements.size());

		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());

			System.out.println("logged in successful");

			if (elements.get(i).getText().contains("My Account")) 
			{
				elements.get(i).click();
				
	             }*/
			
			driver.findElement(By.xpath("//input[@id='avl-location']")).sendKeys("London,UK");
			
			System.out.println("Search hotel of london location");
			//driver.navigate().to("https://live-magnuson-delhi-dev.pantheonsite.io/hotel/amba-hotel-marble-arch");

			//Thread.sleep(1000);

			//js.executeScript("window.scrollBy(0,1980)");

			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class='submit button primary handleenter redbutton']")).click();
			
			System.out.println("Clicked on Search button");

			
			
		Thread.sleep(10000);
		
		//js.executeScript("window.scrollBy(0,$('body').outerHeight())");
		
		//System.out.println("Scrolling down");
		
		Thread.sleep(4000);
		/*WebElement dri=	driver.findElement(By.xpath("((//*[@class=\"roombookprice\"])[1]/div[1]/span/following::a)[1]"));

		js.executeScript("arguments[0].click();",dri);*/
		
		//driver.findElement(By.xpath("//span[@class='loadmorebtn btn redbutton']")).click();
		
		//System.out.println("Click on Load more button");
			
			
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("(//*[@href=\"https://live-magnuson-delhi-dev.pantheonsite.io/hotel/the-chesterfield-mayfair\"])[3]")).click();
		
		//Thread.sleep(5000);
			
		//driver.navigate().back();
			//Thread.sleep(7000);
		
		
		//js.executeScript("window.scrollBy(0,1980)");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@href=\"https://www.magnusonhotels.com/hotel/kensington-court-hotel-london\"])[3]")).click();
		
		//driver.findElement(By.xpath("(//a[@href=\"https://live-magnuson-delhi-dev.pantheonsite.io/hotel/st-martins-lane\"])[3]")).click();
		Thread.sleep(10000);
		
		System.out.println("Click on View more link on Hotel listing page");
		
		js.executeScript("window.scrollBy(0,500)");
		
		System.out.println("Again Scroll down");
		
		Thread.sleep(8000);
		
	driver.findElement(By.xpath("(//*[@class=\"widget-bookroom button-price btn redbutton\"])[1]")).click();

	Thread.sleep(15000);

	System.out.println("Clicked on Buy Now Button");

	js.executeScript("window.scrollBy(0,1100)");

	Thread.sleep(3000);

	driver.findElement(By.xpath("(//button[@class='next'])[1]")).click();
	System.out.println("Cliked on Next button");


	Thread.sleep(4000);

	WebElement mySelectElement = driver.findElement(By.xpath("(//*[@id='cardtype'])[1]"));
	 Select dropdown= new Select(mySelectElement);
	 System.out.println("Select on Card Type");
	 //To select an option - selectByVisibleText, selectByIndex, selectByValue
	 //selectByVisibleText
	 dropdown.selectByVisibleText("Visa");
	 System.out.println("Visa");
	 
	 
	Thread.sleep(2000);

	driver.findElement(By.xpath("(//input[@id='cardname'])")).sendKeys("Rahul Kumar");
	System.out.println("Print on Card 'rahul Kumar' ");

	Thread.sleep(10000);
	//WebElement objiframe = driver.findElement(By.xpath("//*[@id=\"ccnumber\"]"));
	driver.switchTo().frame(1);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"ccnumber\"]")).sendKeys("4111111111111111");
	//Thread.sleep(7000);

	System.out.println("Print 'Credit Card Number 4111111111111111'");

	driver.switchTo().parentFrame();

	WebElement objiframe = driver.findElement(By.id("cvv_num"));

	driver.switchTo().frame(objiframe);

	//driver.switchTo().frame(2);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"cvvnumber\"]")).sendKeys("123");
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id=\"cc_num\"]")).sendKeys("123");

	System.out.println("Print Security Number '123'");
	Thread.sleep(3000);

	driver.switchTo().parentFrame();
	Thread.sleep(3000);
	WebElement option1=driver.findElement(By.xpath("(//input[@id='checkbox1'])"));

	option1.click();

	Select drpDown=new Select(driver.findElement(By.id("card_year")));
	drpDown.selectByValue("2021");;

	if(option1.isSelected())
	{

	System.out.println("Checkbox is Toggled on");

		}else {
			
			System.out.println("Checkbox is Toggled off");
		}

	System.out.println("Select on Check box of 'Terms and conditions'");
	driver.findElement(By.xpath("//button[@id='reserve-button']")).click();
	Thread.sleep(4000);

	System.out.println("Cliked on Reserve button");

	WebElement element = driver.findElement(By.xpath("//a[@class=\"next redbutton btn\"]"));
	Actions action=new Actions(driver);

	action.moveToElement(element);
	action.click();

	action.perform();



	driver.findElement(By.xpath("//a[@class=\"next redbutton btn\"]")).click();

	Thread.sleep(5000);

	js.executeScript("window.scrollBy(0,4000)");

	driver.findElement(By.xpath("//a[@href=\"https://live-magnuson-delhi-dev.pantheonsite.io/brand/magnuson/magnuson-independents/\" and @class=\"greyghostbtn\"]")).click();
		}


	}

	
}
