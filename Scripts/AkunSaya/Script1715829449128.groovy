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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://metrodataacademy.id/')

WebUI.maximizeWindow()

'Buka webpage'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Login/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/Login/input__email'), 'timothyhudson23@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Metrodata Academy/Login/input__password'), 'IGHOxYmcYdeXBupIKMuP1g==')

'Isi Username & Password'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Login/input__remember-me'))

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Login/button_Masuk'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Login/svg_Timothy Hutson_w-5 h-5 ml-1'))

'Click Akun Saya'
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/AkunSaya/DataAkun/AkunSaya/a_Akun Saya'))

"Isi Data Profil"
//WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/AkunSaya/DataAkun/Page_Metrodata Academy/input__firstName'), 
//    'Timothy')

//WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/AkunSaya/DataAkun/Page_Metrodata Academy/input__lastName'), 
//    'Hutson')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Metrodata Academy/AkunSaya/Profil/select_Pilih Jenis Kelamin'), 
    'L', true)

WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/AkunSaya/Profil/input__phoneNumber'), 
    '812345678990')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Metrodata Academy/AkunSaya/Profil/select_Pilih Provinsi'), 
    '32', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Metrodata Academy/AkunSaya/Profil/select_Pilih Kota'), 
    '3275', true)

WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/AkunSaya/Profil/textarea_Alamat_address'), 
    'tes123456788')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Metrodata Academy/AkunSaya/Profil/select_Pilih Kategori'), 
    'PROFESSIONAL', true)

WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/AkunSaya/Profil/input__company'), 
    'Metrodata')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Metrodata Academy/AkunSaya/Profil/select_Pilih Posisi'), 
    '4b486aff-252d-4056-80b4-6e663378b0ce', true)

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/AkunSaya/Profil/button_Simpan'))

