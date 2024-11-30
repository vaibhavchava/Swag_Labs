package Saucedemo_Automation.Saucedemo_Automation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import StepDef.Test_Base;

public class Login_Page extends Test_Base {
	String expectedTitle = "Swag Labs";
	
	
	@FindBy(xpath="//*[@id='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='login-button']")
	private WebElement btn_login;
	
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static Login_Page using(WebDriver driver){
        return new Login_Page(driver);
    }
	
	public Login_Page login() throws IOException, InterruptedException {
		Thread.sleep(3000);
		username.sendKeys(utils.getProperty("username"));
		password.sendKeys(utils.getProperty("password"));
		btn_login.click();
		return this;
	}
	
	public Login_Page verify_Title() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
			return this;
	}

	
	
	

}
