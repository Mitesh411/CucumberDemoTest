package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"},monochrome = true,
plugin={"pretty","html:target/HtmlReports"})

// For Json reports and create folder for it 
// plugin = {"pretty","json:target/JSONReports/report.json"}
// plugin = {"pretty","json:target/XMLReports/report.xml"}


// Second Method
// plugin = {"pretty","json:target/XMLReports/report.xml","html:target/HTMLReports/report.html",}

//

public class TestRunner {

}
