package pages;
import mappers.SingleMap;

public class SinglePage {
    SingleMap singleMap = new SingleMap();

    public boolean checkProductSinglePage(){
        return singleMap.productSinglePage.isDisplayed();
    }

    public void clickCoverType(){
        if (singleMap.coverType.isDisplayed()) {
            singleMap.coverType.click();
        }
    }

    public void clickAddToCart(){
        singleMap.addToCartButton.click();
    }

    public void clickCart(){
        singleMap.openCart.click();
    }
}
