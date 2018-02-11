import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.motoscout24.ch/de')

WebUI.switchToWindowTitle('MotoScout24: Motorräder in der Schweiz kaufen & verkaufen')

WebUI.rightClick(findTestObject('Page_MotoScout24 Motorrder in der S/li_YAMAHA'))

WebUI.click(findTestObject('Page_MotoScout24 Motorrder in der S/li_YAMAHA'))

not_run: WebUI.selectOptionByValue(findTestObject('Page_MotoScout24 Motorrder in der S/li_500 ccm'), '500 cm', false)

not_run: WebUI.selectOptionByValue(findTestObject('Page_MotoScout24 Motorrder in der S/li_TMax XP'), 'TMax XP', false)

not_run: WebUI.selectOptionByValue(findTestObject('Page_MotoScout24 Motorrder in der S/li_2010'), '2010', false)

not_run: WebUI.selectOptionByValue(findTestObject('Page_MotoScout24 Motorrder in der S/li_Roller'), 'Roller', false)

WebUiBuiltInKeywords.click(findTestObject('Page_MotoScout24 Motorrder in der S/showResult'))

WebUI.closeBrowser()

