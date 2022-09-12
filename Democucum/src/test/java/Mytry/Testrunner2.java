package Mytry;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class Testrunner2 {
	@RunWith(Cucumber.class)
	@CucumberOptions(
	                features="democucumfolder\\Demologin.feature", glue={"Mytry"})
	               //Go to feature and rightclick get the path and paste it here
	                
	            

	public class Testrunner {


		}

}
