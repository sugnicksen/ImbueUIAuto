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

WebUI.click(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/div_Imbue'))

WebUI.click(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/button_Add Evaluation'))

WebUI.setText(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/input_Evaluation Title_title'), 'Test Katalon Evaluation')

WebUI.setText(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/input_consultant_mui-33615'), 'Sugnick')

WebUI.click(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/li_SSSugnick Sen'))

WebUI.setText(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/input_evaluators_mui-4366'), 'Vams')

WebUI.click(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/div_Vamsee Chathupuram'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/input_evaluators_mui-4366'), 'Murali')

WebUI.click(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/div_Murali Maraka'))

WebUI.setText(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/input_owners_mui-92505'), 'Alisha')

WebUI.click(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/div_Alisha Mahapatro'))

WebUI.click(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/body_You need to enable JavaScript to run t_577f9f'))

WebUI.click(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/select_JD'))

WebUI.click(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/li_FastAPI.docx'))

WebUI.setText(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/input_Start Date_date-picker-inline'), '17/04/2025')

WebUI.setText(findTestObject('Imbue_AddEvaluation/Page_CR App/endDatePicker'), '22/04/2025')

WebUI.setText(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/textarea_Note_note'), 'Test Evaluation for Katalon')

WebUI.click(findTestObject('Object Repository/Imbue_AddEvaluation/Page_CR App/span_Create'))

WebUI.delay(10)

