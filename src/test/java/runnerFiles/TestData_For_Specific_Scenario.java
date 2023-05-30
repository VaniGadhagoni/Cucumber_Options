package runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\PracticePrograms\\Cucumber_Options\\src\\test\\java\\featureFiles\\TestData_For_Specific_Scenario.feature",
					glue= {"stepDefination"},
					plugin= {"pretty"}
					)
public class TestData_For_Specific_Scenario {
	
	

}
