package scripts;

import org.testng.annotations.Test;
import pom.LoginPage;
import pom.ProductSearch;
import util.OpenBrowser;

public class TestLogin extends OpenBrowser
{
    @Test
    public void test1Login() throws InterruptedException
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication();
    }
    @Test
    public void test2Search() throws InterruptedException
    {
        ProductSearch productSearch = new ProductSearch(driver);
        productSearch.SearchProduct();
    }
}
