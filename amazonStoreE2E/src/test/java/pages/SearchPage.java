package pages;

import Settings.Elements;
import mappers.SearchMap;
import org.openqa.selenium.Keys;
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
    public boolean getProductResult(String value) {
        List<WebElement> products = searchMap.searchResultList.getElements();
            for (WebElement product : products) {
                searchMap.searchResultList.setWebElement(product);
                String productTitle = product.getText();
                if (productTitle.contains(value)) {
                    return true;
                }
            }
            return false;
    }

    public void clickProductResult(String value) {
        List<WebElement> products = searchMap.searchResultList.getElements();
        for (WebElement product : products) {
            searchMap.searchResultList.setWebElement(product);
            String productTitle = product.getText();
            if (productTitle.contains(value)) {
                product.click();
            }
        }
    }
}
