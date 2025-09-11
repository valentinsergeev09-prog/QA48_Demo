package experimints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssSelector {
    WebDriver driver = new ChromeDriver();;

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }


    @Test
    public void selectorHomePage() {
        pause(1);

        WebElement footer = driver.findElement(By.tagName("footer"));
        System.out.println(footer.getTagName());

    //  WebElement divElement = driver.findElement(By.className("card-up"));
    //  WebElement divElement = driver.findElement(By.cssSelector(".card-up"))\
    //  WebElement divElement = driver.findElement(By.cssSelector("*[class='card-up']"));
        WebElement divElement = driver.findElement(By.cssSelector("div[class='card-up']"));

        divElement.click();
        pause(2);

    //  WebElement btnRadioButton = driver.findElement(By.id("item-2"));
    //  WebElement btnRadioButton = driver.findElement(By.cssSelector("#item-2"));
        WebElement btnRadioButton = driver.findElement(By.cssSelector("*[id='item-2']"));
        btnRadioButton.click();
        pause(2);

     // WebElement btnImpressive = driver.findElement(By.id("impressiveRadio"));
        WebElement btnImpressive =  driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        btnImpressive.click();
        pause(2);

    //    WebElement btnButton = driver.findElement(By.id("item-4"));
        WebElement btnButton = driver.findElement(By.cssSelector("li:nth-child(5)"));
        btnButton.click();
    //  WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
        WebElement btnDoubleClick  = driver.findElement(By.cssSelector("#doubleClickBtn"));
        btnDoubleClick.click();
        pause(2);

        driver.navigate().back();
    }

    public void pause(int time){
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
