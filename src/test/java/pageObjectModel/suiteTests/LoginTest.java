package pageObjectModel.suiteTests;

import org.testng.annotations.Test;
import pageObjectModel.data.LoginTestData;
import pageObjectModel.pages.LoginPage;
import pageObjectModel.pages.helpers.HelperBase;
import pageObjectModel.weaver.WeaverBase;

public class LoginTest extends WeaverBase {

    @Test(groups = {"Regression"}, dataProvider = "data-emails-login-regression", dataProviderClass= LoginTestData.class, priority = 1)
    public void validateLoginRegression(String userEmail, String password){
        //Enter code to call the page object methods and complete the test
    }


}
