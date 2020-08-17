package mappers;
import Settings.Elements;
import Settings.ByValue;

public class SearchMap {

    public Elements amazonLogo = new Elements(ByValue.ID, "nav-logo");
    public Elements searchInput = new Elements(ByValue.ID, "twotabsearchtextbox");
    public Elements searchResultList = new Elements(ByValue.CSS, "div.s-search-results h2 > a span");
    public Elements productSinglePage = new Elements(ByValue.ID, "productTitle");
    public Elements coverType = new Elements(ByValue.CSS, "#tmmSwatches li:last-child .a-button-text > span:first-child");
    public Elements hardCoverType = new Elements(ByValue.CSS, "#tmmSwatches li:last-child .a-button-text > span:first-child");
    public Elements kindleType = new Elements(ByValue.CSS, "#tmmSwatches li:first-child");
    public Elements addToCartButton = new Elements(ByValue.ID, "add-to-cart-button");
    public Elements addToKindle = new Elements(ByValue.ID, "one-click-button");
    public Elements openCart = new Elements(ByValue.ID, "nav-cart");
}
