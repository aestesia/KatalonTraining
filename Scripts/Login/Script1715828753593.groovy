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

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Login/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Metrodata Academy/Login/input__email'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Metrodata Academy/Login/input__password'), password)

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Login/input__remember-me'))

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Login/button_Masuk'))

boolean isVisibleSpanUser 		= WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Metrodata Academy/Login/span_Email wajib diisi'),2, FailureHandling.OPTIONAL)
boolean isVisibleSpanPassword	= WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Metrodata Academy/Login/span_Password wajib diisi'),2, FailureHandling.OPTIONAL)

if(isVisibleSpanUser == true) {
	println('Login Gagal - Email Kosong')
	
	'Login Gagal - Email Kosong'
	WebUI.takeScreenshot()
	WebUI.closeBrowser()
	
}else if(isVisibleSpanPassword == true) {
	println('Login Gagal - Password Kosong')
	
	'Login Gagal - Password Kosong'
	WebUI.takeScreenshot()	
	WebUI.closeBrowser()
	
}
else{
	println('Login Berhasil')

	'Login Berhasil'
	WebUI.takeScreenshot()
	
	WebUI.delay(2)
	
	WebUI.takeScreenshot()
	
	WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Login/svg_Timothy Hutson_w-5 h-5 ml-1'))
	
	WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/Login/button_Keluar'))
	
	println('Logout Berhasil')
	'Logout Berhasil'
	WebUI.takeScreenshot()
	WebUI.closeBrowser()
}

