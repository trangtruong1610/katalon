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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://release.gigacover.com/')

WebUI.click(findTestObject('Object Repository/Page_Flexible Group Benefits/a_Income Protection'))

WebUI.click(findTestObject('Page_Flexible Group Benefits/span_Get Quote Now'))

WebUI.click(findTestObject('Object Repository/Page_Flexible Group Benefits/span_Delivery (by motorbike)'))

WebUI.click(findTestObject('Object Repository/Page_Flexible Group Benefits/span_Show me my quote'))

WebUI.click(findTestObject('Object Repository/Page_Flexible Group Benefits/button_Select'))

WebUI.click(findTestObject('Object Repository/Page_Flexible Group Benefits/input_Cancel with one month notice fees app_b8ddba'))

WebUI.scrollToPosition(0, 1000)

WebUI.click(findTestObject('Object Repository/Page_Flexible Group Benefits/span_Proceed'))

WebUI.setText(findTestObject('Object Repository/Page_Flexible Group Benefits/input_First Name_first_name'), 'trang')

WebUI.setText(findTestObject('Object Repository/Page_Flexible Group Benefits/input_Last Name_last_name'), 'truong')

WebUI.setText(findTestObject('Object Repository/Page_Flexible Group Benefits/input_NRICFIN_nricfin'), 'S3309385C')

WebUI.setText(findTestObject('Object Repository/Page_Flexible Group Benefits/input_Postal Code_postalcode'), '123456')

WebUI.click(findTestObject('Object Repository/Page_Flexible Group Benefits/div_Email Address_MuiInputBase-root-370 Mui_7d72d3'))

WebUI.setText(findTestObject('Object Repository/Page_Flexible Group Benefits/input_Email Address_email'), 'S3309385C@gigacover.com')

WebUI.setText(findTestObject('Object Repository/Page_Flexible Group Benefits/input_Mobile_mobile'), '84123456')

WebUI.click(findTestObject('Object Repository/Page_Flexible Group Benefits/input_Understand my data may also be used f_ef888b'))

WebUI.click(findTestObject('Object Repository/Page_Flexible Group Benefits/input_Understand my data may also be used f_c24554'))

WebUI.click(findTestObject('Page_Flexible Group Benefits/span_Checkout now'))

WebUI.click(findTestObject('Object Repository/Page_Flexible Group Benefits/span_Proceed to Pay by card'))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Page_Flexible Group Benefits/iframe_Close_stripe_checkout_app'), 5)

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Object Repository/Page_Flexible Group Benefits/input_Card number_700211e0-89f8-11ea-be33-5_7fe1fa'), 
    '4242 4242 4242 4242')

WebUI.setText(findTestObject('Object Repository/Page_Flexible Group Benefits/input_Expiry_70028710-89f8-11ea-be33-5134e7702ad1'), 
    '02 / 23')

WebUI.setText(findTestObject('Object Repository/Page_Flexible Group Benefits/input_CVC_7002ae20-89f8-11ea-be33-5134e7702ad1'), 
    '122')

WebUI.setText(findTestObject('Object Repository/Page_Flexible Group Benefits/input_ZIP Code_8e38e710-89f8-11ea-be33-5134_a35e05'), 
    '123456')

WebUI.click(findTestObject('Object Repository/Page_Flexible Group Benefits/button_Pay SGD1260'))

WebUI.verifyElementPresent(findTestObject('Page_Flexible Group Benefits/h2_Thank you for purchasing Freelancer Inco_176a8f'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Flexible Group Benefits/button_OK'))

WebUI.closeBrowser()

