import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Common Test Cases/LoginToImbueApp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Imbue_AddActivity/Page_CR App/svg_End_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Imbue_AddActivity/Page_CR App/svg_Discussion_MuiSvgIcon-root'))

WebUI.click(findTestObject('Imbue_AddActivity/Page_CR App/span_Activity'))

WebUI.click(findTestObject('Object Repository/Imbue_AddActivity/Page_CR App/span_Add Activity'))

WebUI.setText(findTestObject('Object Repository/Imbue_AddActivity/Page_CR App/input_Title_title'), activityName)

WebUI.setText(findTestObject('Object Repository/Imbue_AddActivity/Page_CR App/textarea_Objective_description'), 'Test')

WebUI.click(findTestObject('Object Repository/Imbue_AddActivity/Page_CR App/span_Save'))

WebUI.click(findTestObject('Object Repository/Imbue_AddActivity/Page_CR App/svg_Discussion_MuiSvgIcon-root_1'))

WebUI.verifyElementText(findTestObject('Imbue_AddActivity/Page_CR App/div_TestACtivity1'), activityName)

WebUI.click(findTestObject('Imbue_AddActivity/Page_CR App/svg_Discussion_MuiSvgIcon-root'))

WebUI.delay(2)

WebUI.click(findTestObject('Imbue_AddActivity/Page_CR App/svg_Test Activity1_MuiSvgIcon-root MuiSvgIcon-colorError MuiSvgIcon-fontSizeSmall'))

WebUI.verifyElementClickable(findTestObject('Imbue_AddActivity/Page_CR App/span_Add Activity'))

WebUI.closeBrowser()

