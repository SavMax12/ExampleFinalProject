package selenide;

import base.BaseTest;
import enums.Email;
import enums.Password;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.AgodaService;
import services.SignUpService;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.AssertJUnit.assertTrue;

public class CheckoutTest {

    private final String BASE_URL = "https://www.agoda.com/";

    private final AgodaService agodaService = new AgodaService();
    private final SignUpService signUpService = new SignUpService();


    @BeforeMethod
    public void openSite(){
        open(BASE_URL);
    }

    @Test
    public void test() throws InterruptedException {

        agodaService.createAccount();

        signUpService.performCheckout(
                "Maxim",
                "Savchenko",
                Email.YANDEXEMAIL,
                423423423,
                Password.PASSWORD,
                false,
                true,
                true

        );
    }
}
