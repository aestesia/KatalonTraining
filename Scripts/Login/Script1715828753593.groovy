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

//Ambil data Excel
String pathData = 'Data Files/Metrodata Academy Data'

//Map<String, Object> data = new HashedMap()
String Email = findTestData(pathData).getValue('Email', 1)
String Password = findTestData(pathData).getValue('Password', 1)

//Buka Web Metrodata
WebUI.openBrowser('')
WebUI.navigateToUrl('https://metrodataacademy.id/')
WebUI.maximizeWindow()

'Berhasil Membuka Halaman Website Metrodata Academy'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/a_Masuk'))

'Klik Button Masuk dan ke Halaman Login'
WebUI.takeFullPageScreenshot()

//Input Data Login
WebUI.setText(findTestObject('Object Repository/input_email'), Email)
WebUI.setText(findTestObject('Object Repository/input_password'), Password)

'Input Email dan Password Pada Form Login, Lalu Klik Button Sign In'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/button_Masuk'))
WebUI.delay(2)

'Halaman Awal Metrodata Academy'
WebUI.takeFullPageScreenshot()

//TC1 - Check Menu Artikel
WebUI.click(findTestObject('Object Repository/button_artikel'))
'Halaman Menu Artikel'
WebUI.takeFullPageScreenshot()

//Cek Headline
WebUI.click(findTestObject('Object Repository/klik_headline'))
'Klik Artikel Headline'
WebUI.takeFullPageScreenshot()

//Subscribe Article
String Email2 = findTestData(pathData).getValue('Email', 2)
String Nama2 = findTestData(pathData).getValue('Nama', 2)

WebUI.setText(findTestObject('Object Repository/subscribe_nama'), Nama2)
WebUI.setText(findTestObject('Object Repository/subscribe_email'), Email2)

'Isi Kolom Subscribe Artikel dan Klik Subscribe'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/button_subscribe'))

//Cek Page Article
WebUI.navigateToUrl('https://metrodataacademy.id/article')


WebUI.click(findTestObject('Object Repository/page2'))
'Check Page 2 Artikel'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/page3'))
'Check Page 3 Artikel'
WebUI.takeFullPageScreenshot()

//TC-2 Cek Menu Mengajar
WebUI.navigateToUrl('https://metrodataacademy.id/')
WebUI.click(findTestObject('Object Repository/button_mengajar'))
'Halaman Menu Mengajar'
WebUI.takeFullPageScreenshot()

//Daftar Mengajar
WebUI.click(findTestObject('Object Repository/daftar_mengajar'))
'Klik tombol Daftar untuk cek Detail'
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/klik_daftar'))
'Klik Daftar'
WebUI.takeFullPageScreenshot()

//Lihat Semua Course
WebUI.navigateToUrl('https://metrodataacademy.id/metrodata-mengajar')
WebUI.click(findTestObject('Object Repository/lihat_mengajar'))
'Check tombol Lihat Semua Course Mengajar'
WebUI.takeFullPageScreenshot()

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

