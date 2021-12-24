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
    WebUI.openBrowser('')

    WebUI.navigateToUrl(GlobalVariable.url)
} 

//WebUI.maximizeWindow()
WebUI.setText(findTestObject('Login/input_Username_UserName'), GlobalVariable.usernameLeads)

WebUI.setText(findTestObject('Login/input_Username_Password'), GlobalVariable.passwordLeads)

WebUI.click(findTestObject('Login/a_Login'))

if (WebUI.verifyElementPresent(findTestObject('Master/insecure_form'), 10, FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-LE/a_SendAnyway'))
}

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_LeadsDataInput'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.comment('Personal Info')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_SubBranch'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlSubBranch_' + ddlSubBranch))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingGeraiInput'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingGeraiInput'), 5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_GeraiInput'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlGeraiInput_' + ddlGeraiInput))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_Product'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlProduct_' + ddlProduct))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_DataType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlDataType_' + ddlDataType))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/ddl_CustomerType'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_ddlCustomerType_' + ddlCustomerType))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_NextButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 35, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 240, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.comment('Customer info')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/div_menuCustomer'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtCustomerName'), txtCustomerName)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtEmail'), txtEmail)

if (ddlDataType == 'Leads') {
    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtPlaceOfBirth'), txtCustomerPOB)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Customer/txtCustomerNPWP'), txtNPWP)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtIDExpiredDate'), txtIDExpiredDate)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtIDNo'), txtIDNo)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo2'), txtMobilePhone2)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtDateOfBirth'), txtDateOfBirth)
}

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo1'), txtMobilePhone1)

WebUI.sendKeys(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo1'), Keys.chord(
        Keys.TAB))

if (ddlDataType == 'Leads') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/ddl_MaritalStatusType'))

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/span_ddlMaritalStatus_' + ddlMaritalStatusType))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMotherMaidenName'), txtMotherMaidenName)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMonthlyIncome'), txtMonthlyIncome)

    WebUI.comment('Spouse Info')

    if (ddlMaritalStatusType == 'Married') {
        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtSpouseName'), 
            txtSpouseName)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtMobilePhone'), 
            txtSpouseMobilePhone)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtIDNo'), txtSpouseIDNo)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtPlaceOfBirth'), 
            txtSpousePOB)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtDateOfBirth'), 
            txtSpouseDOB)
    }
}

WebUI.scrollToPosition(0, 0)

if (ddlDataType == 'Leads') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/ddl_Religion'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/span_ddlReligion_' + ddlReligion))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/ddl_Occupation'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/span_ddlOccupation_' + ddlOccupation))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/RadioNationality' + radNationality), 
        FailureHandling.OPTIONAL)
}

if (ddlDataType == 'Database') {
    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 35, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 240, FailureHandling.OPTIONAL)
}

WebUI.check(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/RadioGender' + radGender), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/a_NextButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 180)

WebUI.delay(1)

if (WebUI.verifyElementPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'), 2, FailureHandling.OPTIONAL) == 
true) {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 180)

    WebUI.delay(1)
}

/*
try {
    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

    if (WebUI.verifyElementPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'), 10, FailureHandling.OPTIONAL)) {
        //if (ddlDataType == 'Leads') {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtCustomerName'), txtCustomerName)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/RadioGender' + radGender), 
            FailureHandling.OPTIONAL)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtEmail'), txtEmail)

        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo1'), txtMobilePhone1)

        if (ddlDataType == 'Leads') {
            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtIDNo'), txtIDNo)
        }
        
        if (ddlDataType == 'Leads') {
            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo2'), 
                txtMobilePhone2)
        }
        
        if (ddlDataType == 'Leads') {
            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtDateOfBirth'), txtDateOfBirth)
        }
        
        if (ddlDataType == 'Leads') {
            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/ddl_MaritalStatusType'))

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/span_ddlMaritalStatus_' + 
                    ddlMaritalStatusType))

            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMotherMaidenName'), 
                txtMotherMaidenName)

            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMonthlyIncome'), 
                txtMonthlyIncome)

            WebUI.comment('Spouse Info')

            if (ddlMaritalStatusType == 'Married') {
                WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtSpouseName'), 
                    txtSpouseName)

                WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtMobilePhone'), 
                    txtSpouseMobilePhone)

                WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtIDNo'), 
                    txtSpouseIDNo)

                WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtDateOfBirth'), 
                    txtSpouseDOB)
            }
        }
        
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/a_NextButton'))

        WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

        WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

        WebUI.delay(1)
    }
}
catch (Exception e) {
    WebUI.scrollToPosition(0, 0)

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    if (DupDataNo == '0') {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/a_NewButton'))
    } else {
        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/span_Found_Data' + 
                DupDataNo))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/PopUpDuplicate/a_ChooseButton'))

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

        if (ddlDataType == 'Leads') {
            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtIDNo'), txtIDNo)
        }
        
        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo1'), txtMobilePhone1)

        if (ddlDataType == 'Leads') {
            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/txtMobilePhoneNo2'), 
                txtMobilePhone2)
        }
        
        if (ddlDataType == 'Leads') {
            WebUI.comment('Spouse Info')

            if (ddlMaritalStatusType == 'Married') {
                WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/SpouseInfo/txtMobilePhone'), 
                    txtSpouseMobilePhone)
            }
        }
        
        WebUI.takeScreenshot(FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Customer/a_NextButton'))
    }
    
    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

    WebUI.delay(1)
} 
finally { 
    WebUI.takeScreenshot(FailureHandling.OPTIONAL)
}
*/
WebUI.comment('Address Tab')

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 30)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtAddress'), txtAddress)

if (ddlDataType == 'Leads') {
    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtRT'), txtRT)

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtRW'), txtRW)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/ddl_HouseStatus'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/span_ddlHouseStatus_' + ddlHouseStatus))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/a_ZIPCode'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.delay(1)

    WebUI.comment('Legal Address Tab')

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_ddlSearchBy_' + 
            ddlSearchBy))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/txtZIPCode'), txtZipCode)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_SearchButton'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.delay(3)

    WebUI.waitForElementClickable(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_Found_First'), 
        15)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_Found_First'))

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_ChooseButton'))

    WebUI.delay(1)

    switch (chkLegalSameAddress) {
        case 'No':
            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtLegalAddress'), txtLegalAddress)

            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtLegalRT'), txtLegalRT)

            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtLegalRW'), txtLegalRW)

            WebUI.sendKeys(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/txtLegalRW'), Keys.chord(
                    Keys.TAB))

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/a_LegalZIPCode'))

            WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

            WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

            WebUI.delay(1)

            WebUI.scrollToPosition(0, 0)

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/ddl_SearchBy'))

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_ddlSearchBy_' + 
                    ddlSearchBy))

            WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/txtZIPCode'), 
                txtLegalZipCode)

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_SearchButton'))

            WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

            WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 10)

            WebUI.delay(3)

            WebUI.waitForElementClickable(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_Found_First'), 
                15)

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/span_Found_First'))

            WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/PopUpZIPCode/a_ChooseButton'))

            WebUI.delay(1)

            break
    }
}

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 4)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Address/a_SaveButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(5)

WebUI.comment('Jobs')

if (ddlDataType == 'Leads') {
    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddl_Profession'))

    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddlProfesion/span_ddlProfession_' + 
            ddlProfession))

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 2)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

    WebUI.delay(2)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddl_JobLevel'))

    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddlJobLevel/span_ddlJobLevel_' + ddlJobLevel))

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 1)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 2)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddl_JobPosition'))

    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddlJobPosition/span_ddlJobPosition_' + 
            ddlPosition))

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 1)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 2)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddl_EconomySector'))

    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddlEconomySector/span_ddlEconomySector_' + 
            ddlEconomySector))

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 1)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 2)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddl_IndustryType'))

    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/ddlIndustryType/span_ddlIndustryType_' + 
            ddlIndustryType))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Job/a_SaveButton'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

    WebUI.delay(2)

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

    WebUI.delay(5)
}

WebUI.comment('Documents')

WebUI.comment('upload KTP')

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_ektp'))

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), txtKTPDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), txtKTPExpiredDate)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocumentDate'), txtKTPDocumentDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(2)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    GlobalVariable.projectPath + '\\KTP.png')

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(5)

WebUI.comment('SIM')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_SIM'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), txtSIMDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), txtSIMExpiredDate)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocumentDate'), txtSIMDocumentDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(2)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    GlobalVariable.projectPath + '\\SIM.jpg')

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(5)

WebUI.comment('NPWP')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_NPWP'))

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), txtNPWPDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), txtNPWPExpiredDate)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocumentDate'), txtNPWPDocumentDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(2)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    GlobalVariable.projectPath + '\\NPWP.jpg')

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(5)

WebUI.comment('STNK')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/a_NextPage'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/span_found_STNK'))

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocNo'), txtNPWPDocNo)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtExpiredDate'), txtNPWPExpiredDate)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/txtDocumentDate'), txtNPWPDocumentDate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'))

WebUI.delay(2)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_UploadIcon'), 
    GlobalVariable.projectPath + '\\NPWP.jpg')

WebUI.waitForElementNotPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/uploadStatus'), 
    0)

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Document/PopupUpload/a_SaveButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(5)

WebUI.comment('Lead Detail')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/div_menuLeadDetail'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 75)

WebUI.comment('Referal')

WebUI.delay(5)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddl_Activity'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddlActivityItem/span_ddlActivity_' + 
        ddlActivity))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 30)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddl_FinancePurpose'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/ddlFinancePurposeItem/span_ddlFinancePurpose_' + 
        ddlFinancePurpose))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

/* WebUI.comment('Referal')

if ((ddlActivity == 'Customer Get Customer') || (ddlActivity == 'Employee Get Customer (EGC)')) {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/a_ReferalName'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.delay(1)

    if (ddlActivity == 'Customer Get Customer') {
        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/popUpReferal/txtCustomerName'), 
            txtReferalName)
    } else {
        WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/popUpReferal/txtEmployeeName'), 
            txtReferalName)
    }
    
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/popUpReferal/a_btnSearch'))

    not_run: WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/popUpReferal/span_FoundFirstData'))

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/popUpReferal/a_btnChoose'))

    WebUI.delay(1)
} */
WebUI.comment('Add Row')

WebUI.scrollToPosition(0, 2000)

if (ddlDataType == 'Leads') {
    WebUI.callTestCase(findTestCase('InputExcel/AddCollateralInfo/CollateralInfo'), [('txtManufacturingYear') : txtManufacturingYear
            , ('txtLicensePlate') : txtLicensePlate, ('ddlBPKPBehalf') : ddlBPKPBehalf, ('radPotongFunding') : radPotongFunding
            , ('ddlSifatKredit') : ddlSifatKredit, ('ddlSupplierSearchBy') : ddlSupplierSearchBy, ('txtSupplierName') : txtSupplierName
            , ('ddlLJKSearchBy') : ddlLJKSearchBy, ('radRental') : radRental, ('txtGracePeriod') : txtGracePeriod, ('txtEffectiveRate') : txtEffectiveRate
            , ('ddlFirstInstalment') : ddlFirstInstalment, ('ddlCalculationMethod') : ddlCalculationMethod, ('txtFundingAmount') : txtFundingAmount
            , ('txtTenor') : txtTenor, ('ddlProductOfferingSearchBy') : ddlProductOfferingSearchBy, ('txtProductOfferingID') : txtProductOfferingID
            , ('txtAdmin') : txtAdmin, ('txtCMP') : txtCMP, ('txtSurveyFee') : txtSurveyFee, ('txtNotaryFee') : txtNotaryFee
            , ('txtOtherFee') : txtOtherFee, ('txtPersenProvisi') : txtPersenProvisi, ('ddlPaidBy') : ddlPaidBy, ('ddlInsuredBy') : ddlInsuredBy
            , ('ddlAssetInsuranceCapitalize') : ddlAssetInsuranceCapitalize, ('ddlLifeInsurance') : ddlLifeInsurance, ('ddlLifeInsuranceCompany') : ddlLifeInsuranceCompany
            , ('ddlLifeInsuranceCapitalized') : ddlLifeInsuranceCapitalized, ('txtAssetDescription') : txtAssetDescription
            , ('txtNameLJK') : txtNameLJK, ('radContinueInsurance') : radContinueInsurance], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.click(findTestObject('TC.06_Leads Data Input-Database-Personal/a_addRow'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 30)

    WebUI.delay(8)

    WebUI.waitForElementClickable(findTestObject('TC.06_Leads Data Input-Database-Personal/txtManufacturingYear'), 30)

    WebUI.setText(findTestObject('TC.06_Leads Data Input-Database-Personal/txtManufacturingYear'), txtManufacturingYear)

    WebUI.sendKeys(findTestObject('TC.06_Leads Data Input-Database-Personal/txtManufacturingYear'), Keys.chord(Keys.TAB))

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.comment('pop up asset code')

    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('TC.06_Leads Data Input-Database-Personal/a_AssetCode'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/ddlSearchByItem/span_ddlSearchBy_Asset Description'))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/txtAssetDescription'), 
        txtAssetDescription)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnSearch'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/span_FoundFirstData'))

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20)

    WebUI.delay(3)

    WebUI.setText(findTestObject('TC.06_Leads Data Input-Database-Personal/txtLicensePlate'), txtLicensePlate)

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_Save'))

    WebUI.delay(5)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))
}

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 15)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/a_SaveButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/a_SubmitButton'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 12)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(3)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('TC.03_Leads Data Input-Leads-Personal/span_Leads Search List'), 0)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/ddlLeadsDataSearchBy'))

WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/span_ddlLeadsDataSearchBy_' + ddlLeadsDataSearchBy))

WebUI.setText(findTestObject('TC.02_Leads Data Search-Leads-Personal/txtLeadsName'), txtCustomerName)

WebUI.click(findTestObject('TC.02_Leads Data Search-Leads-Personal/btnSearch'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

def LeadsID = WebUI.getText(findTestObject('TC.02_Leads Data Search-Leads-Personal/span_FoundFirstDataLeadsID'))

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_User'))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Master/button_Logout'))

WebUI.callTestCase(findTestCase('InputExcel/Workspace'), [('LeadsIDWorkspace') : LeadsID, ('ddlDataType') : ddlDataType], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

if (ddlDataType == 'Leads') {
    WebUI.callTestCase(findTestCase('InputExcel/AdminVer Personal'), [('LeadsIDAdminVer') : LeadsID], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('InputExcel/MarketingVisit'), [('LeadsID') : LeadsID, ('txtVisitScheduleDate') : '30-Jun-2021'
            , ('txtVisitScheduleTime') : '14:00', ('txtIDNo') : '8986787683475708', ('txtMobilePhone2') : '9922442796', ('txtEmail') : 'rifka@dev-ad.co.id'
            , ('txtNPWP') : '123456789012345', ('txtCustomerPOB') : 'Jakarta', ('txtDateOfBirth') : '15/12/1982', ('radGender') : 'Male'
            , ('radNationality') : 'WNI', ('ddlMaritalStatusType') : 'Married', ('txtIDExpiredDate') : '15/12/2024', ('ddlReligion') : 'Islam'
            , ('txtMotherMaidenName') : 'Illana', ('txtMonthlyIncome') : '50000000', ('txtSpouseName') : 'Sujatmiko Y', ('ddlOccupation') : 'EMPLOYEE'
            , ('txtSpouseMobilePhone') : '85454354354', ('txtSpouseIDNo') : '1230984567651234', ('txtSpousePOB') : 'Medan'
            , ('txtSpouseDOB') : '25/02/1990', ('DupDataNo') : '0', ('ddlHouseStatus') : 'Sendiri', ('ddlSearchBy') : 'Zipcode'
            , ('ddlSupplierSearchBy') : 'Supplier Name', ('ddlAssetSearchBy') : 'Asset Description', ('txtAddress') : 'Jalan Sermorganhmat No.102'
            , ('txtRT') : '008', ('txtRW') : '003', ('ddlProvince') : 'SUMATERA UTARA', ('txtZipCode') : '20229', ('chkLegalSameAddress') : 'No'
            , ('txtLegalAddress') : 'Jalan Sermorganhmat No.102', ('txtLegalRW') : '003', ('txtLegalRT') : '008', ('ddlLegalProvince') : 'SUMATERA UTARA'
            , ('txtLegalZipCode') : '20229', ('ddlProfession') : 'KARYAWAN SWASTA', ('ddlJobLevel') : 'IT Specialist', ('ddlPosition') : 'Supervisor'
            , ('ddlEconomySector') : 'JASA', ('ddlIndustryType') : 'JASA LAINNYA', ('ddlActivity') : 'Pameran', ('ddlFinancePurpose') : 'Productive'
            , ('txtReferalName') : 'Agus', ('txtManufacturingYear') : '2010', ('radPotongFunding') : 'No', ('txtLicensePlate') : 'A 083 ZXA'
            , ('ddlBPKPBehalf') : 'Sendiri', ('radRental') : 'No', ('ddlSifatKredit') : 'New-RO-Take Over', ('txtSupplierName') : 'Supplier Individu'
            , ('txtAssetDescription') : 'Chevrolet Aveo 1.5 AT', ('ddlLJKSearchBy') : 'Nama LJK', ('txtNameLJK') : 'Bank BNI 1946'
            , ('txtFundingAmount') : '7000000', ('txtTenor') : '12', ('ddlFirstInstalment') : 'Arrears', ('ddlProductOfferingSearchBy') : 'Product Offering ID'
            , ('txtProductOfferingID') : '40010121AI', ('ddlInsuranceType') : 'Fire', ('chkBanjirBadaiLongsor') : 'Yes', ('chkBengkelAuthorized') : 'No'
            , ('chkHuruHaraTerorisme') : 'No', ('chkGempaTsunami') : 'Yes', ('txtCMP') : '300000', ('txtSurveyFee') : '300000'
            , ('txtNotaryFee') : '1500000', ('txtOtherFee') : '4500000', ('txtProvisi') : '157500', ('txtAdmin') : '800000'
            , ('txtPersenProvisi') : '8', ('ddlCMP') : '50000', ('ddlInsuredBy') : 'BFI Customer', ('ddlPaidBy') : 'At Cost'
            , ('txtInsuranceLength') : '12', ('ddlLifeInsurance') : 'insured', ('ddlLifeInsuranceCompany') : 'Asuransi Cigna, PT - Mobil (18-39)'
            , ('txtEffectiveRate') : '30', ('txtGracePeriod') : '0', ('ddlCalculationMethod') : 'Regular Fixed', ('ddlAssetInsuranceCapitalize') : 'Full Amount'
            , ('txtCoverageExistingInsurance') : '0', ('ddlLifeInsuranceCapitalized') : 'Full Amount', ('ddlLeadsDataSearchBy') : 'Leads Name'
            , ('txtPICMobileNumber') : '81234567890'], FailureHandling.STOP_ON_FAILURE)
}

/*
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
WebUI.closeBrowser()

