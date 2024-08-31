package runnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src\\test\\resources\\Feature\\iLAB.feature"},
					glue = {"steps"},
					dryRun = false,
					monochrome = true,
					plugin = {"pretty", "html:target/htmlreport.html"})

public class testRunner extends AbstractTestNGCucumberTests{

}
