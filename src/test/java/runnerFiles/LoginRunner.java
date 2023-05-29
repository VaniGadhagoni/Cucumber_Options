package runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\PracticePrograms\\Cucumber_Options\\src\\test\\java\\featureFiles\\login.feature",
				  glue= {"stepDefination"},
				  plugin= {"pretty"}
				)
public class LoginRunner {
	
	

}
