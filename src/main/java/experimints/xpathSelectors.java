package experimints;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class xpathSelectors {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @Test
    public void selectorsRadioButtonPage() {
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        pause(2);

        //WebElement btnImpressive =  driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        WebElement btnImpressive =  driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        btnImpressive.click();
        pause(2);

        driver.get("https://demoqa.com/");
        hideBanner();
        hideFooter();
      //WebElement divBookStore = driver.findElement(By.cssSelector("div[class='category-cards'] div[class='card mt-4 top-card']:last-child"));
        WebElement divBookStore = driver.findElement(By.xpath("//div[@class='category-cards']//div[@class='card mt-4 top-card'][last()]"));
        divBookStore.click();
        pause(3);

        driver.navigate().back();
        pause(2);
        WebElement divForms = driver.findElement(By.cssSelector("div[class='category-cards'] div[class='card mt-4 top-card']:nth-child(2)"));
        divForms.click();
        pause(2);

        WebElement bntPracticeForm  = driver.findElement(By.xpath("//*[text()='Practice Form']"));
        bntPracticeForm.click();
        pause(2);

    }


    @Test
    public void selectorsTextbox() {
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();

        WebElement fullName = driver.findElement(By.xpath("//*[@id='userName']"));

        WebElement inputeFullname = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        pause(1);
        inputeFullname.sendKeys("Monkey");
        pause(1);

        WebElement inputeEmail = driver.findElement(By.xpath("//input[@type='email']"));
        pause(1);
        inputeEmail.sendKeys("monkey@gmail.com");
        pause(1);

        WebElement textareaCurrent = driver.findElement(By.xpath("//*[@id='currentAddress']"));
        pause(1);
        textareaCurrent.sendKeys("Monkey Street 123");
        pause(2);


    }





    private void hideBanner() {
        JavascriptExecutor jg = (JavascriptExecutor) driver;
        jg.executeScript("document.querySelector('#fixedban').style.display='none'");
    }
    private void hideFooter() {
        JavascriptExecutor jj = (JavascriptExecutor) driver;
        jj.executeScript("document.querySelector('footer').style.display='none'");
    }





    public void pause(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

