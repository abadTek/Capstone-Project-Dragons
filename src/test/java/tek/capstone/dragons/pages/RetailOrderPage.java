package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	// part1
	@FindBy(id = "search")
	public WebElement allDepartments;
	@FindBy(id = "searchInput")
	public WebElement searchInputField;
	@FindBy(id = "searchBtn")
	public WebElement searchBttn;
	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutdoorSmartPlugItem;
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement productQtyDropdown;
	@FindBy(xpath = "//div/p[text()='Kasa Outdoor Smart Plug']")
	public WebElement KasaOutdoorItem;
	@FindBy(xpath = "//span[text()='Add to Cart']")
	public WebElement addToCartBttn;
	@FindBy(id = "cartQuantity")
	public WebElement cartQtyField;
//part2
	@FindBy(xpath = "//div[@class='products__layout']")
	public WebElement apexLegendsItem;
	@FindBy(id = "cartBtn")
	public WebElement cartBttn;
	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckOutBttn;
	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBttn;
	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement placeOrderMessage;

	// part3
	@FindBy(id = "searchBtn")
	public WebElement searchBttn2;
	@FindBy(linkText = "Orders")
	public WebElement orders;
	@FindBy(xpath = "//p[text()='Show Details']")
	public WebElement firstOrder;
	@FindBy(xpath = "//button[@class='order__content-btn']")
	public WebElement cancelButton;
	@FindBy(css = "option[value='wrong']")
	public WebElement boughtWrongItem;
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelOrderButton;
	@FindBy(xpath = "//div[@class='cancel__confirm-message']")
	public WebElement orderHasbeenCancelled;
	@FindBy(id = "returnBtn")
	public WebElement returnItems;
	@FindBy(css = "option[value='damage']")
	public WebElement damageItem;
	@FindBy(css = "option[value='fedex']")
	public WebElement dorpOffService;
	@FindBy(id = "orderSubmitBtn")
	public WebElement returnOrderButton;
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnWasSuccessfully;
	@FindBy(id = "reviewBtn")
	public WebElement reviewButton;
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;
	@FindBy(id = "descriptionInput")
	public WebElement descriptionOnItem;
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitButton;
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewWasAddedSuccessfully;

}
