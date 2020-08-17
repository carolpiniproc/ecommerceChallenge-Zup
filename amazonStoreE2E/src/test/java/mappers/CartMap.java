package mappers;

import Settings.ByValue;
import Settings.Elements;

public class CartMap {
    public Elements cartProductsList = new Elements(ByValue.CSS, "span.sc-product-title");
    public Elements loginForm = new Elements(ByValue.CSS, "#authportal-main-section h1");
}
