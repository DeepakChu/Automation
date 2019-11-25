package navigationpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	public WebDriver driver;

	
	@FindBy(xpath ="//*[@id=\"input_0\"]")
	WebElement username;
	
	@FindBy(xpath ="//*[@type=\"password\"]")
	WebElement password;

	@FindBy(xpath ="(//*[@class=\"ng-scope\"])[1]")
	WebElement login;
	
	@FindBy(xpath ="(//*[@class=\"icon-chevron-right s16 arrow ng-scope\"])[1]")
	WebElement ChallengeManage;
	
	@FindBy(xpath ="//*[@href=\"/challenge_management/create/\"]")
	WebElement createnew;
	
	
	
	
	public void username() {
             username.sendKeys("lakshay@skor.com");
}
	
	public void password() {
        password.sendKeys("123456");
}
	
	public void login() {
        login.click();
}
	
	public void create() {
		ChallengeManage.click();
}

	public void create1() {
		createnew.click();
}
	
}

