Feature: Checkout feature

  Background:
    Given product page is open
    When select any product from the list and click the "Buy" button

  Scenario: check that the checkout page is shown after clicking the Buy button for any product
    Then checkout page is open: "First name" input, "Last name" input, "Country" selector, "City" selector, "Zip code" input, "Payment method" radio buttons, "Save info" checkbox and button "Continue"

  Scenario Outline: check that the success page is shown after successfull checkout
    When fill all required fields on the checkout page: First name=<firstName>, Last name=<lastName>, Country=<country>, City=<city>, Payment=<payment> Zip, Code=<zip> and save=<save>
    And press continue button on the checkout page
    Then success page is open: "Thank You!" label and "Continue" button
    And order added to the database

    Examples:
      |firstName|lastName|country|city|zip|payment|save|
      |Dzmitry  |Klokau  |BELARUS|GRODNO|230000|CASH|true|
      |TestName  |TestFirstName  |BELARUS|GRODNO|230000|CASH|true|

  Scenario:
    Then failed step