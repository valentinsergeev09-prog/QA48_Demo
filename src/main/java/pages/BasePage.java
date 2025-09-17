package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasePage {
    static WebDriver driver;
     public static void setDriver(WebDriver wd){
         driver = wd;

     }

    public void hideBanner() {
        JavascriptExecutor jg = (JavascriptExecutor) driver;
        jg.executeScript("document.querySelector('#fixedban').style.display='none'");
    }

    public void hideFooter() {
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
