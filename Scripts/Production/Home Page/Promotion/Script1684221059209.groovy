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

Mobile.verifyElementVisible(findTestObject('Productions/Home Page/Promotion/Banner'), 0)

Mobile.swipe(281, 800, 434, 61)

Mobile.verifyElementVisible(findTestObject('Productions/Home Page/Promotion/Title - PROMOS AND REWARDS'), 0)

'Get Device Height and Store in to device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in to device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the value in startY variable by dividing device height by 2 Because Y coordinates are constant'
int startY = device_Height / 2

'Here startY and endY values are equal for Horizontal Swiping for that assigning startX value to endX'
int endY = startY

'Storing the value in startX variable'
int startX = device_Width * 0.30

'Storing the value in endX variable'
int endX = device_Width * 0.70

'Here Y constant for Swipe Horizontal Right to Left'
Mobile.swipe(endX, startY, startX, endY)

Mobile.tap(findTestObject('Productions/Home Page/Promotion/View All'), 3)

Mobile.verifyElementVisible(findTestObject('Productions/Home Page/Promotion/Title - ONGOING PROMO'), 0)

Mobile.verifyElementVisible(findTestObject('Productions/Home Page/Promotion/Promo List 1'), 0)

Mobile.verifyElementVisible(findTestObject('Productions/Home Page/Promotion/Promo List 2'), 0)

Mobile.verifyElementVisible(findTestObject('Productions/Home Page/Promotion/Promo List 3'), 0)

Mobile.tap(findTestObject('Productions/Home Page/Promotion/Promo List 1'), 3)

Mobile.tap(findTestObject('Productions/Home Page/Promotion/Button Back Promo Detail'), 3)

Mobile.tap(findTestObject('Productions/Home Page/Promotion/Button Back'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

