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
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser(GlobalVariable.outlookURL)

WebUI.setText(findTestObject('email/input_Username'), GlobalVariable.email)

WebUI.setText(findTestObject('email/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('email/button_SignIn'))

WebUI.delay(1)

WebUI.delay(75)

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('email/span_firstData'))

WebUI.delay(1)

WebUI.waitForElementNotVisible(findTestObject('email/divLoadingMail'), 20)

WebUI.waitForElementPresent(findTestObject('email/button_URLLink'), 20)

def a = WebUI.getAttribute(findTestObject('email/button_URLLink'), 'href')

//def b = a.substring(0, 4) + a.substring(5)
WebUI.navigateToUrl(a)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingFPPOnline'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingFPPOnline'), 0)

WebUI.delay(1)

