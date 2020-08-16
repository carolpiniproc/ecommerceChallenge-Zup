package steps;

import Settings.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.CartPage;
import pages.SearchPage;
import pages.SinglePage;

public class BuyandFlowSteps {
    SearchPage searchPage = new SearchPage();
    SinglePage singlePage = new SinglePage();
    CartPage cartPage = new CartPage();


    @Given("customer is on Amazon")
    public void customerIsOnAmazon() throws InterruptedException {
        Driver.setUrl("https://www.amazon.com.br/");
        searchPage.isPageLoaded();
    }

    @When("searches for {string}")
    public void searchesFor(String value) {
        searchPage.searchProduct(value,  Keys.ENTER);
     //   searchPage.getProductResult(value);
     //   searchPage.clickProductResult(value);
    }
    
    @And("wants a regular cover")
    public void wantsARegularCover() {
        singlePage.checkProductSinglePage();
     //   singlePage.clickCoverType();
    }
    
    @Then("he adds it on the shopping cart")
    public void heAddesItOnTheShoppingCart() {
       singlePage.clickAddToCart();
       singlePage.clickCart();
    }


    @Then("the book {string} is there")
    public void theBookIsThere(String value) {
        cartPage.checkCartProductList(value);
    }
}
