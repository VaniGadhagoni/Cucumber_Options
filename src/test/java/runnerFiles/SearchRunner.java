package runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\PracticePrograms\\Cucumber_Options\\src\\test\\java\\featureFiles\\AmazonSearch.feature",
					glue={"stepDefination"},
					monochrome=true,
					plugin={"pretty","html:target/Login.html","json:target/report.json","junit:target/report.xml"},
					tags="@all"
					)
public class SearchRunner {

}
