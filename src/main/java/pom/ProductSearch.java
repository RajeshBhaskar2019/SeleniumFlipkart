package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import scripts.TestLogin;


import java.util.concurrent.TimeUnit;
public class ProductSearch
{
    private WebDriver driver;

   // @FindBy(className = "LM6RPg")
    @FindBy(xpath = "//input[@class='LM6RPg']")
    private WebElement SearchProduct;

    @FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
    private WebElement Product;

    @FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")
    private WebElement Buy;

    @FindBy(xpath="//button[@class='vh79eN']")
    private WebElement SearchButton;

    public ProductSearch(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void SearchItem(String Item)
    {
        SearchProduct.sendKeys(Item);
    }
    public void SearchClick()
    {
        SearchButton.click();
    }
    public void ClickProduct()
    {
        Product.click();
    }
    public void BuyProduct()
    {
        ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));
       Buy.click();
    }
    public void SearchProduct() throws InterruptedException
    {
        //Thread.sleep(4000);
        SearchItem("iphone");
        //Thread.sleep(4000);
        SearchClick();
       // SearchProduct.sendKeys("iphone");
        Thread.sleep(400);
        ClickProduct();
        Thread.sleep(400);
        BuyProduct();
        Thread.sleep(300);
    }

}
