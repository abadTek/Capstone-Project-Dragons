package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;


public class RetailHomePage extends BaseSetup {

	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);		
	}
	@FindBy(id="hamburgerBtn")
	public WebElement allSection;
	@FindBy(id="contentHeader")
	public WebElement shopByDepartment;
	@FindBy(xpath= "(//div[@class='sidebar_content-item'])[1]")
	public WebElement allsectionElectronic;
	@FindBy(xpath= "((//div[@class='sidebar_content-item'])[2]")
	public WebElement allsectionComputer;
	@FindBy(xpath= "(//div[@class='sidebar_content-item'])[3]")
	public WebElement allsectionSmartHome;
	@FindBy(xpath= "(//div[@class='sidebar_content-item'])[4]")
	public WebElement allsectionSports;
	@FindBy(xpath= "((//div[@class='sidebar_content-item'])[5]")
	public WebElement allsectionAutomative;
}
