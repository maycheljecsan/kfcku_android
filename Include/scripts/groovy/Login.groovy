import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open com.kfc.mobile.hkStaging")
	def openApps() {
		Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)
	}
	
//	@When("I tap menu profile")
//	def tapProfile() {
//		Mobile.tap(findTestObject('Profile/android.widget.TextView - Profil'), 10)
//	}

	@When("I fill in empty (.*) and empty (.*)")
	def enterEmptyUser(String phone, String password) {
		Mobile.setText(findTestObject('Login/android.widget.EditText - Masukkan nomor handphone Anda'), '', phone)
		Mobile.setText(findTestObject('Login/android.widget.EditText - Ketik kata sandi Anda'), '', password)
	}
	
	@When("I click Log In")
	def clicklogin() {
		Mobile.tap(findTestObject('Login/android.widget.Button - Masuk'), 0)
	}

	@Then("I see an error message 'Mohon masukkan nomor handphone Anda'")
	def messageError () {
		Mobile.verifyElementText(findTestObject('Login/Login Failed/android.widget.TextView - nullPhone'), 'Mohon masukkan nomor handphone Anda')
		Mobile.verifyElementText(findTestObject('Login/Login Failed/android.widget.TextView - nullPass'), 'Masukkan kata sandi Anda yang benar')
	}
}