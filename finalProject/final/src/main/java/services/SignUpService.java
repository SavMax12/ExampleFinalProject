package services;


import enums.Email;
import enums.Password;

import pages.SignUpPage;

public class SignUpService {

    private final SuccessService successService = new SuccessService();
    private final SignUpPage signUpPage = new SignUpPage();
    public void performCheckout(
            final String firstName,
            final String lastName,
            final Email email,
            final int password,
            final Password confirmPassword,
            final boolean emailMeExclusive,
            final boolean captcha,
            final boolean exitCaptcha

    ){
        signUpPage.getFirstName().clearAndType(firstName);
        signUpPage.getLastName().clearAndType(lastName);
        signUpPage.getEmail().select(Email.YANDEXEMAIL.getEmail());
        signUpPage.getPassword().select(String.valueOf(Password.getPassword(password)));
        signUpPage.getConfirmPassword().select(String.valueOf(Password.getPassword(password)));
        if(emailMeExclusive){
            signUpPage.getEmailMeExclusive().check();
            signUpPage.getCaptcha().isDisplayed();
            signUpPage.getExitCaptcha().isDisplayed();
            signUpPage.getExitCaptcha().isDisplayed();

        }
        signUpPage.getSignUp().click();
    }
}
