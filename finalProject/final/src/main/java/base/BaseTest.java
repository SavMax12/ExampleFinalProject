package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {


    protected static final String BASE_URL = "https://www.agoda.com/account/signin.html?option=signup&ottoken=eyJhbGciOiJBMjU2S1ciLCJlbmMiOiJBMjU2Q0JDLUhTNTEyIn0.j47XHNEIFiYBwkrn6Iw_2-saJZnbroppJ0A69KJpDYY0hN7eJHR1auBOXNaRL1Lv2QsTQiPviHJc74hD-ljAKJXg93nLTBQ3.5ZyQcUjTdpJv59aMKz-LtQ.q4oz_7AkKVpW8jm9fj1-pi8LtrYhM9VHvVs0D1hrApBVwsP6J6aEHKfisOeKSerr.qErQ_vMJfSBpRv_4QF-Fq0qRdKv7-B6InWVgn6ugtE0&returnurl=%2F";

    protected WebDriver driver;

    @BeforeSuite
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");

        this.driver = new ChromeDriver();
    }

    @BeforeClass
    public void startDriver() throws InterruptedException {
        this.driver.get(BASE_URL);
        Thread.sleep(1000);
    }

    @AfterClass
    public void closeDriver() throws InterruptedException {
        Thread.sleep(1000);
        this.driver.quit();
    }

}
