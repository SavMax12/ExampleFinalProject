package selenide;

import base.BaseTest;
import com.codeborne.selenide.*;
import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.SignUpPage;

import javax.xml.xpath.XPath;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class FeaturesTest{

    private final String BASE_URL = "https://www.agoda.com";
    private final String CREATE_ACCOUNT = "https://www.agoda.com/account/signin.html?option=signup&ottoken=eyJhbGciOiJBMjU2S1ciLCJlbmMiOiJBMjU2Q0JDLUhTNTEyIn0.cicfnJvJqFJZjLW0BEr0m3cUDXcpwdSrO8v1peR4mgCpV6KVZWr41QVR_zjzeUMPRPz5bASMkhmSOW_vwPRbSPpXo5g_vBYH.NWOr9laC3UKHjM9J5eqbtQ.H8OWWcikEpBRP1Tpy6OWVloxkvieJSEnbaZuP3V_gzO4LYT31S6Ghe8mjjIeNjEW.EmxUronTKTmSRSMAe2bjzuqX1VHw3bRghpCn9eYrBFM&returnurl=%2F";

    @AfterMethod
    public void sleep() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Test
    public void findElements() {
        open(BASE_URL);


//        $(By.xpath("//div[@class=\"SearchBoxTextDescription__title\"]")).click();
//        $(By.xpath("//span[@class=\"DayPicker-Day__label\"]")).click();
        $(By.xpath("//div[@class=\"IconBox IconBox--occupancy\"")).click();
        $(By.xpath("//div[@class=\"TravellerSegment__row TravellerSegment__title\"")).click();
        $(By.xpath("//div[@class=\"sc-bqyKva eXsHTF\"")).click();



    }

    @Test
    public void searchInnerElements() {
        open(BASE_URL);

        $$(By.className("card-box")).get(3).$(By.id("buy-btn")).click();
    }

    @Test
    public void assertions() {
        open(BASE_URL);

//        $(byId("success-title")).should(Condition.exist);
//        $(byId("success-title")).shouldBe(Condition.visible);
//        $(byId("success-title")).shouldHave(Condition.exactText("text"));

        $(byId("success-title"))
                .waitUntil(Condition.exist, 20000)
                .shouldHave(Condition.exactText("Thank You!"));
    }
    @Test
    public void assertions2(){
        open(BASE_URL);

        $$(byId("buy-btn")).shouldBe(CollectionCondition.sizeGreaterThan(5)).get(3).click();

    }
    @Test
    public void configuration(){
        Configuration.timeout = 20000;
        Configuration.remote = "grid url";
    }
}

