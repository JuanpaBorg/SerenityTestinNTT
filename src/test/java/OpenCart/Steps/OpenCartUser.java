package OpenCart.Steps;

import OpenCart.Pages.OpenCartPage;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Steps;
public class OpenCartUser extends ScenarioActor{
    @Steps(shared=true)
    OpenCartPage openCartPage;
    public void navigatesTo() {
        openCartPage.setDefaultBaseUrl("https://opencart.abstracta.us/");
        openCartPage.open();
    }
    public void enterPersonalDetails(String personalDetails) {
        openCartPage.enterPaymentDetailsFirstName(personalDetails.split(",")[0]);
        openCartPage.enterPaymentDetailsLastName(personalDetails.split(",")[1]);
        openCartPage.enterPaymentDetailsEmail(personalDetails.split(",")[2]);
        openCartPage.enterPaymentDetailsPhone(personalDetails.split(",")[3]);
    }
    public void enterAddress(String Address) {
        openCartPage.enterPaymentDetailsAddress1(Address.split(",")[0]);
        openCartPage.enterPaymentDetailsCity(Address.split(",")[1]);
        openCartPage.enterPaymentDetailsPostcode(Address.split(",")[2]);
        openCartPage.selectPaymentDetailsCountry(Address.split(",")[3]);
        openCartPage.selectPaymentDetailsRegion(Address.split(",")[4]);
    }
    public String getFinalConfirmation() {
        System.out.println(openCartPage.getOrderPlacedPlaceHolderText());
        return openCartPage.getOrderPlacedPlaceHolderText();
    }
    public void navigateToPhonesAndPDAs() {
        openCartPage.navigateToPhonesAndPDAs();
    }
    public void addToCartFirstItem() {
        openCartPage.addToCartFirstItem();
    }
    public void addToCartSecondItem() {
        openCartPage.addToCartSecondItem();
    }
    public void addToCartThirdItem() {
        openCartPage.addToCartThirdItem();
    }
    public void selectPhonesAndPDAs(){
        openCartPage.navigateToPhonesAndPDAs();
    }
    public void clicksOnCheckOut(){
        openCartPage.clickOnCheckout();
    }
    public void selectsGuestCheckOut(){
        openCartPage.selectGuestCheckOut();
        openCartPage.continueToCheckoutButton();
    }
    public void checkDelyveeryAndShippinAddress(){
        openCartPage.checkDeliveryAndBillingAddress();
    }
    public void clickOnOontinueAsAGuestButton(){
        openCartPage.continueAsGuest();
    }
    public void clicksOnContinueForShippingMethod(){
        openCartPage.clickShippingMethod();
    }
    public void acceptsTermsAndConditions(){
        openCartPage.acceptTermsAndConditions();
    }
    public void clicksOnConfirmOrder(){
        openCartPage.confirmOrder();
    }
    public void clicksOnContinueForPaymentMethod(){
        openCartPage.clickPaymentMethod();
    }






}
