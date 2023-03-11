import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/main/resources/features/Login.feature","src/main/resources/features/AddToCart.feature"},
        glue = {"com.juaracoding.ujian5"},
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)


public class RunnerTest extends AbstractTestNGCucumberTests {


}
