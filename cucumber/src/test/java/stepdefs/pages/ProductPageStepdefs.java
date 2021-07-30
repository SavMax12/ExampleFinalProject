package stepdefs.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import service.ProductsService;
import state.OrderState;

public class ProductPageStepdefs {

    private final OrderState orderState;
    private final ProductsService productsService;

    public ProductPageStepdefs(OrderState orderState, ProductsService productsService) {
        this.orderState = orderState;
        this.productsService = productsService;
    }

    @When("select any product from the list and click the \"Buy\" button")
    public void selectAnyProductFromTheListAndClickTheButton() {
        int productId = productsService.buyRandomProducts();
        orderState.setProductId(productId);
    }
}


