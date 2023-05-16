package tests;

import org.testng.annotations.Test;

public class SignUpPageTest
{
    @Test(dataProvider = "SignUpPageDataProvider",dataProviderClass=
            SignUpPageDataProvider.class)
    public void testIfSignUpPageIsAvalaible
            (String browserType, boolean expectedPageAvalaibility)
    {
        driver=SeleniumUtils.getDriver(browserType);

        SignUpPage signUpPage= new SignUpPage;
        boolean isPageAvalaible = signUpPage.open(signUpPageUrl);

        Assert.assertEquals(isPageAvalaible,expectedPageAvalaibility);
    }
}