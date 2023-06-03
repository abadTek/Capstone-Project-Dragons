package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
// locators
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);		
	}
	
	@FindBy(xpath ="//a[@id='accountLink']")
	public WebElement yourAccount;
	
	@FindBy(xpath= "//input[@id='nameInput']")
	public WebElement nameInputUpdate;
	
	@FindBy(xpath= "//input[@id='personalPhoneInput']")
	public WebElement phoneInput;
	
	@FindBy(xpath="//div[@class='account__btn-wrapper']")
	public WebElement perUpdateBtn;
	
	@FindBy(css = "div[role='alert']")
	public WebElement updateSuccessfully;
	
	@FindBy(xpath= "//p[text()='Add a payment method']")
	public WebElement addPaymentMethod;
	
	@FindBy(id="cardNumberInput")
	public WebElement cardNumber;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCard;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonth;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expiraYear;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCode;
	
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement addCardButtn;
	
	@FindBy(xpath= "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentAddSucessfuly;
	
	@FindBy(xpath= "//div[@class='account__personal']//h1")
	public WebElement yourProfiletext;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMetodMessage;
	//Edit
	@FindBy(xpath= "//p[text()='Master Card']")
	public WebElement selectMasterCard;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editButton;
	
	@FindBy(id="cardNumberInput")
	public WebElement cardNumberEdit;
	
	@FindBy(id = "nameOnCardInput" )
	public WebElement nameOnCardEdit;
	
	@FindBy(css = "select[id='expirationMonthInput']")
	public WebElement expirationMonUpdate;
	
	@FindBy(css = "select[id='expirationYearInput']")
	public WebElement expirationYearUpdate;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeEdit;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtnEidt;
	 
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement successMessage;
	
	@FindBy(xpath="//img[@alt='Master Card']")
	public WebElement SelectedpaymentCardRemov;
		
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removeButtn;
	
	@FindBy(id = "accountLink")
	public WebElement accountOption;

	// address
	 @FindBy(xpath= "//div[@class='account__address-new-wrapper']")
	 public WebElement addAddress;
	 
	 @FindBy(css ="select[id='countryDropdown']")
	 public WebElement selectCountry;
	 
	 @FindBy(id= "fullNameInput")
	 public WebElement fullNameInput;
	 
	 @FindBy(id= "phoneNumberInput")
	 public WebElement phoneNumberInput;
	 
	 @FindBy(id= "streetInput")
	 public WebElement streetInput;
	 
	 @FindBy(id= "apartmentInput")
	 public WebElement apartmentInput;
	 
	 @FindBy(id= "cityInput")
	 public WebElement cityInput;
	  
	 @FindBy(css = "select[name='state']")
	 public WebElement StateInput;
	 
	 @FindBy(id= "zipCodeInput")
	 public WebElement zipCodeInput;
	 
	 @FindBy(id= "addressBtn")
	 public WebElement addressBtn;
	 
	 @FindBy(xpath= "//div[text()='Address Added Successfully']")
	 public WebElement addressSuccssmessage;
	 
	 //edit address
	
	 @FindBy(xpath= "//button[text()='Edit']")
	 public WebElement eidtAdressOption;
	 
	 @FindBy(css ="select[id='countryDropdown']")
	 public WebElement editCountry;
	 
	 @FindBy(id= "fullNameInput")
	 public WebElement editFullNam;
	 
	 @FindBy(id= "phoneNumberInput")
	 public WebElement editPhoneNumber;
	 
	 @FindBy(id= "streetInput")
	 public WebElement editStreet;
	 
	 @FindBy(id= "apartmentInput")
	 public WebElement editApartment;
	 
	 @FindBy(id= "cityInput")
	 public WebElement editCity;
	  
	 @FindBy(css = "select[name='state']")
	 public WebElement editState;
	 
	 @FindBy(id= "zipCodeInput")
	 public WebElement edithZipCode;
	 
	 @FindBy(id= "addressBtn")
	 public WebElement editAddressBtn;
	
	@FindBy(xpath= "//div[text()='Address Updated Successfully']")
	public WebElement eidtAdressSuccesMassge;
	
	//remove address
	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement addressRemoveButtn;
}
