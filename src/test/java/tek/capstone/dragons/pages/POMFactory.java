package tek.capstone.dragons.pages;



public class POMFactory  {
	// page object Modlel: design pattern used in software testing to create an object repository for storing web UI elements
	//it can be used to improve the maintainability, reusability, and robustness of test scripts.

	private RetailHomePage retailHomePage;
	private RetailSignInPage retailSignInPage;
	private RetailAccountPage retailAccountPage;
	private RetailOrderPage retailOrderpage;
	public POMFactory() {
		this. retailHomePage =  new RetailHomePage();
		this.retailSignInPage = new RetailSignInPage();
		this.retailAccountPage = new RetailAccountPage();
		this.retailOrderpage = new RetailOrderPage();
		}
	
	public  RetailHomePage  retailHomePage() {
		return this.retailHomePage;
		
	}
	public RetailSignInPage retailSignInPage() {
		return this.retailSignInPage;
	}
	public RetailAccountPage retailAccountPage() {
		return this.retailAccountPage;
	}
	public RetailOrderPage retailOrderPage() {
		return this.retailOrderpage;
	}
}