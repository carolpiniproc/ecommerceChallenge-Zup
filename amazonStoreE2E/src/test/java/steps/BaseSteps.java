package steps;
import Settings.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseSteps {

    @Before
    public void abreBrowser(){
        Driver.openBrowser();
    }

    @After
    public void fechaBrowser(){
        Driver.quitProcess();
    }

}
