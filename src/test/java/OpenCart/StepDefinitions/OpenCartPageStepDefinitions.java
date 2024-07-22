package OpenCart.StepDefinitions;

import OpenCart.Steps.OpenCartUser;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class OpenCartPageStepDefinitions {
    @Steps(shared=true)
    OpenCartUser openCartUser;
    @Given("^user navigates to https://opencart.abstracta.us/$")
    public void userNavigatesToOpenCartPage() {
        openCartUser.navigatesTo();
        Serenity.takeScreenshot();
    }
    @Given("^Selects Phones and PDAs$")
    public void selectsPhonesAndPDAs() {
        openCartUser.selectPhonesAndPDAs();
        Serenity.takeScreenshot();
    }
    @When("^Clicks on add to cart for First Product$")
    public void clicksOnAddToCartForFirstProduct() {
        openCartUser.addToCartFirstItem();
        Serenity.takeScreenshot();
    }
    @And("^Clicks on add to cart for Second Product$")
    public void clicksOnAddToCartForSecondProduct() {
        openCartUser.addToCartSecondItem();
        Serenity.takeScreenshot();
    }
    @Then("^User Clicks CheckOut$")
    public void userClicksCheckOut() {
        openCartUser.clicksOnCheckOut();
        Serenity.takeScreenshot();
    }
    @Then("^Selects Guest CheckOut$")
    public void selectsGuestCheckOut() {
        openCartUser.selectsGuestCheckOut();
        Serenity.takeScreenshot();
    }
    @And("^Fills In Billing Details (.*) and (.*) and Continue$")
    public void fillsInBillingDetailsAndAddressAndContinue(String personalDetails, String address) {
        openCartUser.enterPersonalDetails(personalDetails);
        openCartUser.enterAddress(address);
//        openCartUser.checkDelyveeryAndShippinAddress();
        openCartUser.clickOnOontinueAsAGuestButton();
        Serenity.takeScreenshot();
    }
    @And("^Click on Continue for the Delivery Method$")
    public void clicksOnContinueForDeliveryMethod() {
        openCartUser.clicksOnContinueForShippingMethod();
        Serenity.takeScreenshot();
    }
    @And("^Click on Continue for the Payment Method Accepting Terms and Conditions$")
    public void clicksOnContinueForPaymentMethodAcceptingTermsAndConditions() {
        openCartUser.acceptsTermsAndConditions();
        openCartUser.clicksOnContinueForPaymentMethod();
        Serenity.takeScreenshot();
    }
    @And("^Click on Confirm Order$")
    public void clicksOnConfirmOrder() {
        openCartUser.clicksOnConfirmOrder();
        Serenity.takeScreenshot();
    }
    @Then("^Verify Your order has been placed with the message (.*)$")
    public void verifyYourOrderHasBeenPlacedWithTheMessage(String confirmationMessage) {
        Assert.assertEquals(openCartUser.getFinalConfirmation(),confirmationMessage);
        Serenity.takeScreenshot();
    }


}
