package stepdefs.pages;

import io.cucumber.java.en.Then;

public class FailedStepDefs {
    @Then("failed step")
    public void failedStep() {
        throw new RuntimeException("Some validation failed");
    }
}
