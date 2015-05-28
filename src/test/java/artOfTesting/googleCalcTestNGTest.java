package artOfTesting;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;


@CucumberOptions(
	       format={"pretty", "json:target/report.json"},
	       //features = "classpath:basic_arithmetic.feature"
	       //,   
	       tags="@important,@important2"

	       )
public class googleCalcTestNGTest extends AbstractTestNGCucumberTests {

}
