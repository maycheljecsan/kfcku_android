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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testobject.ConditionType as ConditionType

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Login KFCKU Apps/T8375 - Login Social Media'), [:], FailureHandling.STOP_ON_FAILURE)
Mobile.waitForElementPresent(findTestObject('Order Dine In/android.widget.TextView - Beranda'), 5)

Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - Beranda'), 5)

Mobile.swipe(281, 600, 434, 90)

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

Mobile.waitForElementPresent(findTestObject('Order Type/android.widget.TextView - DRIVE-THRU'), 10)

Mobile.tap(findTestObject('Order Type/android.widget.TextView - DRIVE-THRU'), 5)

Mobile.waitForElementPresent(findTestObject('Order Dine In/android.widget.EditText - Cari Gerai KFC'), 5)

Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - Cari Gerai KFC'), 5)

Mobile.setText(findTestObject('Object Repository/Order Dine In/android.widget.EditText - Cari Gerai KFC'), 'MT Haryono', 
    5)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Object Repository/Order Dine In/android.widget.TextView - MT HARYONO JAKARTA'), 
    5)

Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - MT HARYONO JAKARTA'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Order Dine In/android.widget.FrameLayout'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Order Dine In/android.widget.Button - Add'), 5)

Mobile.tap(findTestObject('Order Dine In/android.widget.Button - Add'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Order/android.widget.Button - Lanjut'), 5)

//Mobile.scrollToText('Continue', FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Order Dine In/Order/android.widget.Button - Lanjut'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Order/android.widget.LinearLayout'), 5)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.LinearLayout'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Order/android.widget.TextView - Pilih Menu Gratis'), 5)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.TextView - Pilih Menu Gratis'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('DRT Payment/android.widget.EditText - Mohon untuk mengisi nomor'), 5)

Mobile.setText(findTestObject('DRT Payment/android.widget.EditText - Mohon untuk mengisi nomor'), 'B 1223 YTH', 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//Mobile.swipe(281, 655, 434, 161)
Mobile.waitForElementPresent(findTestObject('Order Dine In/Order/android.widget.Button - Pilih Sekarang'), 10)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.Button - Pilih Sekarang'), 10)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Order/android.widget.Button - TAMBAHKAN'), 10)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.Button - TAMBAHKAN'), 5)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.Button - Lanjutkan'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('DRT Payment/android.widget.EditText - Mohon untuk mengisi nomor'), 5)

Mobile.tap(findTestObject('DRT Payment/android.widget.EditText - Mohon untuk mengisi nomor'), 5)

Mobile.setText(findTestObject('DRT Payment/android.widget.EditText - Mohon untuk mengisi nomor'), 'B 2345 CRV', 5)

Mobile.hideKeyboard()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('TOTAL', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Order Dine In/Payment/android.widget.TextView - Lihat Semua'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//Mobile.swipe(281, 300, 400, 161)
//Mobile.tap(findTestObject('Order Dine In/Payment/imgPayment/android.widget.ImageView (1)'), 5)
TestObject testObjectOne = new TestObject()

testObjectOne.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/android.widget.ImageView[1]')

Mobile.tap(testObjectOne, 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(281, 500, 434, 161)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

TestObject testObjectTwo = new TestObject()

testObjectTwo.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[4]')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(testObjectTwo, 5)

//Mobile.scrollToText('Simpan')
Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Order Dine In/Payment/android.widget.Button - Simpan'), 5)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(281, 500, 434, 161)

Mobile.tap(findTestObject('Order Dine In/Payment/android.widget.Button - Pesan Sekarang'), 10)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Gopay/android.widget.TextView - GoPay - Web'), 10)

Mobile.tap(findTestObject('Order Dine In/Gopay/android.widget.EditText'), 10)

Mobile.setText(findTestObject('Order Dine In/Gopay/android.widget.EditText'), '654321', 5)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Order Dine In/Gopay/android.widget.Button - Submit'), 10)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Gopay/android.view.ViewGroup'), 10)

Mobile.tap(findTestObject('Order Dine In/Gopay/android.widget.TextView - OKE'), 10)

Mobile.scrollToText('TOTAL', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

