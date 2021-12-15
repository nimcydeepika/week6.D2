package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features={"src/test/java/features/Login.feature","src/test/java/features/CreateLead.feature"},
                  glue="steps",
                  monochrome=true,
                  publish=true)
public class CucumberRunner extends BaseClass {

	}
