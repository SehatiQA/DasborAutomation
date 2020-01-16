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

WebUI.setText(findTestObject('Login screen/field_email'), 'dinkesadelcilangkap@mailinator.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Login screen/field_password'), '111111')

WebUI.click(findTestObject('Object Repository/Login screen/button_Masuk'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Admin/button_Saya-setuju-cookie-permit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Non Admin/sidenav_daftarIbu'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Non Admin/Daftar Ibu/tab_Ibu-Hamil'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Non Admin/Daftar Ibu/tab_Ibu-Bersalin'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Non Admin/Daftar Ibu/tab_Ibu-Nifas'), 0)

WebUI.click(findTestObject('Object Repository/Non Admin/Daftar Ibu/tab_Ibu-Bersalin'))

WebUI.click(findTestObject('Object Repository/Non Admin/Daftar Ibu/ibu_no1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Non Admin/Daftar Ibu/tab_INC'))

WebUI.scrollToElement(findTestObject('Object Repository/Non Admin/Daftar Ibu/tab_INC'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Non Admin/Daftar Ibu/INC/tab_Catatan-Ibu-Datang'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Non Admin/Daftar Ibu/INC/tab_Observasi'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Non Admin/Daftar Ibu/INC/tab_Catatan-Persalinan'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Logout_section/dropdown'))

WebUI.click(findTestObject('Object Repository/Logout_section/option_Logout'))

WebUI.delay(3)

WebUI.click(findTestObject('Non Admin/button_faskes'))

WebUI.delay(2)

WebUI.setText(findTestObject('Login screen/field_email'), 'faskes.beji@mailinator.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Login screen/field_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login screen/button_Masuk'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Non Admin/sidenav_daftarIbu'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Non Admin/Daftar Ibu/tab_Ibu-Hamil'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Non Admin/Daftar Ibu/tab_Ibu-Bersalin'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Non Admin/Daftar Ibu/tab_Ibu-Nifas'), 0)

WebUI.click(findTestObject('Object Repository/Non Admin/Daftar Ibu/tab_Ibu-Bersalin'))

WebUI.click(findTestObject('Object Repository/Non Admin/Daftar Ibu/ibu_no1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Non Admin/Daftar Ibu/tab_INC'))

WebUI.scrollToElement(findTestObject('Object Repository/Non Admin/Daftar Ibu/tab_INC'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Non Admin/Daftar Ibu/INC/tab_Catatan-Ibu-Datang'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Non Admin/Daftar Ibu/INC/tab_Observasi'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Non Admin/Daftar Ibu/INC/tab_Catatan-Persalinan'), 0)

WebUI.delay(3)

WebUI.closeBrowser()