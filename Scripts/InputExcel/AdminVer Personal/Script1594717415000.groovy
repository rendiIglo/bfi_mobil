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
import org.openqa.selenium.Keys as Keys

try {
    String s = WebUI.getUrl()

    WebUI.navigateToUrl(GlobalVariable.url)
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(GlobalVariable.url)
} 

//WebUI.maximizeWindow()
WebUI.setText(findTestObject('Login/input_Username_UserName'), GlobalVariable.usernameAdminver)

WebUI.setText(findTestObject('Login/input_Username_Password'), GlobalVariable.passwordAdminVer)

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(1)

if (WebUI.verifyElementPresent(findTestObject('Master/insecure_form'), 10, FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_SendAnyway'))
}

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.delay(30)

WebUI.click(findTestObject('Master/a_Admin Verification'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 0)

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_Personal/ddlAdminVerifSearchBy'))

WebUI.click(findTestObject('TC.02_Personal/ddlAdminVerifSearchByItem/itemLeadsID'))

WebUI.setText(findTestObject('TC.02_Personal/txtLeadsID'), LeadsIDAdminVer)

WebUI.sendKeys(findTestObject('TC.02_Personal/txtLeadsID'), Keys.chord(Keys.TAB))

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_Personal/ddlCustomerType'))

WebUI.click(findTestObject('TC.02_Personal/ddlCustomerTypeItem/itemPersonal'))

WebUI.click(findTestObject('TC.02_Personal/ddlProduct'))

WebUI.click(findTestObject('TC.02_Personal/ddlProductItem/itemNDFCar'))

WebUI.click(findTestObject('TC.02_Personal/btnSearch'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('TC.02_Personal/SpanFoundFirst'))

WebUI.click(findTestObject('TC.02_Personal/btnProcess'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 30)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 180)

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_Personal/Detail/Document Checklist/data/divCustomer'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.02_Personal/Detail/Document Checklist/data/Customer/chkUnmatchCustomerName'))

not_run: WebUI.click(findTestObject('TC.02_Personal/Detail/Document Checklist/data/Customer/chkUnmatchMobilePhone1'))

not_run: WebUI.setText(findTestObject('TC.02_Personal/Detail/Document Checklist/data/Customer/txtCustomerName'), 'Rifkayi')

not_run: WebUI.setText(findTestObject('TC.02_Personal/Detail/Document Checklist/data/Customer/txtMobilePhone1'), '081234567890')

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_Personal/Detail/Document Checklist/data/divLeadDetail'))

WebUI.click(findTestObject('TC.02_Personal/Detail/Document Checklist/data/LeadDetail/btnSubmit'))

WebUI.delay(8)

WebUI.click(findTestObject('Master/a_User'))

WebUI.click(findTestObject('Master/button_Logout'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

