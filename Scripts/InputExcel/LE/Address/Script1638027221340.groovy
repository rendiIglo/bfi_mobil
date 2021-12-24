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

WebUI.comment('Address')

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 180)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 180)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/txtAddress'), txtAddress)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/txtRT'), txtRT)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/txtRW'), txtRW)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/ddl_Country'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/ddlCountryItem/span_ddlCountry_' + ddlCountry))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/a_ZIPCode'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/ddl_SearchBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/span_ddlSearchBy_ZipCode'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/txtZIPCode'), txtZipCode)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/a_SearchButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/span_Found_First'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/PopUpZIPCode/a_ChooseButton'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/a_SaveButton'), 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/a_SaveButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

