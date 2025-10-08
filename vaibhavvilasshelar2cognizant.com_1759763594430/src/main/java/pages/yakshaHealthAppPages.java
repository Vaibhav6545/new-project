package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class yakshaHealthAppPages extends StartupPage {
	
// 	TC1-Locators
	By usernameTextbox = null;
	By passwordTextbox = null;
	By signInButton = null;
	By registeredPatientTextElement = null;
//	TC2-Locators
	By billingNavigationMenuElement = null;
	By selectCounterPopupElement = null;
	By new1TextElement = null;
	By new2TextElement = null;
	By new3TextElement = null;
	By old1TextElement = null;
	By opdCounterTextElement = null;
//	TC3-Locators
	By addNewPatientTextElement = null;
//	TC 4&5 -Locators
	By firstNameTextFieldElement = null;
	By middleNameTextFieldElement = null;
	By lastNameTextfieldElement = null;
	By ageTextfieldElement = null;
	By contactNumberTextfieldElement = null;
//	TC6-Locators
	By countryDropdownByElement = null;
//	TC7-Locators
	By registerAndBillingButtonElement = null;
	By errorMessageOfRegisterBillingByElement = null;
//	TC8&9-Locators
	By dispensaryToggle = null;
	By prescriptionSubMenu = null;
	By saleSubMenu = null;
	By stockSubMenu = null;
	By counterSubMenu = null;
	By reportsSubMenu = null;
	By patientConsumptionSubMenu = null;
//	TC10-Locators
	By dispensaryLeftNavigationMenu = null;
	By settingLeftNavigationMenu = null;


	String pageName = this.getClass().getSimpleName();
	public yakshaHealthAppPages(WebDriver driver) 
	{
		super(driver);
	}

	/**@Test1.1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		return false;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyTitleOfThePage() throws Exception {
		return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyURLOfThePage() throws Exception {
		return null;
	}

	/**@test2
	 * about this method verifySelectCounterPopupIsPresentAndNavigateToNextpage() 
	 * @param : null
	 * @description : it is verify all fields is present in current page or not 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean verifySelectCounterPopupIsPresentAndNavigateToNextpage() throws Exception {
		return false;
	}

	/**@test3
	 * about this method performKeyBoardOperationToOpenAddNewPatientPopup() 
	 * @param : null
	 * @description : it will perform Key board operation (Alt+N) to open the Add new patient page
	 * @return : String
	 * @author : Yaksha
	 */
	public String performKeyBoardOperationToOpenAddNewPatientPopup() throws Exception {
		return null;
	}

	/**@Test4
	 * about this method fillTheTextFieldInAddNewPatientPopup() 
	 * @param : get the data from Excel file as type Map<String, String> expectedData
	 * @description : enter value in text field of Add New Patient as per excel expected data and fetch the value of that text field ,
	 * @return : fetch the value text field as string type
	 * @author : Yaksha
	 */
	public Boolean findTheTextFieldInAddNewPatientPopup() throws Exception {
		return false;
	}

	/**@Test5.1
	 * about this method verifyFirstNameIsPresent() 
	 * @param : null
	 * @description : it will fetch the data from the FirstName text field
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyFirstNameIsPresent(Map<String, String> expectedData) throws Exception {
		return null;
	}

	/**@Test5.2
	 * about this method verifyMiddleNameIsPresent() 
	 * @param : null
	 * @description : it will fetch the data from the MiddleName Text field
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyMiddleNameIsPresent(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test5.3
	 * about this method verifyLastNameIsPresent() 
	 * @param : null
	 * @description : it will fetch the data from the LastName Text field
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyLastNameIsPresent(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test5.4
	 * about this method verifyAgeValueIsPresent() 
	 * @param : null
	 * @description : it will fetch the data from the age Text field
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyAgeValueIsPresent(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test5.5
	 * about this method verifyContactNumberIsPresent() 
	 * @param : null
	 * @description : it will fetch the data from the contact Text field
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyContactNumberIsPresent(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test6
	 * about this method verifyIndiaIsSelectedFromCountryDropdown() 
	 * @param : get the data from excel file as type Map<String, String> expectedData
	 * @description : it will select the country as per excel expected data
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyIndiaIsSelectedFromCountryDropdown(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@test7
	 * about this method validateErrorMessageWhenClickOnRegisterBillingButton() 
	 * @param : null
	 * @description : Open a new instance of “Add New Patient” and press the Register and Billing button without filling any data to display the error message and verify message.
	 * @return : errorMessage as string type
	 * @author : Yaksha
	 */
	public String validateErrorMessageWhenClickOnRegisterBillingButton() throws Exception {
		return null;
	}

	/**@test8
	 * about this method verifyDispensaryArrowIsExpanding() 
	 * @param : null
	 * @description : Verify that the dispensary modules's arrow is expanding, and submodules are being displayed.
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean verifyDispensaryArrowIsExpanding() throws Exception {
		
		return false;
	}

	/**@test9
	 * about this method verifyDispensaryArrowIsMinimizing() 
	 * @param : null
	 * @description : Verify that the dispensary module's arrow is minimizing properly.
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean verifyDispensaryArrowIsMinimizing() throws Exception {

		return false;
	}


	/**@test10
	 * about this method verifyControlScrollingFromDispensaryToSettingModule() 
	 * @param : null
	 * @description : Verify that the left navigation menu scroll bar is scrolling from Dispensary module to settings module.
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean verifyControlIsScrollingFromDispensaryToSettingModule() throws Exception {
		return false;
	}

	
}
