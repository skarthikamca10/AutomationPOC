package Runner;


import Utility.GlobalLogic;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;

@CucumberOptions(

        features = "src/test/resources/Features/",
        glue={"StepDef"},
        tags = {"@TC01"},
        plugin = {"json:target/cucumber.json",
                "html:target/cucumber-reports/report.html"},
        monochrome=true
)

public class TestRunner extends AbstractTestNGCucumberTests {

    @AfterSuite
    public void reportGenHTML()
    {
        GlobalLogic.reportGenerate();

    }
}
