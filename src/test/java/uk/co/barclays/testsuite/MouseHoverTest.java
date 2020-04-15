package uk.co.barclays.testsuite;


import org.testng.annotations.Test;
import uk.co.barclays.loadproperty.Loadproperty;
import uk.co.barclays.pages.HomePage;

import uk.co.barclays.testbase.TestBase;

public class MouseHoverTest extends TestBase {
    //create object to get the property of homepage class
    HomePage homePage = new HomePage();
    // LoginPage loginPage = new LoginPage();
    Loadproperty loadproperty =new Loadproperty();

    @Test(priority = 0,groups = {"Sanity","Regression"})
    public void verifyUserShouldNotClickToBorrow() {

        homePage.mouseHoverbankDropDownLink();
        homePage.mouseHoverBorrowAndclickOnDropDownLink();
        }
}
