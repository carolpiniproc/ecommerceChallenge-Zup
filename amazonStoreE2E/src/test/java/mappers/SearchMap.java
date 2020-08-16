package mappers;
import Settings.Elements;
import Settings.ByValue;

public class SearchMap {

    public Elements amazonLogo = new Elements(ByValue.ID, "nav-logo");
    public Elements searchInput = new Elements(ByValue.ID, "twotabsearchtextbox");
    public Elements searchResultList = new Elements(ByValue.CSS, "div.s-search-results h2 > a span");
}
