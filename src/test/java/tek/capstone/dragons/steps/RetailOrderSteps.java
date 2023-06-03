package tek.capstone.dragons.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;
public class RetailOrderSteps extends CommonUtility{
	POMFactory factory = new POMFactory();

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String smartHome) {
		selectByVisibleText(factory.retailOrderPage().allDepartments, smartHome);
		logger.info("User change caegory to smartHome");
	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String kasaOutdoorSmartPlugItem) {
		sendText(factory.retailOrderPage().searchInputField, kasaOutdoorSmartPlugItem);
		logger.info(kasaOutdoorSmartPlugItem + "item name was entered successfully");

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.retailOrderPage().searchBttn);
		logger.info("User click on search Bttn");

	}

	@When("User click on the item")
	public void userClickOnTheItem() throws InterruptedException {
		click(factory.retailOrderPage().KasaOutdoorItem);
		Thread.sleep(2000);
		logger.info("User successfully click on item");
	}

	@When("User select quantity ‘{int}’")
	public void userSelectQuantity(Integer int1) {
		clearTextUsingSendKeys(factory.retailOrderPage().productQtyDropdown);
		selectByIndex(factory.retailOrderPage().productQtyDropdown, int1 );
		logger.info("User select quantity");
	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.retailOrderPage().addToCartBttn);
		logger.info("User click on add to cart Bttn");
	}

	@Then("the cart icon quantity should change to‘{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer int1) {
		selectByIndex(factory.retailOrderPage().productQtyDropdown, int1 );
		logger.info("the cart icon quantity changed");
	}

	//part2
	@When("User search for an item Apex Legends {string}")
	public void userSearchForAnItemApexLegends(String apexLegends) {
	    sendText(factory.retailOrderPage().searchInputField, apexLegends);
	    logger.info(apexLegends + "was entered successfully");
	}
	@When("User click on item")
	public void userClickOnItem() throws InterruptedException {
	    click(factory.retailOrderPage().apexLegendsItem);
	    Thread.sleep(2000);
	    logger.info("User clicked on Apex Item");
	}
	
	@When("User select Apex Legends quantity ‘{int}’")
	public void userSelectApexLegendsQuantity(Integer int2) {
		clearTextUsingSendKeys(factory.retailOrderPage().productQtyDropdown);
		selectByIndex(factory.retailOrderPage().productQtyDropdown, int2);
		logger.info("Qty was selected");
	}
	@When("User click add cart button")
	public void userClickAddCartButton() {
		click(factory.retailOrderPage().addToCartBttn);
		logger.info("User clicked on add to cart");
	  
	}
	@Then("the cart icon quantity Apex Legends should change to ‘{int}’")
	public void theCartIconQuantityApexLegendsShouldChangeTo(Integer int2) {
		selectByIndex(factory.retailOrderPage().productQtyDropdown, int2 );
		logger.info("the cart icon quantity changed");
	    
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	    click(factory.retailOrderPage().cartBttn);
	    logger.info("User click successfully");
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.retailOrderPage().proceedToCheckOutBttn);
	    logger.info("user click successfully on checkout");
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.retailOrderPage().placeOrderBttn);
		logger.info("User click on place order Bttn");
	}
	
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
	    logger.info("Successful message was display");
	}
	
	    
	//part3
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	    click(factory.retailOrderPage().orders);
	    logger.info("User clicked on order");
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	    click(factory.retailOrderPage().firstOrder);
	    logger.info("User clicked successfully on first order");
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		slowDown();
		click(factory.retailOrderPage().cancelButton);
	    logger.info("User successfully clicked on cancel Button");
	}
	@When("User select the cancelation Reason ‘Bought wrong item’")
	public void userSelectTheCancelationReasonBoughtWrongItem() {
		slowDown();
	    String expectedText="Bought wrong item";
	    String actualText=factory.retailOrderPage().boughtWrongItem.getText();
	    Assert.assertEquals(expectedText, actualText);
	    logger.info("Actual and Expected text are the same");
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	    click(factory.retailOrderPage().cancelOrderButton);
	    logger.info("User click the cancel order button");
	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
	    logger.info("Your order has been cancelled Successfully");
	}
	//part4
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	    click(factory.retailOrderPage().returnItems);
	    logger.info("User click on return Item Button");
	}
	@When("User select the Return Reason ‘Item damaged’")
	public void userSelectTheReturnReasonItemDamaged() {
	    String expectedText="Item damaged";
	    String actualText=factory.retailOrderPage().damageItem.getText();
	    Assert.assertEquals(expectedText, actualText);
	    logger.info("expected and Actual text are same");
	}
	@When("User select the drop off service ‘FedEx’")
	public void userSelectTheDropOffServiceFedEx() {
	    String expectedT= "FedEx";
	    String actualT=factory.retailOrderPage().dorpOffService.getText().trim();
	    Assert.assertEquals(expectedT, actualT);
	    logger.info("Expteded and Actual Text are same");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	    click(factory.retailOrderPage().returnOrderButton);
	    logger.info("User Successfully on Return Item");
	}
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
	    logger.info("Return was Successfully");;
	}
	//part5
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	    click(factory.retailOrderPage().reviewButton);
	    logger.info("User click on Review Button");
	}
	@When("User write Review headline ‘ headline value’ and ‘review text’’")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText() {
	    Assert.assertTrue(factory.retailOrderPage().headlineInput.isDisplayed());
	    Assert.assertTrue(factory.retailOrderPage().descriptionOnItem.isDisplayed());
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	    click(factory.retailOrderPage().reviewSubmitButton);
	    logger.info("User Succesfully Clicked on reveiw submit Button");
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
	    logger.info("Your review was added successfully");
	}

}
