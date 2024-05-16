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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://metrodataacademy.id/')

'klik lihat program'
WebUI.takeFullPageScreenshot()
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/span_Lihat Program'))
WebUI.comment('Tampilan menu program')


'Lihat detail'
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/detail_ITCamp'))
WebUI.takeFullPageScreenshot()

'klik header metrodata'
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/btn_metrodata'))

//'Page Metrodata IT Camp'
//WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/path'))
//WebUI.takeFullPageScreenshot()
//WebUI.comment('Metrodata IT Camp')
//WebUI.delay(4)



//WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Program'))
//WebUI.takeFullPageScreenshot()

'klik lihat program'
WebUI.takeFullPageScreenshot()
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/span_Lihat Program'))
WebUI.comment('Tampilan menu program')


'Lihat detail'
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/detail_internship'))
WebUI.takeFullPageScreenshot()



//'Page Metrodata Internship'
//WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/a_Metrodata Internship'))
//WebUI.takeFullPageScreenshot()
//WebUI.comment('Metrodata Internship')

WebUI.delay(4)

WebUI.closeBrowser()