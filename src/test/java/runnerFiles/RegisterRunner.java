package runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\PracticePrograms\\Cucumber_Options\\src\\test\\java\\featureFiles\\Register.feature",
				 glue= {"stepDefination"},
				 plugin= {"pretty"},
				 //tags="@Mandatoryfields or @Allfields"
				 tags="@Smoke and @Register"
				)
public class RegisterRunner {

}
