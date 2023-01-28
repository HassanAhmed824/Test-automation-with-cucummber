package testrunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources"         //to specify the feature file path
        ,glue={"stepDefs"}                         //to specify the stepDefinition package path
        //,dryRun=true,                             //it only checks whether all feature file steps have corresponding step definitions
        //,tags = "@FirstTag"                         //To run specific tags in scenarios tags = "@FirstTag and @SecondTag"
)
public class Runcucumertest
{

}
