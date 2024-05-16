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

WebUI.openBrowser('https://metrodataacademy.id/')
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Btn_Masuk'))
'Input Email dan Password'
WebUI.takeFullPageScreenshot()
WebUI.setText(findTestObject('Object Repository/Email'), 'boyytesting123@gmail.com')
WebUI.setText(findTestObject('Object Repository/Password'), 'sihombing98')
'Berhasil input Email dan Password dan klik button Masuk'
WebUI.takeFullPageScreenshot()
WebUI.click(findTestObject('Object Repository/Sign_In'))
'Berhasil Login'
WebUI.takeScreenshot()
WebUI.delay(3)
'Klik Tentang Kami'
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/TentangKami/TentangKami'))
WebUI.verifyTextPresent('Metrodata Academy', false)
WebUI.scrollToElement(findTestObject('Object Repository/TentangKami/ScrollText'), 0)
'Klik 1999'
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/TentangKami/1999'))
WebUI.delay(2)
'Klik 2015'
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/TentangKami/2015'))
WebUI.delay(2)
'Klik 2020'
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/TentangKami/2020'))
WebUI.delay(2)
'Kembali ke Home '
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/TentangKami/HomeMetro'))
