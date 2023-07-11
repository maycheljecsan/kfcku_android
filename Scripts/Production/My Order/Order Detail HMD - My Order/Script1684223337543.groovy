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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Productions/Menu/My Order'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Productions/My Order/Title - MY ORDER'), 0)

Mobile.tap(findTestObject('Productions/My Order/Order Detail - HMD/HMD - Kombo Crispy Burger'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Productions/My Order/Order Detail - HMD/Title - ORDER DETAIL'), 0)

Mobile.verifyElementVisible(findTestObject('Productions/My Order/Order Detail - HMD/Delivery Number'), 0)

Mobile.verifyElementVisible(findTestObject('Productions/My Order/Order Detail - HMD/Order Type'), 0)

Mobile.verifyElementVisible(findTestObject('Productions/My Order/Order Detail - HMD/Delivery Detail'), 0)

Mobile.scrollToText('Tax', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Productions/My Order/Order Detail - HMD/Order Items'), 0)

Mobile.verifyElementVisible(findTestObject('Productions/My Order/Order Detail - HMD/Order Summary'), 0)

Mobile.closeApplication()

