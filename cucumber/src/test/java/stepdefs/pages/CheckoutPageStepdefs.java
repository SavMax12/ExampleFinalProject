package stepdefs.pages;

import enums.City;
import enums.Country;
import enums.PaymentType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import service.CheckoutService;

public class CheckoutPageStepdefs {

    @Rule
    public final ErrorCollector collector = new ErrorCollector();

    private final CheckoutService checkoutService = new CheckoutService();

    @Then("checkout page is open: \"First name\" input, \"Last name\" input, \"Country\" selector, \"City\" selector, \"Zip code\" input, \"Payment method\" radio buttons, \"Save info\" checkbox and button \"Continue\"")
    public void checkoutPageIsOpenInputInputSelectorSelectorInputRadioButtonsCheckboxAndButton() {
        SoftAssertions softAssertions = new SoftAssertions();
        checkoutService.isAllRequiredFieldsAreVisible(softAssertions);
        checkoutService.isContinueVisible(softAssertions);
        softAssertions.assertAll();
    }

    @And("fill all required fields and press continue button on the checkout page")
    public void fillAllRequiredFieldsAndPressContinueButtonOnTheCheckoutPage() {
        checkoutService.fillAllRequiredFields(
                "Dzmitry",
                "klokau",
                Country.BELARUS,
                City.GRODNO,
                "230000",
                true,
                PaymentType.CASH
        );
        checkoutService.pressContinueBtn();
    }


    @And("press continue button on the checkout page")
    public void pressContinueButtonOnTheCheckoutPage() {

    }

    @When("fill all required fields on the checkout page: First name={word}, Last name={word}, Country={word}, City={word}, Payment={word} Zip, Code={word} and save={word}")
    public void fillAllRequiredFieldsOnTheCheckoutPage(String firstName, String lastName, String country, String city, String payment, String zip, String save) {

        checkoutService.fillAllRequiredFields(
                firstName,
                lastName,
                Country.valueOf(country),
                City.valueOf(city),
                zip,
                Boolean.parseBoolean(save),
                PaymentType.valueOf(payment)
        );
        checkoutService.pressContinueBtn();
    }
}
