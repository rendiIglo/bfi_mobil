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

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/a_addRow'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 15)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtManufacturingYear'), 
    txtManufacturingYear)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 8)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 8)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtLicensePlate'), 
    txtLicensePlate)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_BPKPBehalf'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddlBPKPBehalfItem/span_ddlBPKPBehalf_' + 
        ddlBPKPBehalf))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

WebUI.delay(2)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioPotongFunding' + 
        radPotongFunding), FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

//WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_SifatKredit'), 0)
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_SifatKredit'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddlSifatKreditItem/span_ddlSifatKredit_' + 
        ddlSifatKredit))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.comment('pop up supplier')

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_SupplierName'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/ddl_SearchBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_ddlSearchBy_' + 
        ddlSupplierSearchBy))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/txtSupplierName'), 
    txtSupplierName)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnSearch'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 4, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 6, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/span_FoundFirstData'))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

WebUI.delay(1)

WebUI.comment('pop up asset code')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_AssetCode'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/ddl_SearchBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/ddlSearchByItem/span_ddlSearchBy_Asset Description'))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/txtAssetDescription'), 
    txtAssetDescription)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnSearch'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 4, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 5, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Asset/span_FoundFirstData'))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 8, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.comment('Popup LJK')

if (ddlSifatKredit == 'New-RO-Take Over') {
    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_LembagaLJK'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/ddl_SearchBy'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/ddlSearchByItem/span_ddlSearchBy_' + 
            ddlLJKSearchBy))

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/txtNamaLJK'), 
        txtNameLJK)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/a_btnSearch'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 12, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/span_FoundFirstData'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 10, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

    WebUI.takeScreenshot(FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/LembagaLJK/a_btnChoose'))

    WebUI.delay(1)
}

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioRental' + 
        radRental), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.comment('Finance info')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtGracePeriod'), 
    txtGracePeriod)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtEffectiveRate'), 
    txtEffectiveRate)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_FirstInstallment'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlFirstInstallment_' + 
        ddlFirstInstalment))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_CalculationMethod'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/CalculationMethod/span_ddlCalculationMethod_' + 
        ddlCalculationMethod))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtFundingAmount'), 
    txtFundingAmount)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtTenor'), 
    txtTenor)

WebUI.sendKeys(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtTenor'), 
    Keys.chord(Keys.TAB))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.comment('Popup Product Offering')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_ProductOffering'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 15, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 20, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/ddl_SearchBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/ddlSearchByItem/span_ddlSearchBy_' + 
        ddlProductOfferingSearchBy))

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/txtProductOfferingID'), 
    txtProductOfferingID)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/a_btnSearch'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 8, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 8, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ProductOffering/span_FoundFirstData'))

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/Supplier/a_btnChoose'))

WebUI.delay(1)

WebUI.comment('Biaya Biaya')

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtAdmin'), 
    txtAdmin)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtCMP'), 
    txtCMP)

/*WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_CMP'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlCMP_' + 
            ddlCMP))*/
WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtSurveyFee'), 
    txtSurveyFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtNotaryFee'), 
    txtNotaryFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtOtherFee'), 
    txtOtherFee)

WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/txtPersenProvisi'), 
    txtPersenProvisi)

WebUI.delay(1)

WebUI.comment('Asset Insurance')

WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input-Leads-LE/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/div_titleAssetInsurance'), 
    0)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_PaidBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlPaidBy_' + 
        ddlPaidBy))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioCoveragePeriodeFullTenor'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 2)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 4)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioContinueInsurance' + 
        radContinueInsurance))

WebUI.delay(2)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_InsuredBy'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlInsuredBy_' + 
        ddlInsuredBy))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_AssetInsuranceCapitalize'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlAssetInsuranceCapitalize_Full Amount'))

if (radContinueInsurance == 'Yes') {
    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtCustomerName'), 
        'Customer Name')

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtAmountCoverage'), 
        '123123')

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtPolicyNo'), 
        '123123123')

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtPolicyName'), 
        'Policy Name')

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtTenorCredit'), 
        '123123123')

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtInsuranceCo'), 
        '123123123')

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtInsuranceNotes'), 
        'Insurance Notes')

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtInsurancePeriodStart'), 
        '01-Jan-2022')

    WebUI.setText(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/txtInsurancePeriodTo'), 
        '01-Jan-2023')

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/ddlCoverageType'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/ddlCoverageType'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/span_ddlCoverageType_ALL RISK'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/ddlApplicationType'))

    WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/InsuranceCustomerCompany/span_ddlApplicationType_GROUP'))
}

/*
WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlAssetInsuranceCapitalize_' + 
        ddlAssetInsuranceCapitalize))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 25, FailureHandling.OPTIONAL)

WebUI.delay(5)*/
/*  WebUI.comment('Insurance')

	if (chkBanjirBadaiLongsor == 'Yes') {
		WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkBanjirBadaiLongsor'))
	}
	
	if (chkBengkelAuthorized == 'Yes') {
		WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkBengkelAuthorized'))
	}
	
	if (chkHuruHaraTerorisme == 'Yes') {
		WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkHuruHaraTerorisme'))
	}
	
	if (chkGempaTsunami == 'Yes') {
		WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkGempaTsunami'))
	} */
//if(continue insurance) ??
WebUI.comment('Life Insurance')

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_LifeInsurance'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlLifeInsurance_' + 
        ddlLifeInsurance))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_LifeInsuranceCompany'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlLifeInsuranceCompany_' + 
        ddlLifeInsuranceCompany))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/ddl_LifeInsuranceCapitalized'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/span_ddlLifeInsuranceCapitalized_' + 
        ddlLifeInsuranceCapitalized))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/RadioIsJoinIncomeNo'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_Calculate'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp3'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp3'), 20)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/chkAmortization'))

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/Leads Info/Lead Detail/colletaralInfoTab/Add Colletaral Detail/a_Save'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 15)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('TC.03_Leads Data Input-Leads-Personal/a_Ok'))

