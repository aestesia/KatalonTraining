import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory
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
 //Mendapatkan instance dari WebDriver
//def driver = DriverFactory.getWebDriver()
//
//// Mengatur skala viewport browser menggunakan JavaScript Executor
//((JavascriptExecutor)driver).executeScript("document.body.style.zoom = '80%'")
WebUI.comment('Tampilan halaman utama')
WebUI.takeScreenshot()

WebUI.delay(2)
//WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/span_Lihat Program'), 0)
'klik lihat program'

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Lihat Program'))
WebUI.delay(3)
WebUI.takeScreenshot()


//WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Metrodata Academy/text_ITCamp'), 10)
//WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/text_ITCamp'), 10)

'Lihat detail'

WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/detail_ITCamp'))
WebUI.comment('klik detail IT Camp')
WebUI.takeFullPageScreenshot()

'klik header metrodata'
WebUI.comment('klik image Metrodata pada navbar')
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/btn_metrodata'))

//'Page Metrodata IT Camp'
//WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/path'))
//WebUI.takeFullPageScreenshot()
//WebUI.comment('Metrodata IT Camp')
//WebUI.delay(4)



//WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/button_Program'))
//WebUI.takeFullPageScreenshot()

'klik lihat program'
WebUI.comment('Tampilan halaman Utama klik Lihat program')
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/span_Lihat Program'))


// Mendefinisikan nilai posisi vertikal yang diinginkan
//def desiredVerticalPosition = 300 // Misalnya, menggulir ke atas sejauh 500 piksel dari bagian atas halaman

// Menggulir halaman ke atas dengan posisi vertikal tertentu
//WebUI.scrollToPosition(0, desiredVerticalPosition)
//WebUI.scrollToElement(findTestObject('Object Repository/Page_Metrodata Academy/detail_internship'), 25)
WebUI.delay(3)
WebUI.takeScreenshot()
'Lihat detail'
WebUI.comment('klik lihat detail')
WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/detail_internship'))
WebUI.takeFullPageScreenshot()



//'Page Metrodata Internship'
//WebUI.click(findTestObject('Object Repository/Page_Metrodata Academy/a_Metrodata Internship'))
//WebUI.takeFullPageScreenshot()
//WebUI.comment('Metrodata Internship')

WebUI.delay(4)

WebUI.closeBrowser()