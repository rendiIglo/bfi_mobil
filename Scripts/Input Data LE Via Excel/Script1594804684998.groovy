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

try {
    String s = WebUI.getUrl()

    WebUI.navigateToUrl(GlobalVariable.url)
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser(GlobalVariable.url)
} 

WebUI.setText(findTestObject('Login/input_Username_UserName'), GlobalVariable.usernameLeads)

WebUI.setText(findTestObject('Login/input_Username_Password'), GlobalVariable.passwordLeads)

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(2)

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_LeadsDataInput'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(2)

WebUI.comment('Personal Info')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_SubBranch'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlSubBranch_' + ddlSubBranch))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_GeraiInput'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlGeraiInput_' + ddlGeraiInput))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_Product'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlProduct_' + ddlProduct))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_DataType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlDataType_' + ddlDataType))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/ddl_CustomerType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/span_ddlCustomerType_' + ddlCustomerType))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_NextButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 360)

WebUI.comment('Customer info')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/div_menuCustomer'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerName'), txtCustomerName)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerNPWP'), txtCustomerNPWP)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/ddl_CompanyType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/span_ddlCompanyType_CV'))

if (ddlDataType == 'Leads') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/ddl_EconomySector'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/span_ddlEconomySector_JASA'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/ddl_IndustryType'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/span_ddlIndustrySector_JASA LAINNYA'))
}

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhoneArea'), '62')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhone'), '162357615')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhoneArea2'), '62')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhone2'), '12351763')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtMobilePhoneNo1'), '162357615')

if (ddlDataType == 'Leads') {
	WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtMobilePhoneNo2'), '12351763')
}

WebUI.delay(2)

if (ddlDataType == 'Leads') {
    WebUI.comment('Debtor Group')

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/Btn_DebtorGroup'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/Btn_DebtorGroup'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/span_ddlSearchBy_Code'))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/txtSearchBy'), '01')

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/btn_Search'))

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/span_SearchFirstData'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/btn_Choose'))

    WebUI.delay(1)

    WebUI.comment('Slik Kode Golongan Debitur')

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/Btn_Slik Kode Golongan Debitur'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/span_ddlSearchBy_Code'))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/txtSearchBy'), '0010')

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/btn_Search'))

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/span_SearchFirstData'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/btn_Choose'))

    WebUI.delay(1)

    WebUI.comment('Counterpart Category')

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/Btn_Counterpart Category'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/span_ddlSearchBy_Code'))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpCounterpartCategory/txtSearchBy'), 
        '169')

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/btn_Search'))

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/span_SearchFirstData'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/PopUpDebtorGroup/btn_Choose'))

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/ddl_BusinessScale'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/span_ddlBusinessScale_Usaha Kecil'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/RadioGoPublic_Yes'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/RadioAffiliateWithPP_Yes'))
}
    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtEmail'), txtEmail)
if (ddlDataType == 'Leads') {
    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtNumberOfEmployee'), '123')

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtYearOfEstablish'), '1890')
}

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/a_NextButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 180)
if (ddlDataType == 'Leads') {
	WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))
}

/*
WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.comment('Duplicate check')

try {
    WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

    if (WebUI.verifyElementPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'), 10, FailureHandling.OPTIONAL)) {
        //if (ddlDataType == 'Leads') {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerName'), txtCustomerName)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerNPWP'), txtCustomerNPWP)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhoneArea'), txtCustomerPhoneArea)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhone'), txtCustomerPhone)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtEmail'), txtEmail)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtMobilePhoneNo1'), txtMobilePhone1)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/a_NextButton'))

        WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

        WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

        WebUI.delay(1)
    }
}
catch (Exception e) {
    WebUI.scrollToPosition(0, 0)

    WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

    if (DupDataNo == '0') {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/a_NewButton'))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))
    } else {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/span_Found_Data' + 
                DupDataNo))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/a_ChooseButton'))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerName'), txtCustomerName)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerNPWP'), txtCustomerNPWP)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhoneArea'), txtCustomerPhoneArea)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerPhone'), txtCustomerPhone)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtEmail'), txtEmail)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtMobilePhoneNo1'), txtMobilePhone1)

        WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/a_NextButton'))
    }
    
    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

    WebUI.delay(1)
} 
finally { 
    WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)
}
*/

WebUI.callTestCase(findTestCase('InputExcel/LE/Address'), [('txtAddress') : txtAddress, ('txtRT') : txtRT, ('txtRW') : txtRW, ('ddlCountry') : ddlCountry
	, ('txtZipCode') : txtZipCode], FailureHandling.STOP_ON_FAILURE)

/*
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
*/
if (ddlDataType == 'Leads') {
WebUI.comment('Comittee')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/btnAdd'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/ddl_IDType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/span_ddlIDType_KTP'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeName'), txtCustomerName)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtKTP'), '1234567890123456')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteePOB'), 'Jakarta')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeDOB'), '10/10/1990')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/RadioGenderMale'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/RadioNationalityWNI'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeAddress'), txtAddress)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeRT'), txtRT)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeRW'), txtRW)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeMobilePhone'), txtMobilePhone1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/txtCommitteeShareHolder'), '100')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/ddl_Position'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/span_ddlPosition_OWNER'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/ddl_RelationWithDebt'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/span_ddlRelationWithDebt_Other'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/RadioIsOwnerYes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/RadioCommitteeStatusActive'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/a_ZIPCode'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 15)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/PopUpZIPCode/ddl_SearchBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/PopUpZIPCode/span_ddlSearchBy_ZipCode'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/PopUpZIPCode/txtZIPCode'), txtZipCode)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/PopUpZIPCode/a_SearchButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp21'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp21'), 180)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/PopUpZIPCode/span_Found_First'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/PopUpZIPCode/a_ChooseButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/btnSave'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Committee/a_NextButton'))
}
/*
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/ddl_Province'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Address/ddlProvinceItem/span_ddlProvince_' + ddlProvince))
*/

WebUI.comment('Documents')

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)
if (ddlDataType == 'Leads') {
WebUI.comment('upload Akte')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/span_found_Akte'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocNo'), txtKTPDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtExpiredDate'), txtKTPExpiredDate)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocumentDate'), txtKTPExpiredDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    (GlobalVariable.projectPath + '\\') + txtKTPFilePath)

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.delay(1)

WebUI.comment('NPWP')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/span_found_NPWP'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocNo'), txtNoRangkaDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtExpiredDate'), txtNoRangkaExpiredDate)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocumentDate'), txtNoRangkaExpiredDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    (GlobalVariable.projectPath + '\\') + txtNoRangkaFilePath)

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.delay(1)

WebUI.comment('Notice Pajak')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/span_found_Foto Notice Pajak'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocNo'), txtNPWPDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtExpiredDate'), txtNPWPExpiredDate)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocumentDate'), txtNPWPExpiredDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    (GlobalVariable.projectPath + '\\') + txtNPWPFilePath)

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.delay(1)

WebUI.comment('STNK')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/a_NextPage'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/span_found_STNK'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 180)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocNo'), txtSIMDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtExpiredDate'), txtSIMExpiredDate)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/txtDocumentDate'), txtSIMExpiredDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    (GlobalVariable.projectPath + '\\') + txtSIMFilePath)

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.delay(1)
}
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Document/a_NextButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.comment('Lead Detail')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/ddl_Activity'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/span_ddlActivity_' + ddlActivity))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/ddl_Activity'), 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/ddl_FinancePurpose'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/span_ddlFinancePurpose_' + ddlFinancePurpose))

if ((ddlActivity == 'Customer Get Customer') || (ddlActivity == 'Employee Get Customer (EGC)')) {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/a_ReferalName'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

    WebUI.delay(1)

    not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/popUpReferal/txtBranchID'), 
        '401')

    not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/popUpReferal/txtEmployeeID'), 
        'adisf401')

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/popUpReferal/txtEmployeeName'), 
        txtReferalName)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/popUpReferal/a_btnSearch'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/popUpReferal/span_FoundFirstData'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/popUpReferal/a_btnChoose'))

    WebUI.delay(1)
}

WebUI.comment('Add Row')
if (ddlDataType == 'Leads') {
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/a_addRow'))
}
else
{
	WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/a_DBaddRow'))
}
WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtProductionYear'), 
    txtProductionYear)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtLicensePlate'), 
    txtLicensePlate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_BPKPBehalf'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlBPKPBehalf_' + 
        ddlBPKPBehalf))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioRental' + 
        radRental))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_SifatKredit'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddlSifatKreditItem/span_ddlSifatKredit_' + 
        ddlSifatKredit))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioPotongFundingYes'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_SupplierName'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/ddl_SearchBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_ddlSearchBy_Supplier Name'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/txtSupplierName'), 
    txtSupplierName)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnSearch'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_AssetCode'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/ddl_SearchBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/span_ddlSearchBy_Asset Description'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/txtAssetDescription'), 
    txtAssetDesription)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnSearch'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

WebUI.delay(1)

if (ddlSifatKredit == 'New-RO-Take Over') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_LembagaLJK'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/span_ddlSearchBy_Nama LJK'))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/txtNamaLJK'), 
        txtNameLJK)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/a_btnSearch'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

    WebUI.delay(1)
}

WebUI.comment('Finance info')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtFundingAmount'), 
    txtFundingAmount)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtTenor'), 
    txtTenor)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtGracePeriod'), 
    '10')

WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_TitleFinanceInfo'), 
    0)

/*
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_FirstInstallment'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_FirstInstallment'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlFirstInstallment_' + 
        ddlFirstInstallment))*/
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_CalculationMethod'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlCalculationMethod_Regular Fixed'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtEffectiveRate'), 
    '70')

WebUI.delay(1)

WebUI.comment('Popup Product Offering')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_ProductOffering'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/ddl_SearchBy'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/span_ddlSearchBy_Product Offering ID'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/txtProductOfferingID'), 
    txtProductOfferingID)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/a_btnSearch'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp3'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp3'), 20)

WebUI.delay(1)

/*
WebUI.comment('Insurance')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_InsuranceType'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlinsuranceType_' + 
        ddlInsuranceType))

if (chkBanjirBadaiLongsor == 'Yes') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkBanjirBadaiLongsor'))
}

if (chkBengkelAuthorized == 'Yes') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkBengkelAuthorized'))
}

if (chkHuruHaraTerorisme == 'Yes') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkHuruHaraTerorisme'))
}

if (chkGempaTsunami == 'Yes') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkGempaTsunami'))
}

WebUI.delay(1)*/
WebUI.comment('Fee')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtAdminFee'), 
    '800001')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtCMP'), 
    txtCMP)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtSurveyFee'), 
    txtSurveyFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtProvisi'), 
    txtProvisi)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtNotaryFee'), 
    txtNotaryFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtOtherFee'), 
    txtOtherFee)

WebUI.comment('Asset Insurance')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_PaidBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlPaidBy_Customer'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioContinueInsuranceYes'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_InsuredBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlInsuredBy_Customer'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioCoveragePeriodeFullTenor'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_AssetInsuranceCapitalize'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlAssetInsuranceCapitalize_Full Amount'))

WebUI.comment('Insurance by Customer Company')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtAmountCoverage'), 
    txtOtherFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtCustomerName'), 
    txtCustomerName)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtInsuranceCo'), 
    txtOtherFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtInsuranceNotes'), 
    txtOtherFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtPolicyName'), 
    txtOtherFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtPolicyNo'), 
    txtOtherFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtTenorCredit'), 
    txtOtherFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtInsurancePeriodeDate'), 
    '03-Nov-2021')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/ddl_CoverageType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/span_ddl_CoverageType_ALL RISK - Copy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/ddl_ApplicationType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/span_ddl_ApplicationType_Group'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkAmortization'))

WebUI.comment('End')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_Calculate'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

not_run: WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_Save'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/a_SaveButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/a_SubmitButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_Ok'))

WebUI.waitForElementPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_Leads Search List'), 0)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

def LeadsID = WebUI.getText(findTestObject('TC.02_Leads Data Search-Leads-Personal/span_FoundFirstDataLeadsID'))

WebUI.comment(LeadsID)

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_User'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Master/button_Logout'))

if (ddlDataType == 'Leads') {
    /*    WebUI.callTestCase(findTestCase('InputExcel/openEmail'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('InputExcel/FPP Legal Entity'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('InputExcel/AdminVer LE'), [('LeadsIDAdminVer') : LeadsID], FailureHandling.STOP_ON_FAILURE)

    

    
if (ddlDataType == 'Leads') {
    WebUI.callTestCase(findTestCase('InputExcel/openEmail'), [:], FailureHandling.OPTIONAL)

    WebUI.callTestCase(findTestCase('InputExcel/FPP Personal'), [('txtCustomerNameFPP') : txtCustomerName, ('txtAddressFPP') : txtAddress
            , ('txtRWFPP') : txtRW, ('txtRTFPP') : txtRT, ('txtMobilePhoneFPP') : txtMobilePhone1, ('txtZipCodeFPP') : txtZipCode
            , ('txtIDNoFPP') : txtIDNo], FailureHandling.OPTIONAL)

    WebUI.callTestCase(findTestCase('InputExcel/AdminVer Personal'), [('LeadsIDAdminVer') : LeadsID], FailureHandling.OPTIONAL)

    WebUI.delay(1)
} else {
    WebUI.callTestCase(findTestCase('InputExcel/Workspace'), [('LeadsIDWorkspace') : LeadsID], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('InputExcel/MarketingVisit'), [('LeadsID') : '20210608401L000338', ('txtVisitScheduleDate') : '30-Jun-2021'
            , ('txtVisitScheduleTime') : '14:00', ('txtIDNo') : '8986787683475708', ('txtMobilePhone2') : '9922442796', ('txtEmail') : 'rifka@dev-ad.co.id'
            , ('txtNPWP') : '123456789012345', ('txtCustomerPOB') : 'Jakarta', ('txtDateOfBirth') : '15/12/1982', ('radGender') : 'Male'
            , ('radNationality') : 'WNI', ('ddlMaritalStatusType') : 'Married', ('txtIDExpiredDate') : '15/12/2024', ('ddlReligion') : 'Islam'
            , ('txtMotherMaidenName') : 'Illana', ('txtMonthlyIncome') : '50000000', ('txtSpouseName') : 'Sujatmiko Y', ('ddlOccupation') : 'EMPLOYEE'
            , ('txtSpouseMobilePhone') : '85454354354', ('txtSpouseIDNo') : '1230984567651234', ('txtSpousePOB') : 'Medan'
            , ('txtSpouseDOB') : '25/02/1990', ('DupDataNo') : '0', ('ddlHouseStatus') : 'Sendiri', ('ddlSearchBy') : 'Zipcode'
            , ('ddlSupplierSearchBy') : 'Supplier Name', ('ddlAssetSearchBy') : 'Asset Description', ('txtAddress') : 'Jalan Sermorganhmat No.102'
            , ('txtRT') : '008', ('txtRW') : '003', ('ddlProvince') : 'SUMATERA UTARA', ('txtZipCode') : '20121', ('chkLegalSameAddress') : 'No'
            , ('txtLegalAddress') : 'Jalan Sermorganhmat No.102', ('txtLegalRW') : '003', ('txtLegalRT') : '008', ('ddlLegalProvince') : 'SUMATERA UTARA'
            , ('txtLegalZipCode') : '20121', ('ddlProfession') : 'KARYAWAN SWASTA', ('ddlJobLevel') : 'IT Specialist', ('ddlPosition') : 'Supervisor'
            , ('ddlEconomySector') : 'JASA', ('ddlIndustryType') : 'JASA LAINNYA', ('ddlActivity') : 'Pameran', ('ddlFinancePurpose') : 'Productive'
            , ('txtReferalName') : 'Agus', ('txtManufacturingYear') : '2010', ('radPotongFunding') : 'No', ('txtLicensePlate') : 'A 083 ZXA'
            , ('ddlBPKPBehalf') : 'Sendiri', ('radRental') : 'No', ('ddlSifatKredit') : 'New-RO-Take Over', ('txtSupplierName') : 'Supplier Individu'
            , ('txtAssetDescription') : 'Chevrolet Aveo 1.5 AT', ('ddlLJKSearchBy') : 'Nama LJK', ('txtNameLJK') : 'Bank BNI 1946'
            , ('txtFundingAmount') : '7000000', ('txtTenor') : '12', ('ddlFirstInstalment') : 'Arrears', ('ddlProductOfferingSearchBy') : 'Product Offering ID'
            , ('txtProductOfferingID') : '40010121AI', ('ddlInsuranceType') : 'Fire', ('chkBanjirBadaiLongsor') : 'Yes', ('chkBengkelAuthorized') : 'No'
            , ('chkHuruHaraTerorisme') : 'No', ('chkGempaTsunami') : 'Yes', ('txtCMP') : '300000', ('txtSurveyFee') : '300000'
            , ('txtNotaryFee') : '1500000', ('txtOtherFee') : '4500000', ('txtProvisi') : '157500', ('txtAdmin') : '800000'
            , ('txtPersenProvisi') : '8', ('ddlCMP') : '50000', ('ddlInsuredBy') : 'Customer', ('ddlPaidBy') : 'BFI', ('txtInsuranceLength') : '12'
            , ('ddlLifeInsurance') : 'insured', ('ddlLifeInsuranceCompany') : 'Asuransi Cigna, PT - Mobil (18-39)', ('txtEffectiveRate') : '30'
            , ('txtGracePeriod') : '0', ('ddlCalculationMethod') : 'Regular Fixed', ('ddlAssetInsuranceCapitalize') : 'Full Amount'
            , ('txtCoverageExistingInsurance') : '0', ('ddlLifeInsuranceCapitalized') : 'Full Amount', ('ddlLeadsDataSearchBy') : 'Leads Name'
            , ('txtPICMobileNumber') : '81234567890'], FailureHandling.STOP_ON_FAILURE)
}*/
    WebUI.delay(1)

    WebUI.callTestCase(findTestCase('InputExcel/Workspace'), [('LeadsIDWorkspace') : LeadsID], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('InputExcel/AdminVer LE'), [('LeadsIDAdminVer') : LeadsID], FailureHandling.STOP_ON_FAILURE)
}

not_run: WebUI.closeBrowser()

