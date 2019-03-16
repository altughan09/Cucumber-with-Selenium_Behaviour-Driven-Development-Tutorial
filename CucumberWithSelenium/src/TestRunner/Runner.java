/*	Tester: Altughan Ozengi
	IDE type: Eclipse Oxygen for Java EE Developers
	Platform version: Java SE 8.0
*/


package TestRunner;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)		//Runwith annotation tells about the test runner class to start executing our tests.		
@CucumberOptions(features="Features",glue={"StepDefinition"})	/*CucumberOptions annotation is used to set some properties
 																for our cucumber test like feature file, step definition etc.*/					

public class Runner 				
{		

}