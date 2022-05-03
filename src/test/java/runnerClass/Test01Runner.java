package runnerClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty","json:target/cucumber01.json" }, 
	        glue = "stepDefinitions",
	        features = {"src\\main\\java\\featurefiles"},
	        strict = true,
	        dryRun = false,
            tags = "@CommonWorkFlow2"
)

public class Test01Runner {

}
