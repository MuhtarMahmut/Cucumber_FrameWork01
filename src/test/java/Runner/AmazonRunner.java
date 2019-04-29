package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)   // this steps allows cucumber class run with Junit.
@CucumberOptions(
        features = "src/test/Features",
        tags = "@UserStory02",
        glue = "Test_Steps",
        plugin = {"html:src/test/CucumberReports/HTML",
                "junit:src/test/CucumberReports/Junit/MyJunit.xml"
        },
        dryRun = true

)
public class AmazonRunner {
}
