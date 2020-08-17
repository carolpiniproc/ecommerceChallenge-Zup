package steps;

import Settings.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CartPage;
import pages.SearchPage;

public class BuyandFlowSteps {
    SearchPage searchPage = new SearchPage();
    CartPage cartPage = new CartPage();


    @Given("customer is on Amazon")
    public void customerIsOnAmazon() {
        Driver.setUrl("https://www.amazon.com.br/");
        searchPage.isPageLoaded();
    }

    @When("searches for {string}")
    public void searchesFor(String value) {
        searchPage.searchProduct(value,  Keys.ENTER);
        searchPage.clickProductResult(value);
        Assert.assertThat(searchPage.getProductTitle(), CoreMatchers.containsString(value));
    }
    
    @And("wants a regular cover")
    public void wantsARegularCover() {
        searchPage.clickCoverType();
    }

    @When("wants a hard cover book")
    public void wantsAHardCoverBook() {
       searchPage.clickHardCoverType();
    }

    @When("wants a new book on Kindle")
    public void wants_a_new_book_on_kindle() {
       searchPage.clickKindleType();
       searchPage.clickAddToKindle();
    }

    @Then("he adds it on the shopping cart")
    public void heAddsItOnTheShoppingCart() {
        searchPage.clickAddToCart();
        searchPage.clickCart();
    }


    @Then("the book {string} is there")
    public void theBookIsThere(String value) {
        Assert.assertTrue(cartPage.checkCartProductList(value));
    }

    @Then("Amazon asks for login")
    public void amazonAsksForLogin() {
        Assert.assertTrue(cartPage.submitLoginFormButton());
    }
}
