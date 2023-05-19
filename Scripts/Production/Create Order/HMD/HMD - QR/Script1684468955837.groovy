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

//WebUI.callTestCase(findTestCase('Staging/Login KFCKU Apps/Login Social Media'), [:], FailureHandling.STOP_ON_FAILURE)
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(281, 500, 434, 170)

Mobile.tap(findTestObject('Productions/Create Order/HMD/Menu - DELIVERY'), 5)

Mobile.verifyElementVisible(findTestObject('Productions/Create Order/HMD/Search Location - Search Bar'), 5)

Mobile.tap(findTestObject('Productions/Create Order/HMD/Search Location - Search Bar'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Productions/Create Order/HMD/Input Location - Search Bar'), 'Kemang', 5)

Mobile.hideKeyboard()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Productions/Create Order/HMD/Outlet - Kemang Village'), 5)

Mobile.tap(findTestObject('Productions/Create Order/HMD/Outlet - Kemang Village'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Productions/Create Order/HMD/KEMANG'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Productions/Create Order/PNP/Dine In/List Menu Group'), 5)

Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/List Menu Group'), 5)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/Breakfast'), 3)

Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/List Menu Group'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/Spesial'), 3)

Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/Button - Add'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Productions/Create Order/PNP/Dine In/List Item Costum'), 5)

Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/Button - Continue Custom'), 5)

Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/Next Button Order'), 5)

Mobile.verifyElementVisible(findTestObject('Productions/Create Order/PNP/Dine In/You Got Free GOCENG'), 5)

Mobile.verifyElementVisible(findTestObject('Productions/Create Order/PNP/Dine In/Continue Choose Reward'), 5)

Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/Continue Choose Reward'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/Button - Choose Now Reward'), 5)

Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/Button - Add Reward'), 5)

Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/Button - Confirm Reward'), 5)

Mobile.swipe(281, 500, 434, 161)

Mobile.scrollToText('TOTAL', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Productions/Create Order/HMD/Add notes for your driver'), 'Rumah depan POS satpam', 0)

Mobile.tap(findTestObject('Productions/Create Order/HMD/Select Delivery Method'), 5)

Mobile.tap(findTestObject('Productions/Create Order/HMD/GrabExpress'), 5)

Mobile.tap(findTestObject('Productions/Create Order/HMD/Button - Select'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/Select Payment Method'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Productions/Create Order/PNP/Dine In/Group Payment Method'), 5)

Mobile.tap(findTestObject('Productions/Create Order/Payment Method/QRIS'), 5)

Mobile.tap(findTestObject('Productions/Create Order/Payment Method/Button - Save Payment'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(281, 500, 434, 161)

//Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/Button - Order Now'), 5)
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Productions/Create Order/PNP/Dine In/Button - Order Now'), 5)
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

