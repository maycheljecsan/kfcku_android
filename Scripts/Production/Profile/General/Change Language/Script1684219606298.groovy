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

Mobile.startExistingApplication('com.kfc.mobile', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Productions/Menu/Profile'), 0)

Mobile.tap(findTestObject('Productions/General/Change Language/Menu - Language'), 3)

Mobile.verifyElementVisible(findTestObject('Productions/General/Change Language/SELECT LANGUAGE'), 3)

Mobile.verifyElementVisible(findTestObject('Productions/General/Change Language/Bahasa Indonesia'), 3)

Mobile.verifyElementVisible(findTestObject('Productions/General/Change Language/English (United States)'), 3)

Mobile.tap(findTestObject('Productions/General/Change Language/Bahasa Indonesia'), 3)

Mobile.tap(findTestObject('Productions/General/Change Language/Save'), 3)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Productions/General/Change Language/Manu - Bahasa'), 'Bahasa')

Mobile.tap(findTestObject('Productions/General/Change Language/Manu - Bahasa'), 3)

Mobile.verifyElementVisible(findTestObject('Productions/General/Change Language/PILIH BAHASA'), 3)

Mobile.verifyElementVisible(findTestObject('Productions/General/Change Language/Bahasa Indonesia'), 3)

Mobile.verifyElementVisible(findTestObject('Productions/General/Change Language/English (United States)'), 3)

Mobile.tap(findTestObject('Productions/General/Change Language/English (United States)'), 3)

Mobile.tap(findTestObject('Productions/General/Change Language/Simpan'), 3)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Productions/General/Change Language/Menu - Language'), 'Language')

Mobile.closeApplication()

