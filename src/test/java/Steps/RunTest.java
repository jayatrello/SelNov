package Steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\java\\features\\login.feature",
				glue="Steps",monochrome=true/*,dryRun=true,snippets=SnippetType.CAMELCASE*/)
		
public class RunTest {
	
	
	

}
