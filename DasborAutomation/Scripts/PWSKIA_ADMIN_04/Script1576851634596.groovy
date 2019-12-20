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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser(GlobalVariable.urladmin)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/button_Saya-setuju-cookie-permit'))

WebUI.setText(findTestObject('Login screen/field_email'), GlobalVariable.adminusername)

WebUI.delay(2)

WebUI.setText(findTestObject('Login screen/field_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login screen/button_Masuk'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Admin/sidenav_faskes'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/field_cari2'))

WebUI.setText(findTestObject('Admin/field_cari2'), 'automation')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/list_faskes1'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/Profile Faskes/header_profile-faskes'), 0)

WebUI.click(findTestObject('Object Repository/Admin/Profile Faskes/tab_Target-PWS'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Profile Faskes/Target PWSKIA - List/hapus_targetPWSKIA'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Profile Faskes/Target PWSKIA - List/button_Hapus_on-overlay'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Profile Faskes/Target PWSKIA - List/button_Tutup_on-overlay'))

WebUI.closeBrowser()