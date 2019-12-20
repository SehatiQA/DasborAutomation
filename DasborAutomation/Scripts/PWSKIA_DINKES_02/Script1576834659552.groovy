import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.urllogin)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Non Admin/button_dinkes'))

WebUI.delay(2)

WebUI.setText(findTestObject('Login screen/field_email'), 'dinkesmoontilango@mailinator.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Login screen/field_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login screen/button_Masuk'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Non Admin/sidenav_pwskia'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Non Admin/PWSKIA/field_PWSKIA_pilihbulan'), 0)

WebUI.verifyElementPresent(findTestObject('Non Admin/PWSKIA/field_PWSKIA_pilihkunjungan'), 0)

WebUI.click(findTestObject('Non Admin/PWSKIA/field_PWSKIA_pilihkunjungan'))

WebUI.delay(2)

WebUI.verifyOptionPresentByValue(findTestObject('Non Admin/PWSKIA/field_PWSKIA_pilihkunjungan'), 'k1', false, 0)

WebUI.verifyOptionPresentByValue(findTestObject('Non Admin/PWSKIA/field_PWSKIA_pilihkunjungan'), 'k4', false, 0)

WebUI.verifyOptionPresentByValue(findTestObject('Non Admin/PWSKIA/field_PWSKIA_pilihkunjungan'), 'pn', false, 0)

WebUI.verifyOptionPresentByValue(findTestObject('Non Admin/PWSKIA/field_PWSKIA_pilihkunjungan'), 'kf', false, 0)

WebUI.closeBrowser()