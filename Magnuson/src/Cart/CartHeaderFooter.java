package Cart;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import navigationpages.CartPage;
import navigationpages.HomePage;
import navigationpages.NavigationPage;
import navigationpages.PdpPage;
import navigationpages.PlpPage;
import utility.Config;

public class CartHeaderFooter {
	
	
		
		
	public void add1(int a, int b)
	{
		
	int sum=a+b;
	System.out.println(sum);
		
		
	}	
		
		public void add1(String c, int d)
		{
			
			String e ="c"+d;
			System.out.println(d+c);
		}
		
		
		public static void main(String[] args) {
		CartHeaderFooter object =new CartHeaderFooter();
		object.add1(10, 20);
		object.add1("deepak", 40);
		
			
		}
		
}