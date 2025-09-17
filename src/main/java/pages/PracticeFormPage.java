package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PracticeFormPage extends BasePage{
    public PracticeFormPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement inputFirstName;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement inputLastName;
    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    WebElement inputEmail;

    public void typePracticeForm(){
        hideBanner();
        hideFooter();
        inputFirstName.sendKeys("John");
        inputLastName.sendKeys("Doe");
        inputEmail.sendKeys("vall@gmail.com");

    }



}
