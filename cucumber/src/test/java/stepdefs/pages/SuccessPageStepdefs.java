package stepdefs.pages;

import io.cucumber.java.en.Then;
import service.ProductsService;
import service.SuccessService;

import static org.junit.Assert.assertTrue;

public class SuccessPageStepdefs {

    private final SuccessService successService = new SuccessService();

    @Then("success page is open: \"Thank You!\" label and \"Continue\" button")
    public void successPageIsOpenLabelAndButton() {
        assertTrue(successService.isPageShown()) ;
    }
}
