package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;

import tek.capstone.dragons.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	// action methods 
	
	POMFactory factory = new POMFactory();
	

	
	@When ("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.retailAccountPage().yourAccount);
		logger.info("User click on account successfully");
	}
		
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		 clearTextUsingSendKeys(factory.retailAccountPage().nameInputUpdate);
		sendText(factory.retailAccountPage().nameInputUpdate,name);
		 clearTextUsingSendKeys(factory.retailAccountPage().phoneInput);
		sendText(factory.retailAccountPage().phoneInput, phone);
		logger.info("User update name and phone number successfully");
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
	    click(factory.retailAccountPage().perUpdateBtn);
	    logger.info("User click on update button");
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		slowDown();		
		String expectedTest = "Your Profile";
		String actualText = factory.retailAccountPage().yourProfiletext.getText();
		Assert.assertEquals(expectedTest, actualText);
		logger.info(actualText + ": was Updated successfully");
	}
	//add payment
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	   click(factory.retailAccountPage().addPaymentMethod);
	   logger.info("User click on add payment method successfully");
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		String cardNum = "cardNumber";
		String nameOnCard = "nameOnCard";
		String expirationMoth = "expirationMonth";
		String expirationYear = "expirationYear";
		String securityCode = "securityCode";
		for(List<String> row : data) {
			cardNum = row.get(0);
			nameOnCard = row.get(1);
			expirationMoth = row.get(2);
			expirationYear = row.get(3);
			securityCode = row.get(4);			
		}
		sendText(factory.retailAccountPage().cardNumber,cardNum );
		sendText(factory.retailAccountPage().nameOnCard,nameOnCard );
		sendText(factory.retailAccountPage().expirationMonth,expirationMoth );
		sendText(factory.retailAccountPage().expiraYear, expirationYear);
		sendText(factory.retailAccountPage().securityCode, securityCode );
		logger.info("User enterd the information successfully ");
	   
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.retailAccountPage().addCardButtn);
		logger.info("User click on add your card Button successfully");
	  
	}
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() throws InterruptedException {
		Thread.sleep(3000);
		waitTillPresence(factory.retailAccountPage().paymentAddSucessfuly);
	    Assert.assertEquals("Payment Method added sucessfully", factory.retailAccountPage().paymentAddSucessfuly.getText().trim());
	  logger.info("Payment method added successfully");
	}
	//edit card
		
	@When("User click on Card to Eidt")
	public void userClickOnCardToEidt() {
	  click(factory.retailAccountPage().selectMasterCard);
	  logger.info("User click on Card to Eidt");
	}
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	    click(factory.retailAccountPage().editButton);
	    logger.info("User click on Edit option of card section successfully");	    
	}
	
	
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		//reading data a list of Map
		
	    List<Map<String, String>> editButton = dataTable.asMaps(String.class, String.class);
	    
	    for(Map<String, String> row :editButton ) {
	        clearTextUsingSendKeys(factory.retailAccountPage().cardNumberEdit);
	        sendText(factory.retailAccountPage().cardNumberEdit, row.get("cardNumber") );
	        clearTextUsingSendKeys(factory.retailAccountPage().nameOnCardEdit);
	        sendText(factory.retailAccountPage().nameOnCardEdit, row.get("nameOnCard") );
	        clearTextUsingSendKeys(factory.retailAccountPage().expirationMonth);
	        sendText(factory.retailAccountPage().expirationMonUpdate,row.get("expirationMonth") );
	        clearTextUsingSendKeys(factory.retailAccountPage().expirationYearUpdate);
	        sendText(factory.retailAccountPage().expirationYearUpdate, row.get("expirationYear"));
	        clearTextUsingSendKeys(factory.retailAccountPage().securityCodeEdit);
	        sendText(factory.retailAccountPage().securityCodeEdit, row.get("securityCode"));
	        logger.info("User entered the information successfully ");
			}
	}
	
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	    click(factory.retailAccountPage().paymentSubmitBtnEidt);
	    logger.info("User click Update card Button");
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		waitTillPresence(factory.retailAccountPage().successMessage);
		    Assert.assertEquals("Payment Method updated Successfully", factory.retailAccountPage().successMessage.getText().trim());
		    logger.info("Payment Method updated Successfully");
		
	}
	
	//remove card
	@When("User click on Card to remove")
	public void userClickOnCardToRemove() {
		click(factory.retailAccountPage().SelectedpaymentCardRemov);
		  logger.info("User click on Card to remove");
	}
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
	   click(factory.retailAccountPage().removeButtn);
	   logger.info("click on remove option");
	}
	
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
	   Assert.assertTrue(factory.retailAccountPage().yourProfiletext.isDisplayed());
	   logger.info("Payment details have been removed successfully");
	}
	   	
	//add address
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	    click(factory.retailAccountPage().addAddress);
	    logger.info("User click on Add address option successfully");
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		
		List<Map<String, String>> fillAddress = dataTable.asMaps(String.class, String.class);
	    
	    for(Map<String, String> row :fillAddress ) {
	    	selectByVisibleText(factory.retailAccountPage().selectCountry,row.get("country"));
			sendText(factory.retailAccountPage().fullNameInput,row.get("fullName"));
			sendText(factory.retailAccountPage().phoneNumberInput, row.get("phoneNumber"));
			sendText(factory.retailAccountPage().streetInput,row.get("streetAddress"));
			sendText(factory.retailAccountPage().apartmentInput,row.get("apt"));
			sendText(factory.retailAccountPage().cityInput,row.get("city"));
			selectByVisibleText(factory.retailAccountPage().StateInput,row.get("state"));
			sendText(factory.retailAccountPage().zipCodeInput,row.get("zipCode"));
			logger.info("User enterd the information successfully ");
	    	slowDown();
	    	
	    }
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	    click(factory.retailAccountPage().addressBtn);
	    logger.info("User click add address button successfuly");
	}
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillPresence(factory.retailAccountPage().addressSuccssmessage);
	    Assert.assertEquals("Address Added Successfully", factory.retailAccountPage().addressSuccssmessage.getText().trim());
	    logger.info("Payment Method updated Successfully");
	}
	//edit address
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	    click(factory.retailAccountPage().eidtAdressOption);
	    logger.info("User click on edit address");
	}
	@When("user fill  edit address form with below information")
	public void userFillEditAddressFormWithBelowInformation(DataTable dataTable) {

		List<Map<String, String>> editAddress = dataTable.asMaps(String.class, String.class);
	    
	    for(Map<String, String> row :editAddress ) {
	    	
	    	 clearTextUsingSendKeys(factory.retailAccountPage().editCountry);
		    	selectByVisibleText(factory.retailAccountPage().editCountry, row.get("country"));
		    	 clearTextUsingSendKeys(factory.retailAccountPage().editFullNam);
				sendText(factory.retailAccountPage().editFullNam, row.get("fullName"));
		    	 clearTextUsingSendKeys(factory.retailAccountPage().editPhoneNumber);
				sendText(factory.retailAccountPage().editPhoneNumber, row.get("phoneNumber"));
		    	 clearTextUsingSendKeys(factory.retailAccountPage().editStreet);
				sendText(factory.retailAccountPage().streetInput,row.get("streetAddress"));
		    	 clearTextUsingSendKeys(factory.retailAccountPage().editApartment);
				sendText(factory.retailAccountPage().editApartment,row.get("apt"));
		    	 clearTextUsingSendKeys(factory.retailAccountPage().editCity);
				sendText(factory.retailAccountPage().editCity,row.get("city"));
		    	 clearTextUsingSendKeys(factory.retailAccountPage().editState);
				selectByVisibleText(factory.retailAccountPage().editState,row.get("state"));
		    	 clearTextUsingSendKeys(factory.retailAccountPage().edithZipCode);
				sendText(factory.retailAccountPage().edithZipCode,row.get("zipCode"));
				logger.info("User enterd the information successfully ");
		    	slowDown();
	    }	    		    	
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
	   click(factory.retailAccountPage().editAddressBtn);
	   logger.info("User click update Your Address button");
	}
	
	@Then("a message should be displayed ‘Address Updated Successfully")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.retailAccountPage().eidtAdressSuccesMassge);
	    Assert.assertEquals("Address Updated Successfully", factory.retailAccountPage().eidtAdressSuccesMassge.getText().trim());
	    logger.info("Address Updated Successfully");
	}
	
	//remove address
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.retailAccountPage().addressRemoveButtn);
		logger.info("User click on remove option of Address section");
		   
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		 Assert.assertTrue(factory.retailAccountPage().yourProfiletext.isDisplayed());
		   logger.info("Payment details have been removed successfully");
	}

}
