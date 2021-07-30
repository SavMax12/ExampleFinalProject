package stepdefs.db;

import io.cucumber.java.en.And;
import state.OrderState;

public class DbStepdefs {

    private final OrderState orderState;

    public DbStepdefs(OrderState orderState) {
        this.orderState = orderState;
    }

    @And("order added to the database")
    public void orderAddedToTheDatabase() {
        System.out.println("Perform DB validation");
        System.out.println(orderState);
    }
}
