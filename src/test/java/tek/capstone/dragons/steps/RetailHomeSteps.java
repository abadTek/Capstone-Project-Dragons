package tek.capstone.dragons.steps;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;
//in this class we create the action methods.
public class RetailHomeSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	@When("User click on All section")
	public void userClickOnAllSection() {
	    click(factory.retailHomePage().allSection);
	    logger.info("User sucessfully clicked on section button");
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		String electronic="Electronics";
		String computer= "Computer";
		String smartHome=  "Smart Home";
		String sports= "Sports";
		String automative= "Automative";
		for(List<String> row : data) {
			electronic = row.get(0);
			computer = row.get(1);
			smartHome= row.get(2);
			sports = row.get(3);
			automative=row.get(4);
		}
	}
	@When("User see shop by departement section")
	public void userSeeShopByDepartementSection() {
	    String expectedText = "Shop By department";
	    String actualText = factory.retailHomePage().shopByDepartment.getText();
	    Assert.assertEquals(expectedText, actualText);
			
		}
	@When("User see see below options are present in department")
	public void userSeeSeeBelowOptionsArePresentInDepartment(io.cucumber.datatable.DataTable dataTable) {
		click(factory.retailHomePage().shopByDepartment);
		List<List<String>> data = dataTable.asLists(String.class);
		String electronic="Electronics";
		String computer= "Computer";
		String smartHome=  "Smart Home";
		String sports= "Sports";
		String automative= "Automative";
		for(List<String> row : data) {
			electronic = row.get(0);
			computer =row.get(1);
		}
	}

	
	
	
}
