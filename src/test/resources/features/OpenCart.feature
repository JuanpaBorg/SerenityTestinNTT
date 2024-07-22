Feature: Anonymous Checkout on OpenCart

  Background:

    Given user navigates to https://opencart.abstracta.us/

  Scenario Outline: Add two items to cart and check out Anonymously

    Given Selects Phones and PDAs
    When Clicks on add to cart for First Product
    And Clicks on add to cart for Second Product
    Then User Clicks CheckOut
    Then Selects Guest CheckOut
    * Fills In Billing Details <PersonalDetails> and <Address> and Continue
#    * Click on Continue for the Delivery Details
    * Click on Continue for the Delivery Method
    * Click on Continue for the Payment Method Accepting Terms and Conditions
    And Click on Confirm Order
    Then Verify Your order has been placed with the message <ConfirmationMessage>

    Examples:
      | PersonalDetails                          | Address                                     | ConfirmationMessage         |
      | Juan,Perez,juanperez@ntt.data,0987654321 | Carolina Park,Quito,17171,Ecuador,Pichincha | Your order has been placed! |