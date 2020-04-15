package uk.co.barclays.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.barclays.basepage.BasePage;
import uk.co.barclays.browserselector.BrowserSelector;
import uk.co.barclays.loadproperty.Loadproperty;
import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    //object creation
    BrowserSelector browserSelector = new BrowserSelector();
    Loadproperty loadproperty = new Loadproperty();

    //geting "baseUrl" & "browser" value from config.pro
    String baseUrl = loadproperty.getProperty("baseUrl");
    String browser = loadproperty.getProperty("browser");

    @BeforeMethod(groups = {"Regression","Sanity"})
    public void openBrowser(){

        browserSelector.selectBrowser(browser);// browser will open from config
       driver .manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl); // get url will load baseUrl from config.properties file
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
