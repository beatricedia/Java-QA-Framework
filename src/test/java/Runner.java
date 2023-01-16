import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Here I have added the ExtendedCucumberOptions which will retry failed test scenarios because they will fail randomly, especially if the test is long
 * Look up selenium flaky tests for more info about this
 */
@RunWith(ExtendedCucumber.class)


@CucumberOptions(monochrome = true,
        tags = {
                //In case you want to run certain tests just tag them and do the same thing I have done with the @Sort tag
//		"@Sort"},

                },

        features = "src/test/java/features/",
        plugin = {"pretty", "html:cucumber-html-reports", "json:cucumber-html-reports/cucumber.json"},
        glue = "steps/"
)


public class Runner {


}
