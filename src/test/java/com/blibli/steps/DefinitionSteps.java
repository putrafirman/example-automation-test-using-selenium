package com.blibli.steps;

import com.blibli.behaviour.BlibliHomePageBehaviour;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.blibli.steps.serenity.EndUserSteps;

public class DefinitionSteps {

//    @Steps
//    EndUserSteps endUser;

    @Steps
    BlibliHomePageBehaviour blibliHomePageBehaviour;

//    @Given("the user is on the Wikionary home page")
//    public void givenTheUserIsOnTheWikionaryHomePage() {
//        endUser.is_the_home_page();
//    }
//
//    @When("the user looks up the definition of the word '$word'")
//    public void whenTheUserLooksUpTheDefinitionOf(String word) {
//        endUser.looks_for(word);
//    }
//
//    @Then("they should see the definition '$definition'")
//    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
//        endUser.should_see_definition(definition);
//    }

    @Given("open home page")
    public void givenHomePage(){
        blibliHomePageBehaviour.open();
    }

    @When("I login to Blibli")
    public void whenLoginHomepage(){
        blibliHomePageBehaviour.clickUserLogin();
    }

    @Then("I can see muy name in the site")
    public void thenLoginSuccess(){
        blibliHomePageBehaviour.checkUserAlreadyLoggedin();
    }

    @Given("search items")
    public void givenSearchName(){
        blibliHomePageBehaviour.searchItem();
    }

    @When("I found my items")
    public void whenSearch(){
        blibliHomePageBehaviour.clickProductItem();
    }

    @Then("I add to cart")
    public void thenSearchSuccess(){
        blibliHomePageBehaviour.clickAddToCart();
    }

    @Given("next to checkout")
    public void givenToCheckout(){
        blibliHomePageBehaviour.clickToCheckout();
    }

    @When("I choose and fill payment option")
    public void whenChooseAndFillPayment(){
        blibliHomePageBehaviour.chooseAndFillPayment();
    }

    @Then("I submit my orders")
    public void thenSubmitMyOrders(){
        blibliHomePageBehaviour.submitMyOrders();
    }

}
