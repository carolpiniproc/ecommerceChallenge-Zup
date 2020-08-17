package pages;

import mappers.CartMap;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage {
    CartMap cartMap = new CartMap();

    public boolean checkCartProductList(String value){
        List<WebElement> products = cartMap.cartProductsList.getElements();
        for (WebElement product : products) {
            String productTitle = product.getText();
            if (productTitle.contains(value)) {
                return true;
            }
        }
        return false;
    }

    public boolean submitLoginFormButton() {
        return cartMap.loginForm.isDisplayed();
    }


}
