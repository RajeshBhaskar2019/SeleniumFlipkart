package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import scripts.TestLogin;

import java.util.concurrent.TimeUnit;

public class LoginPage
{
    private WebDriver driver;

    @FindBy(linkText = "Login & Signup")
    private WebElement loginLink;

    @FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
    private WebElement emailTextField;

    //@FindBy(className = "_2zrpKA _3v41xv _1dBPDZ")
    @FindBy(xpath = "//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
    private WebElement passwordTextField;

    //@FindBy(className = "_2AkmmA _1LctnI _7UHT_c")
    @FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
    private WebElement loginButton;


    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void enterEmail(String email)
    {
        emailTextField.sendKeys(email);
    }
    public void enterPassword(String password)
    {
        passwordTextField.sendKeys(password);
    }
    public void clickLoginButton()
    {
        loginButton.click();
    }
    public void loginToApplication() throws InterruptedException
    {
       // loginLink.click();

            Thread.sleep(100);
            enterEmail("8970803186");
            Thread.sleep(100);
            enterPassword("Rajmoto@2019");
            clickLoginButton();
            Thread.sleep(100);


    }
}

