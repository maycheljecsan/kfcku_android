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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Staging/Login KFCKU Apps/Login Social Media'), [:], FailureHandling.STOP_ON_FAILURE)
Mobile.waitForElementPresent(findTestObject('Order Dine In/android.widget.TextView - Beranda'), 5)

Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - Beranda'), 5)

Mobile.swipe(281, 500, 434, 161)

Mobile.tap(findTestObject('Order HMD/rev-HMD/android.widget.TextView - DELIVERY'), 5)

Mobile.tap(findTestObject('Order HMD/rev-HMD/android.widget.TextView - searchadd'), 5)

Mobile.setText(findTestObject('Order HMD/rev-HMD/android.widget.EditText - Masukkan Lokasi'), 'MT Haryono', 5)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Order HMD/rev-HMD/android.widget.TextView - Jalan Letjen M.T. Haryono'), 5)

Mobile.tap(findTestObject('Order HMD/rev-HMD/android.widget.TextView - Jalan Letjen M.T. Haryono'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order HMD/rev-HMD/android.widget.TextView - MT HARYONO JAKARTA'), 5)

Mobile.tap(findTestObject('Order HMD/rev-HMD/android.widget.TextView - MT HARYONO JAKARTA'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Order HMD/rev-HMD/android.widget.Button - Tambah'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Button Lanjut Order Menu'), 5)

//Mobile.scrollToText('Continue', FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Order Dine In/Button Lanjut Order Menu'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Order/android.widget.LinearLayout'), 5)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.LinearLayout'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Order/android.widget.TextView - Pilih Menu Gratis'), 5)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.TextView - Pilih Menu Gratis'), 5)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(281, 500, 434, 161)

//Mobile.swipe(281, 655, 434, 161)
Mobile.waitForElementPresent(findTestObject('Order HMD/rev-HMD/android.widget.Button - Pilih Sekarang'), 10)

Mobile.tap(findTestObject('Order HMD/rev-HMD/android.widget.Button - Pilih Sekarang'), 10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Order/Revamp/android.widget.Button - Tambah'), 10)

Mobile.tap(findTestObject('Order Dine In/Order/Revamp/android.widget.Button - Tambah'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Order Dine In/Order/Revamp/android.widget.Button - Lanjutkan'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(281, 500, 434, 161)

Mobile.scrollToText('Metode', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order HMD/rev-HMD/android.widget.EditText - notes'), 10)

Mobile.setText(findTestObject('Order HMD/rev-HMD/android.widget.EditText - notes'), 'TestNotesDrive', 0)

Mobile.hideKeyboard()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(281, 500, 434, 161)

Mobile.waitForElementPresent(findTestObject('Order HMD/rev-HMD/android.widget.FrameLayout-delivery'), 10)

Mobile.tap(findTestObject('Order HMD/rev-HMD/android.widget.FrameLayout-delivery'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order HMD/rev-HMD/android.widget.FrameLayout-deliveryAvail'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order HMD/rev-HMD/android.widget.ImageView-grabBike'), 10)

Mobile.tap(findTestObject('Order HMD/rev-HMD/android.widget.ImageView-grabBike'), 5)

Mobile.tap(findTestObject('Order HMD/rev-HMD/android.widget.Button - Pilih'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('TOTAL', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.LinearLayout-paymethod'), 5)

//Mobile.swipe(281, 500, 434, 161)
//Mobile.tap(findTestObject('Order Dine In/Order/Revamp/android.widget.TextView - Kartu Debit'), 5)
//Mobile.tap(findTestObject('Order Dine In/Payment/imgPayment/android.widget.ImageView (1)'), 5)
//TestObject testObjectOne = new TestObject()
//
//testObjectOne.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[4]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]')
//
//Mobile.tap(testObjectOne, 5)
//
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.swipe(281, 500, 434, 161)
//
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//
//TestObject testObjectTwo = new TestObject()
//
//testObjectTwo.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[7]/android.view.ViewGroup[1]/android.widget.ImageView[1]')
//
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(testObjectTwo, 5)
//Mobile.scrollToText('Simpan')
Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

//Mobile.swipe(281, 500, 434, 161)
Mobile.tap(findTestObject('Order Dine In/Order/Revamp/android.view.ViewGroup - gopay'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Order Dine In/Order/Revamp/android.widget.Button - Simpan'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(281, 500, 434, 161)

//Mobile.swipe(281, 500, 434, 161)
Mobile.tap(findTestObject('Order Dine In/Order/Revamp/android.widget.Button - Pesan Sekarang'), 5)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

//WebUI.waitForElementPresent(findTestObject('Gopay Page/GoPay - Web'), 5)
//
//Mobile.setText(findTestObject('Gopay Page/Input PIN'), '654321', 0)
//
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('Gopay Page/Button Submit'), 5)
//
//Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.verifyTextPresent('ANDA TELAH BERHASIL MELAKUKAN PEMESANAN', false)
Mobile.closeApplication()

