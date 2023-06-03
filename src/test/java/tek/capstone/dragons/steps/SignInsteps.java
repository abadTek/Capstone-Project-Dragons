package tek.capstone.dragons.steps;

import java.util.List;

import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class SignInsteps extends CommonUtility {
	
POMFactory factory = new POMFactory();
	
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		logger.info("User is on retail website");
	}
	    
	@When("User click on Sign in option")
		public void userClickOnSignInOption() {
		click(factory.retailSignInPage().signinBttn);
		logger.info("User clicked on signin button successfully");	    
	}
	
	@When("User click on Create New Account button")
		public void userClickOnCreateNewAccountButton() {
		click(factory.retailSignInPage().newAccountBttn);
		logger.info("User click on new account button successfuly");
	}
	
	@When("User fill the signUp information with below data")
		public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) { 
		//reading list of list
		List<List<String>> data = dataTable.asLists(String.class);
		String name = "name";
		String email = "email";
		String password = "password";
		String confirmPass = "confirmPass";
		for(List<String> row : data) {
			name = row.get(0);
			email = row.get(1);
			password = row.get(2);
			confirmPass = row.get(3);			
		}
		sendText(factory.retailSignInPage().nameField, name);
		sendText(factory.retailSignInPage().emailInputField, email);
		sendText(factory.retailSignInPage().passwordInputField, password);
		sendText(factory.retailSignInPage().confirmPassInputField, confirmPass);
		logger.info("User enterd the information successfully ");
	}
	
	@When("User click on SignUp button")
		public void userClickOnSignUpButton() {
		click(factory.retailSignInPage().signUpBttn);
		logger.info("User click on sign Up button successfully");		
	}

	@Then("User should be logged into account page")
		public void userShouldBeLoggedIntoAccountPage() {
		slowDown();
		String expectedTest = "Your Profile";
		String actualText = factory.retailSignInPage().yourProfiletext.getText();
		Assert.assertEquals(expectedTest, actualText);
		logger.info(actualText + ": was verified successfully");
	}
    
	
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.retailSignInPage().emailLoginInputField, email);
		sendText(factory.retailSignInPage().passwordLoginInputField, password);
		logger.info("User enter email and password successfully");
		
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.retailSignInPage().loginBttn);
	    logger.info("User click on log in button successfully");
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		slowDown();		
		String expectedTest = "Account";
		String actualText = factory.retailSignInPage().yourAccount.getText();
		Assert.assertEquals(expectedTest, actualText);
		logger.info(actualText + ": was verified successfully");
	}




}
