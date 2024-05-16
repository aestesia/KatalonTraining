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
WebUI.setText(findTestObject('Object Repository/Email'), 'boyytesting123@gmail.com')
WebUI.setText(findTestObject('Object Repository/Password'), 'sihombing98')
WebUI.click(findTestObject('Object Repository/Sign_In'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Training/Program'))
WebUI.click(findTestObject('Object Repository/Training/M_Training'))
'Pilih Training yang Sedang Berlangsung'
WebUI.verifyTextPresent('Training yang Sedang Berlangsung', false)
WebUI.click(findTestObject('Object Repository/Training/DaftarSekarang'))
