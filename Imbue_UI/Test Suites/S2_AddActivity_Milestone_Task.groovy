import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.SetupTestCase
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownTestCase

/**
 * Some methods below are samples for using SetUp/TearDown in a test suite.
 */

/**
 * Setup test suite environment.
 */
@SetUp(skipped = false) 
def setUp() {
	
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl(GlobalVariable.G_SiteURL)
	
	WebUI.setText(findTestObject('Object Repository/Imbue_Login/Page_Sign in to your account/input_Sign in_loginfmt'), GlobalVariable.G_Username)
	
	WebUI.click(findTestObject('Object Repository/Imbue_Login/Page_Sign in to your account/input_Sign in_idSIButton9'))
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Imbue_Login/Page_Sign In/input_Sign in with your organizational acco_04b8f7'),
		GlobalVariable.G_EncryptedPassword)
	
	WebUI.click(findTestObject('Object Repository/Imbue_Login/Page_Sign In/span_Sign in'))
	
	WebUI.click(findTestObject('Object Repository/Imbue_Login/Page_Sign in to your account/div_Text XX XXXXXXXX42'))
	
	WebUI.delay(20)
	
	WebUI.click(findTestObject('Object Repository/Imbue_Login/Page_Sign in to your account/input_More information_idSubmit_SAOTCC_Continue'))
	
	WebUI.click(findTestObject('Object Repository/Imbue_Login/Page_Sign in to your account/input_Sign in_idSIButton9'))
	
	
}

/**
 * Clean test suites environment.
 */
@TearDown(skipped = false) 
def tearDown() {
	
	WebUI.closeBrowser()
}

/**
 * Run before each test case starts.
 */
@SetupTestCase(skipped = true) 
def setupTestCase() {
	
}

/**
 * Run after each test case ends.
 */
@TearDownTestCase(skipped = false) 
def tearDownTestCase() {
	//boolean result1 = WebUI.verifyElementPresent(findTestObject('Imbue_AddMilestone_Task/milestone_delete_button'), 10)
	//if (result1 == true) {
		//WebUI.click(findTestObject('Imbue_AddMilestone_Task/milestone_delete_button'))
	//}
	
	
	boolean result2 = WebUI.verifyElementClickable(findTestObject('Imbue_AddMilestone_Task/activity_delete_button'))
	
	if (result2 == true) {
		WebUI.click(findTestObject('Imbue_AddMilestone_Task/activity_delete_button'))
	}
	
	WebUI.click(findTestObject('Object Repository/Imbue_AddActivity/Page_CR App/MinimizeButton_EvaluationScreen'))
}

/**
 * References:
 * Groovy tutorial page: http://docs.groovy-lang.org/next/html/documentation/
 */