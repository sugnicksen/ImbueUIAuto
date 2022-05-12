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

WebUI.callTestCase(findTestCase('Main Test Cases/TC1_AddEvaluation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Imbue_DeleteEvaluation/Page_CR App/evaluation_Delete'))

WebUI.waitForElementVisible(findTestObject('Imbue_DeleteEvaluation/Page_CR App/remove_EvaluationAlert'), 30)

String evaluationAlertText = WebUI.getText(findTestObject('Imbue_DeleteEvaluation/Page_CR App/remove_EvaluationAlert'))

if (evaluationAlertText == 'This will remove Test Katalon Evaluation from evaluations') {
    assert true
}

WebUI.click(findTestObject('Imbue_DeleteEvaluation/Page_CR App/evaluation_AlertOK'))

if(WebUI.waitForElementVisible(findTestObject('Imbue_DeleteEvaluation/Page_CR App/evaluation_DeletionConfirmation'), 20)) {
	assert true
}

