package stepdefs.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import service.HomeService;

public class HomePageStepdefs {

    private final HomeService homeService = new HomeService();

    @Given("product page is open")
    public void productPageIsOpen() {
        homeService.openProducts();
    }
}
