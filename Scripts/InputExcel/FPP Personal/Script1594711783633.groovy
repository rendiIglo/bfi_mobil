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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

/*
WebUI.click(findTestObject('FPP Online Personal/ddl_SurveyDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FPP Online Personal/ddl_SurveyDateItem_plus1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FPP Online Personal/ddl_SurveyTime'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FPP Online Personal/ddl_SurveyTimeItem_09'), FailureHandling.STOP_ON_FAILURE)
*/
WebUI.click(findTestObject('FPP Online Personal/a_UploadKtp'))

WebUI.delay(2)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('FPP Online Personal/a_UploadKtp'), GlobalVariable.projectPath + 
    '\\KTP.png')

WebUI.delay(5)

WebUI.click(findTestObject('FPP Online Personal/a_UploadSelfie'))

WebUI.delay(2)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('FPP Online Personal/a_UploadSelfie'), GlobalVariable.projectPath + 
    '\\Selfie.png')

WebUI.delay(5)

WebUI.click(findTestObject('FPP Online Personal/chk_Agree'))

WebUI.delay(1)

WebUI.click(findTestObject('FPP Online Personal/btn_Submit'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('FPP Online Personal/btn_PopUpOk'))

WebUI.delay(40)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

