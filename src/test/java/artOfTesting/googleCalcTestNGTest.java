package artOfTesting;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
			format={"pretty", "html:target/cucumber"}
		   //format={"pretty", "json:target/report.json"}
	       //,
	       //,features = "classpath:artOfTesting/test/googleCalcSecondTest.feature"   
	       //,tags="@important"

	       )
public class googleCalcTestNGTest extends AbstractTestNGCucumberTests {

}
