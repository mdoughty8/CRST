import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.Verify;
import org.junit.*;
import unittesting.UnitTestClassBase;


public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void verify_linkNavigatesToAboutTravelSite() throws Exception {
        //Launch the IE browser.
        Browser browser = BrowserFactory.launch(BrowserType.INTERNET_EXPLORER);

        try{
            //Navigate to the McLeod PROD.
            browser.navigate("https://cr1-mcld-ts1.crst.com");

            //Wait for the browser to complete the navigation.
            browser.sync();

            //Login
            //Enter User Name
            EditField domainUserNameEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
                    .name("DomainUserName")
                    .tagName("INPUT")
                    .type("text").build());
            com.hp.lft.report.Reporter.startReportingContext("Validate the properties of DomainUserName", com.hp.lft.report.ReportContextInfo.verificationMode());
            Verify.areEqual("DomainUserName", domainUserNameEditField.getId(), "Verification", "Verify property: id");
            Verify.areEqual("DomainUserName", domainUserNameEditField.getName(), "Verification", "Verify property: name");
            com.hp.lft.report.Reporter.endReportingContext();
            domainUserNameEditField.click();
            domainUserNameEditField.setValue("crst\\jjuehring");
            //Enter Password
            EditField userPassEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
                    .name("UserPass")
                    .tagName("INPUT")
                    .type("password").build());
            com.hp.lft.report.Reporter.startReportingContext("Validate the properties of UserPass", com.hp.lft.report.ReportContextInfo.verificationMode());
            Verify.areEqual("UserPass", userPassEditField.getId(), "Verification", "Verify property: id");
            Verify.areEqual("UserPass", userPassEditField.getName(), "Verification", "Verify property: name");
            com.hp.lft.report.Reporter.endReportingContext();
            userPassEditField.click();
            userPassEditField.setValue("jos258jue");
            //Click Radio Button
            RadioGroup machineTypeRadioGroup = browser.describe(RadioGroup.class, new RadioGroupDescription.Builder()
                    .name("MachineType")
                    .tagName("INPUT").build());
            com.hp.lft.report.Reporter.startReportingContext("Validate the properties of MachineType", com.hp.lft.report.ReportContextInfo.verificationMode());
            Verify.areEqual("rdoPblc", machineTypeRadioGroup.getId(), "Verification", "Verify property: id");
            Verify.areEqual("MachineType", machineTypeRadioGroup.getName(), "Verification", "Verify property: name");
            Verify.areEqual("public", machineTypeRadioGroup.getSelectedItem(), "Verification", "Verify property: selectedItem");
            com.hp.lft.report.Reporter.endReportingContext();
            machineTypeRadioGroup.click();
            //Click Sign In Button
            Button signInButton = browser.describe(Button.class, new ButtonDescription.Builder()
                    .buttonType("submit")
                    .name("Sign in")
                    .tagName("INPUT").build());
            com.hp.lft.report.Reporter.startReportingContext("Validate the properties of Sign in", com.hp.lft.report.ReportContextInfo.verificationMode());
            Verify.areEqual("btnSignIn", signInButton.getId(), "Verification", "Verify property: id");
            Verify.areEqual("Sign in", signInButton.getName(), "Verification", "Verify property: name");
            com.hp.lft.report.Reporter.endReportingContext();
            signInButton.click();

            //Click the "CRST Expedited" link.
            WebElement cRSTExpeditedWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                    .className("tswa_ttext")
                    .innerText("CRST Expedited")
                    .tagName("DIV").build());
            cRSTExpeditedWebElement.click();

            WebElement expeditedTMSWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                    .className("tswa_ttext")
                    .innerText("Expedited - TMS")
                    .tagName("DIV").build());
            expeditedTMSWebElement.click();


            Window connectingToCR1MCLDTS1CRSTCOMWindow = Desktop.describe(Window.class, new WindowDescription.Builder()
                    .childWindow(false)
                    .ownedWindow(false)
                    .windowClassRegExp("TscShellContainerClass")
                    .windowTitleRegExp("Connecting to CR1-MCLD-TS1.CRST.COM...").build());
            Dialog remoteAppDialog = connectingToCR1MCLDTS1CRSTCOMWindow.describe(Dialog.class, new DialogDescription.Builder()
                    .childWindow(false)
                    .ownedWindow(true)
                    .nativeClass("#32770")
                    .text("RemoteApp").build());
            remoteAppDialog.activate();

            remoteAppDialog.click();

            Button connectButton = remoteAppDialog.describe(Button.class, new ButtonDescription.Builder()
                    .nativeClass("Button")
                    .text("Co&nnect").build());
            connectButton.click();

            Window mcLeodDeploymentCR1MCLDTS1CRSTComWindow = Desktop.describe(Window.class, new WindowDescription.Builder()
                    .childWindow(false)
                    .ownedWindow(false)
                    .windowClassRegExp("RAIL_WINDOW")
                    .windowTitleRegExp("McLeod Deployment (CR1-MCLD-TS1.CRST.com)").build());
            com.hp.lft.report.Reporter.startReportingContext("Validate the properties of McLeod Deployment (CR1-MCLD-TS1.CRST.com)", com.hp.lft.report.ReportContextInfo.verificationMode());
            Verify.areEqual("McLeod Deployment (CR1-MCLD-TS1.CRST.com)", mcLeodDeploymentCR1MCLDTS1CRSTComWindow.getText(), "Verification", "Verify property: text");
            Verify.areEqual("McLeod Deployment (CR1-MCLD-TS1.CRST.com)", mcLeodDeploymentCR1MCLDTS1CRSTComWindow.getWindowTitleRegExp(), "Verification", "Verify property: windowTitleRegExp");
            com.hp.lft.report.Reporter.endReportingContext();

            com.hp.lft.report.Reporter.startReportingContext("Validate the properties of McLeod Deployment (CR1-MCLD-TS1.CRST.com)", com.hp.lft.report.ReportContextInfo.verificationMode());
            Verify.areEqual("McLeod Deployment (CR1-MCLD-TS1.CRST.com)", mcLeodDeploymentCR1MCLDTS1CRSTComWindow.getText(), "Verification", "Verify property: text");
            Verify.areEqual("McLeod Deployment (CR1-MCLD-TS1.CRST.com)", mcLeodDeploymentCR1MCLDTS1CRSTComWindow.getWindowTitleRegExp(), "Verification", "Verify property: windowTitleRegExp");
            com.hp.lft.report.Reporter.endReportingContext();

            Window loadMasterLoginLmeCR1MCLDTS1CRSTComWindow = Desktop.describe(Window.class, new WindowDescription.Builder()
                    .childWindow(false)
                    .ownedWindow(false)
                    .windowClassRegExp("RAIL_WINDOW")
                    .windowTitleRegExp("LoadMaster Login: lme (CR1-MCLD-TS1.CRST.com)").build());
            com.hp.lft.report.Reporter.startReportingContext("Validate the properties of LoadMaster Login: lme (CR1-MCLD-TS1.CRST.com)", com.hp.lft.report.ReportContextInfo.verificationMode());
            Verify.areEqual("LoadMaster Login: lme (CR1-MCLD-TS1.CRST.com)", loadMasterLoginLmeCR1MCLDTS1CRSTComWindow.getText(), "Verification", "Verify property: text");
            Verify.areEqual("LoadMaster Login: lme (CR1-MCLD-TS1.CRST.com)", loadMasterLoginLmeCR1MCLDTS1CRSTComWindow.getWindowTitleRegExp(), "Verification", "Verify property: windowTitleRegExp");
            com.hp.lft.report.Reporter.endReportingContext();

            com.hp.lft.report.Reporter.startReportingContext("Validate the properties of LoadMaster Login: lme (CR1-MCLD-TS1.CRST.com)", com.hp.lft.report.ReportContextInfo.verificationMode());
            Verify.areEqual("LoadMaster Login: lme (CR1-MCLD-TS1.CRST.com)", loadMasterLoginLmeCR1MCLDTS1CRSTComWindow.getText(), "Verification", "Verify property: text");
            Verify.areEqual("LoadMaster Login: lme (CR1-MCLD-TS1.CRST.com)", loadMasterLoginLmeCR1MCLDTS1CRSTComWindow.getWindowTitleRegExp(), "Verification", "Verify property: windowTitleRegExp");
            com.hp.lft.report.Reporter.endReportingContext();

            loadMasterLoginLmeCR1MCLDTS1CRSTComWindow.sendKeys("jjuehring");

            loadMasterLoginLmeCR1MCLDTS1CRSTComWindow.sendKeys("jos258jue");





















//            browser.describe(Link.class, new LinkDescription.Builder()
//                    .tagName("A").innerText("Business Travel @ About.com").build()).click();
//
//            //Wait for the browser to complete the navigation.
//            browser.sync();
//
//            //Verify that the correct Web page opens.
//           Verify.areEqual("http://businesstravel.about.com/?PM=78_101_T&cob=home", browser.getURL(), "Verify_linkNavigatesToAboutTravelSite", "Verify that the browser's URL is as expected.");
        }
//        catch(Error e){
//            Reporter.reportEvent("Verify_AboutOpensCorrectly","Failed during test",Status.Failed, e);
//            throw e;
//        }
        finally{
            browser.close();
        }
    }
}