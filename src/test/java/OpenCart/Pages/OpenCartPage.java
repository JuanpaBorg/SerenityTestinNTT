package OpenCart.Pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
public class OpenCartPage extends PageObject {

    @FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[6]/a")
    WebElementFacade PhonesAndPDAs;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]")
    WebElementFacade addToCart1;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[1]")
    WebElementFacade addToCart2;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[2]/button[1]")
    WebElementFacade addToCart3;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[5]/a")
    WebElementFacade toCheckOutLink;

    @FindBy(xpath = "//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label")
    WebElementFacade GuestCheckOutRadioButtonOption;
    @FindBy(xpath = "//*[@id=\"button-account\"]")
    WebElementFacade ContinueOnCheckoutButton;

    @FindBy(xpath = "//*[@id=\"input-payment-firstname\"]")
    WebElementFacade PaymentFirstNameField;
    @FindBy(xpath = "//*[@id=\"input-payment-lastname\"]")
    WebElementFacade PaymentLastNameField;
    @FindBy(xpath = "//*[@id=\"input-payment-email\"]")
    WebElementFacade PaymentEmailField;
    @FindBy(xpath = "//*[@id=\"input-payment-telephone\"]")
    WebElementFacade PaymentPhoneField;
    @FindBy(xpath = "//*[@id=\"input-payment-address-1\"]")
    WebElementFacade PaymentAddress1Field;
    @FindBy(xpath = "//*[@id=\"input-payment-city\"]")
    WebElementFacade PaymentCityField;
    @FindBy(xpath = "//*[@id=\"input-payment-postcode\"]")
    WebElementFacade PaymentPostcodeField;
    @FindBy(xpath = "//*[@id=\"input-payment-country\"]/option[69]")
    WebElementFacade PaymentCountryFieldOption69;
    @FindBy(xpath = "//*[@id=\"input-payment-country\"]")
    WebElementFacade PaymentCountryField;
    @FindBy(xpath = "//*[@id=\"input-payment-zone\"]/option[20]")
    WebElementFacade PaymentRegionFieldOption20;
    @FindBy(xpath = "//*[@id=\"input-payment-zone\"]")
    WebElementFacade PaymentRegionField;
    @FindBy(xpath = "//*[@id=\"collapse-payment-address\"]/div/div[2]/label")
    WebElementFacade CheckDeliveryAndBillingAddress;
    @FindBy(xpath = "//*[@id=\"button-guest\"]")
    WebElementFacade ButtonContinueGuest;

    @FindBy(xpath = "//*[@id=\"button-shipping-method\"]")
    WebElementFacade ButtonShippingMethod;

    @FindBy(xpath = "//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]")
    WebElementFacade AcceptedTermsAndConditions;
    @FindBy(xpath = "//*[@id=\"button-payment-method\"]")
    WebElementFacade ButtonPaymentMethod;

    @FindBy(xpath = "//*[@id=\"button-confirm\"]")
    WebElementFacade ButtonConfirm;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    WebElementFacade OrderPlacedPlaceHolder;

    public void navigateToPhonesAndPDAs() {
        PhonesAndPDAs.click();
    }

    public void addToCartFirstItem() {
        addToCart1.click();
    }
    public void addToCartSecondItem() {
        addToCart2.click();
    }
    public void addToCartThirdItem() {
        addToCart3.click();
    }

    public void clickOnCheckout() {
        toCheckOutLink.click();
    }

    public void selectGuestCheckOut() {
        GuestCheckOutRadioButtonOption.click();
    }

    public void continueToCheckoutButton() {
        ContinueOnCheckoutButton.click();
    }

    public void enterPaymentDetailsFirstName(String FirstName) {
        PaymentFirstNameField.sendKeys(FirstName);
    }
    public void enterPaymentDetailsLastName(String LastName) {
        PaymentLastNameField.sendKeys(LastName);
    }
    public void enterPaymentDetailsEmail(String Email) {
        PaymentEmailField.sendKeys(Email);
    }
    public void enterPaymentDetailsPhone(String Phone) {
        PaymentPhoneField.sendKeys(Phone);
    }
    public void enterPaymentDetailsAddress1(String Address1) {
        PaymentAddress1Field.sendKeys(Address1);
    }
    public void enterPaymentDetailsCity(String City) {
        PaymentCityField.sendKeys(City);
    }
    public void enterPaymentDetailsPostcode(String Postcode) {
        PaymentPostcodeField.sendKeys(Postcode);
    }
    public void selectPaymentDetailsCountry(String CountryOption) {
        PaymentCountryField.selectByVisibleText(CountryOption);
    }
    public void selectPaymentDetailsRegion(String RegionOption) {
//        PaymentRegionField.click();
        PaymentRegionField.selectByVisibleText(RegionOption);
    }
    public void checkDeliveryAndBillingAddress() {
        CheckDeliveryAndBillingAddress.click();
    }
    public void continueAsGuest() {
        ButtonContinueGuest.click();
    }
    public void clickShippingMethod() {
        ButtonShippingMethod.click();
    }
    public void acceptTermsAndConditions() {
        AcceptedTermsAndConditions.click();
    }
    public void clickPaymentMethod() {
        ButtonPaymentMethod.click();
    }
    public void confirmOrder() {
        ButtonConfirm.click();
    }
    public String getOrderPlacedPlaceHolderText() {
        return OrderPlacedPlaceHolder.getText();
    }
}
