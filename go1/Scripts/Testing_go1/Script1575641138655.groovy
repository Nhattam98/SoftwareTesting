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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.go1.com/')

WebUI.click(findTestObject('Object Repository/Page_GO1  Thousands of online courses - one_6f35b8/span_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_GO1 Log in/input_Email_email'), 'daonhattam123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_GO1 Log in/input_Password_password'), '7Dq+kPGn2LrTm9Al8QJhdQ==')

WebUI.click(findTestObject('Object Repository/Page_GO1 Log in/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_GO1 Log in/span_SHOW'))

WebUI.click(findTestObject('Object Repository/Page_GO1 Log in/span_HIDE'))

WebUI.click(findTestObject('Object Repository/Page_GO1 Log in/span_No account Sign up'))

WebUI.setText(findTestObject('Object Repository/Page_GO1 Log in/input_Full name_first_name'), 'Dao Nhat')

WebUI.setText(findTestObject('Object Repository/Page_GO1 Log in/input_Full name_last_name'), 'Tam')

WebUI.setText(findTestObject('Object Repository/Page_GO1 Log in/input_Email_email'), 'daonhattam123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_GO1 Log in/input_Password_password'), '7Dq+kPGn2LrTm9Al8QJhdQ==')

WebUI.click(findTestObject('Object Repository/Page_GO1 Log in/span_SHOW'))

WebUI.click(findTestObject('Object Repository/Page_GO1 Log in/span_HIDE'))

WebUI.click(findTestObject('Object Repository/Page_GO1 Log in/span_Continue'))

WebUI.click(findTestObject('Object Repository/Page_GO1 Log in/span_Agree and sign up'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  GO1 Learning Marketplace/span_My learning'))

WebUI.click(findTestObject('Object Repository/Page_My Learning  GO1 Learning Marketplace/span_Assigned'))

WebUI.click(findTestObject('Object Repository/Page_Assigned  GO1 Learning Marketplace/span_Schedule'))

WebUI.click(findTestObject('Object Repository/Page_Schedule  GO1 Learning Marketplace/span_Completed'))

WebUI.click(findTestObject('Object Repository/Page_My Learning  GO1 Learning Marketplace/span_DT'))

WebUI.click(findTestObject('Object Repository/Page_My Learning  GO1 Learning Marketplace/span_My learning'))

WebUI.click(findTestObject('Object Repository/Page_My Learning  GO1 Learning Marketplace/span_Explore'))

WebUI.click(findTestObject('Object Repository/Page_Search/div_COURSE'))

WebUI.click(findTestObject('Object Repository/Page_Overview  GO1 Learning Marketplace/span_Learning'))

WebUI.click(findTestObject('Object Repository/Page_Overview  GO1 Learning Marketplace/div_Learning'))

WebUI.click(findTestObject('Object Repository/Page_Overview  GO1 Learning Marketplace/span_Groups'))

WebUI.click(findTestObject('Object Repository/Page_My groups/span_Explore'))

WebUI.setText(findTestObject('Object Repository/Page_Search/input_Groups_topSearchDesktop'), 'Lines')

WebUI.sendKeys(findTestObject('Object Repository/Page_Search/input_Groups_topSearchDesktop'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Search/svg_Any_css-sfaf4y'))

WebUI.click(findTestObject('Object Repository/Page_Search/div_Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Search/span_Any'))

WebUI.click(findTestObject('Object Repository/Page_Search/span_Email Etiquette Training Course In Australia'))

WebUI.click(findTestObject('Object Repository/Page_Search/svg_Groups_css-1dqju8p'))

WebUI.click(findTestObject('Object Repository/Page_My groups/span_Explore'))

WebUI.click(findTestObject('Object Repository/Page_Search/span_DN'))

WebUI.click(findTestObject('Object Repository/Page_Search/span_Account settings'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Account  GO1 Learning Marketplace/input_Leave blank to keep unchanged_form-co_7da1bd'), 
    '7Dq+kPGn2LrTm9Al8QJhdQ==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Account  GO1 Learning Marketplace/select_CatalDeutschEnglish (AU)English (US)_8eab8c'), 
    'string:en-uk', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Account  GO1 Learning Marketplace/select_CatalDeutschEnglish (AU)English (US)_8eab8c'), 
    'string:en-us', true)

WebUI.click(findTestObject('Object Repository/Page_Account  GO1 Learning Marketplace/span_Save changes'))

WebUI.click(findTestObject('Object Repository/Page_Account  GO1 Learning Marketplace/a_Payment details'))

WebUI.click(findTestObject('Object Repository/Page_Billing  GO1 Learning Marketplace/span_Purchases'))

WebUI.click(findTestObject('Object Repository/Page_Purchases  GO1 Learning Marketplace/span_Linked accounts'))

WebUI.click(findTestObject('Object Repository/Page_Linked accounts  GO1 Learning Marketplace/a_Linked accounts'))

WebUI.click(findTestObject('Object Repository/Page_Linked accounts  GO1 Learning Marketplace/span_Recommendations'))

WebUI.click(findTestObject('Object Repository/Page_Recommendations/span_Explore'))

WebUI.click(findTestObject('Object Repository/Page_Search/span_Video'))

WebUI.click(findTestObject('Object Repository/Page_Search/div_VIDEO'))

WebUI.click(findTestObject('Object Repository/Page_Sneak Peek 3 of My New Podcast Batch Release/path'))

WebUI.switchToWindowTitle('Sneak Peek #3 of My New Podcast: Batch Release')

WebUI.click(findTestObject('Object Repository/Page_Sneak Peek 3 of My New Podcast Batch Release/a_If the owner of this video has granted you access please sign in_ytp-small-redirect-link'))

WebUI.switchToWindowTitle('Search')

WebUI.click(findTestObject('Object Repository/Page_Search/span_SUPR Demo and Screencast  Tim Ferriss'))

WebUI.click(findTestObject('Object Repository/Page_SUPR Demo and Screencast  Tim Ferriss/svg_Not yet started_css-1ryrqub'))

WebUI.click(findTestObject('Object Repository/Page_SUPR Demo and Screencast  Tim Ferriss/div_Switch camera_ytp-progress-bar'))

WebUI.click(findTestObject('Object Repository/Page_SUPR Demo and Screencast  Tim Ferriss/div_Switch camera_ytp-progress-bar'))

WebUI.click(findTestObject('Object Repository/Page_Search/span_Courses'))

WebUI.click(findTestObject('Object Repository/Page_Search/span_Programming Languages'))

WebUI.click(findTestObject('Object Repository/Page_Overview  GO1 Learning Marketplace/span_Show more'))

WebUI.click(findTestObject('Object Repository/Page_Overview  GO1 Learning Marketplace/div_ExploreGroupsMy learningDT'))

WebUI.click(findTestObject('Object Repository/Page_Overview  GO1 Learning Marketplace/svg_My learning_css-6656x7'))

WebUI.click(findTestObject('Object Repository/Page_Notifications  GO1 Learning Marketplace/span_DT'))

WebUI.click(findTestObject('Object Repository/Page_Notifications  GO1 Learning Marketplace/span_Terms'))

WebUI.click(findTestObject('Object Repository/Page_Notifications  GO1 Learning Marketplace/span_DT'))

WebUI.click(findTestObject('Object Repository/Page_Notifications  GO1 Learning Marketplace/span_Log out'))

WebUI.setText(findTestObject('Object Repository/Page_Sign In  GO1 Learning Marketplace/input_Close_form-control ng-pristine ng-unt_557e4a'), 
    'daonhattam123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In  GO1 Learning Marketplace/input_Close_form-control ng-pristine ng-unt_89074f'), 
    '7Dq+kPGn2LrTm9Al8QJhdQ==')

WebUI.click(findTestObject('Object Repository/Page_Dashboard  GO1 Learning Marketplace/div_AUD_ap-card--cover'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  GO1 Learning Marketplace/div_DT'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  GO1 Learning Marketplace/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_Sign In  GO1 Learning Marketplace/span_English (AU)'))

WebUI.click(findTestObject('Object Repository/Page_Sign In  GO1 Learning Marketplace/span_English (US)'))

WebUI.closeBrowser()

