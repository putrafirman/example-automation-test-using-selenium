package com.blibli.behaviour;

import com.blibli.pages.BlibliHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BlibliHomePageBehaviour extends ScenarioSteps{

    BlibliHomePage blibliHome;

    @Step
    public void open() {
        getDriver().get("https://www.blibli.com/");

    }

    @Step
    public void clickUserLogin() {
        //bfp_testqa@mailinatar.com
        //bfp_testqa123
        blibliHome.getLoginButton().click();
        blibliHome.getInputLoginEmail().type("bfp_testqa@mailinatar.com");
        blibliHome.getInputLoginPassword().type("bfp_testqa123");
        blibliHome.getSubmitLoginButton().click();
    }

    @Step
    public void checkUserAlreadyLoggedin(){
        blibliHome.getAlreadyLoginUser().isCurrentlyVisible();
    }

    @Step
    public void searchItem() {
        blibliHome.getSearchInput().type("modem");
        blibliHome.getButtonSearch().click();
        if (blibliHome.getButtonSkipGojek().isPresent()){
            blibliHome.getButtonSkipGojek().click();
        }

    }

    @Step
    public void clickSkipGojek() {
        blibliHome.getButtonSkipGojek().click();
    }

    @Step
    public void clickProductItem() {
        blibliHome.getButtonToGetProductDetails().click();
    }

    @Step
    public void clickAddToCart(){
        blibliHome.getButtonAddToCart().click();
    }

    @Step
    public void clickToCheckout(){
        blibliHome.getButtonContinueCheckout().click();
    }

    @Step
    public void chooseAndFillPayment(){
        blibliHome.getButtonChooseKlikBcaForm().click();
        blibliHome.getInputPaymentUserId().type("testqa");
        waitABit(1000);
        blibliHome.getButtonContinueChoosePayment().click();
    }

    @Step
    public void submitMyOrders(){
        blibliHome.getButtonContinueCompleteOrders().click();
        blibliHome.getResultThankYouPage().isCurrentlyVisible();
    }

}
