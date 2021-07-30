package service;

import enums.City;
import enums.Country;
import enums.PaymentType;
import org.assertj.core.api.SoftAssertions;
import pages.CheckoutPage;
import utils.Logger;

import static utils.Assertions.isVisible;

public class CheckoutService {

    private final CheckoutPage checkoutPage = new CheckoutPage();

    public void fillAllRequiredFields(
            final String firstName,
            final String lastName,
            final Country country,
            final City city,
            final String zip,
            final boolean saveInfo,
            final PaymentType paymentType
    ){

        Logger.info("Fill all required fields on the checkout page");
        checkoutPage.getFirstNameInput().clearAndType(firstName);
        checkoutPage.getLastNameInput().clearAndType(lastName);
        checkoutPage.getCountrySelector().select(country.getCountryName());
        checkoutPage.getCitySelector().select(city.getCityName());
        checkoutPage.getZipInput().clearAndType(zip);
        if(saveInfo){
            checkoutPage.getSaveInfoLbl().check();
        }
        switch (paymentType){
            case CASH:{
                checkoutPage.getCashLbl().check();
                break;
            }
            case CREDIT_CARD:{
                checkoutPage.getCreditCart().check();
                break;
            }
        }
    }

    public void pressContinueBtn(){
        Logger.info("Press continue btn on the checkout page");
        checkoutPage.getContinueBtn().click();
    }

    public void isAllRequiredFieldsAreVisible(SoftAssertions softAssertion){
        isVisible(softAssertion, checkoutPage.getFirstNameInput(), "First Name");
        isVisible(softAssertion, checkoutPage.getLastNameInput(), "Last Name");
        isVisible(softAssertion, checkoutPage.getCountrySelector(), "Country");
        isVisible(softAssertion, checkoutPage.getCitySelector(), "City");
        isVisible(softAssertion, checkoutPage.getZipInput(), "Zip");
        isVisible(softAssertion, checkoutPage.getCashLbl(), "Cash");
        isVisible(softAssertion, checkoutPage.getCreditCart(), "Credit Cart");
    }

    public void isContinueVisible(SoftAssertions softAssertion){
        isVisible(softAssertion, checkoutPage.getContinueBtn(), "Continue");
    }
}
