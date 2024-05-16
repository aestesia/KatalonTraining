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
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Keys as Keys

//------------------------Ambil data dari excell----------------------------
String pathData = 'Data Files/Metrodata Academy Data'

//Map<String, Object> data = new HashedMap()
String Email = findTestData(pathData).getValue('Email', 1)

String Password = findTestData(pathData).getValue('Password', 1)

//----------------------------------------------------------------------------
WebUI.openBrowser('')

WebUI.navigateToUrl('https://metrodataacademy.id/')
//WebUI.maximizeWindow()

'Berhasil Membuka Halaman Website Metrodata Academy\r\n'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/button_tiga'))

'Klik Garis Tiga Atas Kemudian Klik Button Login'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/button_sign in'))

WebUI.setText(findTestObject('Object Repository/input__email'), Email)

WebUI.setText(findTestObject('Object Repository/input__password'), Password)

'Input Email dan Password Pada Form Login, Lalu Klik Button Sign In'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/button_Masuk'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/button_mengajar'))

//if (WebUI.verifyElementVisible(findTestObject('Btn_Lihat Program'))) {
//	println('Login Berhasil - Positif')
//
//	'Login Berhasil - Positif/Normal'
//	WebUI.takeScreenshot()
//} else {
//	println('Gagal Login - Negatif')
//
//	'Login Gagal - Negatif/Abnormal'
//	WebUI.takeScreenshot()
//}
//
//WebUI.click(findTestObject('Titik tiga login'))
//
//WebUI.click(findTestObject('Profil_Anida'))
//
//'Klik Profil Setting'
//WebUI.takeScreenshot()
//
//WebUI.click(findTestObject('Profile_Setting'))
//
//'Klik Data Akun'
//WebUI.takeScreenshot()
//
//WebUI.click(findTestObject('Data_Akun'))
//
//'Lakukan Validasi Email'
//WebUI.takeScreenshot()
//
////String Validate_Email = WebUI.getText(findTestObject('Object Repository/Email'))
//// Find the element by its ID
//def element = DriverFactory.getWebDriver().findElement(By.id('email'))
//
//// Retrieve the value attribute
//String validateEmail = element.getAttribute('value')
//
//// Print the value
//println('Value of the \'value\' attribute: ' + validateEmail)
//
////println(validateEmail)
//println(Email)
//
//if (Email == validateEmail) {
//	println('Validasi Email Berhasil')
//
//	'Validasi Email Berhasil'
//	WebUI.takeScreenshot()
//} else {
//	println('Validasi Email Salah')
//
//	'Validasi Email Salah'
//	WebUI.takeScreenshot()
//}
//
//WebUI.click(findTestObject('Titik tiga logout'))
//
//WebUI.click(findTestObject('Profil_Anida'))
//
//'Klik Profil Lalu Klik Logout'
//WebUI.takeScreenshot()
//
//WebUI.click(findTestObject('Btn_Logout'))
//
//WebUI.delay(3)
//
//if (WebUI.verifyElementVisible(findTestObject('Verify_Logout'))) {
//	println('Logout Berhasil - Positif')
//
//	'Logout Berhasil - Positif/Normal'
//	WebUI.takeScreenshot()
//} else {
//	println('Gagal Logout - Negatif')
//
//	'Logout Gagal - Negatif/Abnormal'
//	WebUI.takeScreenshot()
//}
//
//'Berhasil Logout '
//WebUI.takeScreenshot()

