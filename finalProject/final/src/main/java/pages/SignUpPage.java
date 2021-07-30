package pages;

import elements.*;
import org.openqa.selenium.By;

public class SignUpPage {

    private final Input firstName = new Input(By.id("firstName"));
    private final Input lastName = new Input(By.id("lastName"));
    private final Selector email = new Selector(By.id("email"));
    private final Selector password = new Selector(By.id("password"));
    private final Selector ConfirmPassword = new Selector(By.id("confirmPassword"));
    private final Checkbox emailMeExclusive = new Checkbox(By.xpath("//span[@class=\"sc-fznZeY dzZFTs sc-fzoxKX dveGrF]"));
    private final Label captcha = new Label(By.xpath("//div[@class=\"recaptcha-checkbox-border]"));
    private final Label exitCaptcha = new Label(By.xpath("//div[@style=\"width: 100%; height: 100%; position: fixed; top: 0px; left: 0px; z-index: 2000000000; background-color: rgb(255, 255, 255); opacity: 0.05;"));
    private final Button signUp = new Button (By.xpath("//button[@data-cy=\"signup-button]"));


    public Input getFirstName() {
        return firstName;
    }

    public Input getLastName() {
        return lastName;
    }

    public Selector getEmail() {
        return email;
    }

    public Selector getPassword() {
        return password;
    }

    public Checkbox getEmailMeExclusive() {
        return emailMeExclusive;
    }

    public Label getCaptcha() {
        return captcha;
    }

    public Label getExitCaptcha() {
        return exitCaptcha;
    }

    public Button getSignUp() {
        return signUp;
    }

    public Selector getConfirmPassword() {
        return ConfirmPassword;
    }
}
