/*	Tester: Altughan Ozengi
	IDE type: Eclipse Oxygen for Java EE Developers
	Platform version: Java SE 8.0
*/

package StepDefinition;		

import java.io.File;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				
	
	WebDriver driver = null;
    		
    @Given("^Open the Chrome and launch the application$")					
    public void open_the_Chrome_and_launch_the_application() throws Throwable							
    {		
       File file = new File("D:\\Altug\\Workspace\\CucumberWithSelenium\\driver\\chromedriver.exe");
       System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());				
       driver = new ChromeDriver();
       driver.manage().window().maximize();			
       driver.get("http://demo.guru99.com/v4");	
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       driver.findElement(By.name("uid")).sendKeys("mngr184988");							
       driver.findElement(By.name("password")).sendKeys("tUtujUg");							
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();					
    }		
}		
