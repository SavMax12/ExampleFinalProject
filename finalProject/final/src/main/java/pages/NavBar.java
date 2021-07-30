package pages;

import com.codeborne.selenide.SelenideElement;
import elements.Button;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavBar {



    private final Button createAccount = new Button(By.id("sign-up-btn"));
    //..

    public void createAccount(){
        createAccount.click();
    }
}
