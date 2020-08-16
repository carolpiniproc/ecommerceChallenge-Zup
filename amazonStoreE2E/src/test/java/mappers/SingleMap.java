package mappers;
import Settings.Elements;
import Settings.ByValue;

public class SingleMap {

    public Elements productSinglePage = new Elements(ByValue.ID, "productTitle");
   // public Elements coverType = new Elements(ByValue.CSS, "#tmmSwatches li:last-child .a-button-text > span:first-child");
    public Elements coverType = new Elements(ByValue.ID, "a-autoid-3-announce");
    public Elements addToCartButton = new Elements(ByValue.ID, "add-to-cart-button");
    public Elements openCart = new Elements(ByValue.ID, "nav-cart");
}
