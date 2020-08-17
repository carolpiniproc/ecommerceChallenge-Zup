package pages;

import Settings.Driver;
import mappers.SearchMap;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchPage {
    SearchMap searchMap = new SearchMap();

    public boolean isPageLoaded(){
        return searchMap.amazonLogo.isDisplayed();
    }

    public void searchProduct(CharSequence... valor) {
        searchMap.searchInput.sendKeys(valor);
    }

    public void clickProductResult(String value) {
        List<WebElement> products = searchMap.searchResultList.getElements();
        for (WebElement product : products) {
            searchMap.searchResultList.setWebElement(product);
            String productTitle = product.getText();
            if (productTitle.contains(value)) {
                product.click();
                return;
            }
        }
    }

    public String getProductTitle(){
        return searchMap.productSinglePage.getText();
    }

    public void clickCoverType(){
        if (searchMap.coverType.isDisplayed()) {
            searchMap.coverType.click();
        }
    }

    public void clickHardCoverType() {
        if (searchMap.hardCoverType.isDisplayed()) {
            searchMap.hardCoverType.click();
        }
    }

    public void clickKindleType(){
        if (searchMap.kindleType.isDisplayed()) {
            searchMap.kindleType.click();
        }
    }

    public void clickAddToCart(){
        searchMap.addToCartButton.click();
    }

    public void clickAddToKindle(){
        searchMap.addToKindle.click();
    }

    public void clickCart(){
        searchMap.openCart.click();
    }
}
