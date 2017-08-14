package com.blibli.pages;

import com.google.common.base.Predicate;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BlibliHomePage extends PageObject {

    //bfp_testqa@mailinatar.com
    //bfp_testqa123

    @FindBy(id = "gdn-login-registrasi")
    private WebElementFacade loginButton;

    @FindBy(id = "gdn-login-modal-body")
    private WebElementFacade popupLoginForm;

    @FindBy(id = "loginEmail")
    private WebElementFacade inputLoginEmail;

    @FindBy(id = "loginPassword")
    private WebElementFacade inputLoginPassword;

    @FindBy(id = "gdn-submit-login")
    private WebElementFacade submitLoginButton;

    @FindBy(id = "gdn-submit-login-label")
    private WebElementFacade alreadyLoginUser;

    //input search field
    @FindBy(name = "s")
    private WebElementFacade searchInput;

    //button search
    @FindBy(id="gdn-search-button")
    private WebElementFacade buttonSearch;

    //gojek skip button
    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/div[4]/nav/div[2]/button")
    private WebElementFacade buttonSkipGojek;

    //get from list -> product detail
    @FindBy(xpath = "//*[@id=\"catalogProductListContentDiv\"]/div[1]/div/a/div")
    private WebElementFacade buttonToGetProductDetails;

    //button to add card
    @FindBy(id = "gdn-buy-now-top")
    private WebElementFacade buttonAddToCart;

    //checkout
    @FindBy(id ="gdn-sb-page-continue-checkout")
    private WebElementFacade buttonContinueCheckout;

    //next pembayaran ke pemilihan
    @FindBy(id = "gdn-next-step")
    private  WebElementFacade buttonContinueChoosePayment;

    //milih payment
    @FindBy(id= "gdn-payment-option-KlikBCA")
    private WebElementFacade buttonChooseKlikBcaForm;

    //fill klikbca userid
    @FindBy(xpath = "//*[@id=\"payment_userid\"]")
    private  WebElementFacade inputPaymentUserId;

    //bayar and check complate
    @FindBy(id ="gdn-mbl-submit-checkout")
    private  WebElementFacade buttonContinueCompleteOrders;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/section/div/div")
    private WebElementFacade resultThankYouPage;


    public WebElementFacade getResultThankYouPage() {
        return resultThankYouPage;
    }

    public WebElementFacade getButtonChooseKlikBcaForm() {
        return buttonChooseKlikBcaForm;
    }

    public WebElementFacade getButtonSkipGojek() {
        return buttonSkipGojek;
    }

    public WebElementFacade getButtonContinueCheckout() {
        return buttonContinueCheckout;
    }

    public WebElementFacade getButtonContinueChoosePayment() {
        return buttonContinueChoosePayment;
    }

    public WebElementFacade getInputPaymentUserId() {
        return inputPaymentUserId;
    }

    public WebElementFacade getButtonContinueCompleteOrders() {
        return buttonContinueCompleteOrders;
    }

    public WebElementFacade getButtonAddToCart() {
        return buttonAddToCart;
    }

    public WebElementFacade getButtonToGetProductDetails() {
        return buttonToGetProductDetails;
    }

    public WebElementFacade getButtonSearch() {
        return buttonSearch;
    }

    public WebElementFacade getSearchInput() {
        return searchInput;
    }

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    public WebElementFacade getPopupLoginForm() {
        return popupLoginForm;
    }

    public WebElementFacade getInputLoginEmail() {
        return inputLoginEmail;
    }

    public WebElementFacade getInputLoginPassword() {
        return inputLoginPassword;
    }

    public WebElementFacade getSubmitLoginButton() {
        return submitLoginButton;
    }

    public WebElementFacade getAlreadyLoginUser() {
        return alreadyLoginUser;
    }
}
