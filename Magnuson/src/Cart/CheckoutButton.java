package Cart;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;


import navigationpages.CartPage;
import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class CheckoutButton extends CartHeaderFooter {
	
	
	
	public void add()
	{
		int c=30 , d=40;
		int sum1;
		sum1=c+d;
		System.out.println(sum1);
	}
	
	public static void main(String[] args) {
		
		CheckoutButton obj = new CheckoutButton();
		obj.add();
		obj.add1(5, 40);
		
	}
	
	
	

}
