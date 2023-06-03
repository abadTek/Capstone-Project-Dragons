package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);		
	}
	// to finds elemnts we need @FindBy annotaion from Selenuim 
	//we write our locators here 
		
	@FindBy(id= "signinLink")
	public WebElement signinBttn;
	
	@FindBy(id= "newAccountBtn")
	public WebElement newAccountBttn;
	
	
	@FindBy(id= "nameInput")
	public WebElement nameField;
	
	@FindBy(id="emailInput")
	public WebElement emailInputField;
	
	@FindBy(id= "passwordInput")
	public WebElement passwordInputField;
	
	@FindBy(id= "confirmPasswordInput")
	public WebElement confirmPassInputField;
	
	@FindBy(id="email")
	public WebElement emailLoginInputField; 
		
	@FindBy(id= "signupBtn")
	public WebElement signUpBttn;
	
	@FindBy(id = "password")
	public WebElement passwordLoginInputField;
	
	@FindBy(id = "loginBtn")
	public WebElement loginBttn;

	@FindBy(xpath ="//a[@id='accountLink']")
	public WebElement yourAccount;
	 
	@FindBy(xpath= "//div[@class='account__personal']//h1")
	public WebElement yourProfiletext;
		
	public void sendRegisterationInfo(String name, String email, String pass, String confirmPass) {
		nameField.sendKeys(name);
		emailInputField.sendKeys(email);
		passwordInputField.sendKeys(pass);
		confirmPassInputField.sendKeys(confirmPass);
		
	}
	

}
