package tek.capstone.dragons.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.capstone.dragons.utilities.CommonUtility;

public class BaseUITest extends CommonUtility {
 /*
  * two hooks of cucumber
  * @Before: run the block of code before every scenario
  * @After: execute the block of code after evry scenario
  */
	@Before
	public void setupBrowser() {
	super.setupBrowser();
	}
	
	@After
	public void closeTest(Scenario scenario) {
		//we need to write our code to check and see scenario is failed,
		// it should take a screenshot and attach it to our test report
		if(scenario.isFailed()) {
		 byte[] screenshot = takeScreenShotAsBytes();
		 scenario.attach(screenshot, "img/png", scenario.getName() + "scenario failed");
		}
		super.quitBrowser();
	}
	
}
