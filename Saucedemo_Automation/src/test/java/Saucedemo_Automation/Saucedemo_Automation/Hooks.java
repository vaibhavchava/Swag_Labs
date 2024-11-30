package Saucedemo_Automation.Saucedemo_Automation;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.Scenario;

public class Hooks extends Browsers {
	@Before
    public void beforeScenario(){
        System.out.println("before scenario");
    }

    @After
    public void screenshot(Scenario sc){
    	String ScenarionName = sc.getName();
        if(sc.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] Screenshot = ts.getScreenshotAs(OutputType.BYTES);
            sc.attach(Screenshot,"image/png", "Scenario failed for " + ScenarionName);
        }
        else{
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] Screenshot = ts.getScreenshotAs(OutputType.BYTES);
            sc.attach(Screenshot,"image/png", "screenshot captured for Passed");
        }
    }
    
   

	
}
