package Gun10;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _05_WaitsGiris extends BaseDriver {

    @Test

    public void test(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet elementi bulma mühleti

        WebElement btn= driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        //Thread.sleep() ; web sayfasını değil java programını durduruyor,gereksiz bekleme yapar.

        // WebElement msg= driver.findElement(By.id("demo"));

        WebElement msg=driver.findElement(By.xpath("//*[text()='WebDriver']"));
        System.out.println("msg.getText() = " + msg.getText());

        BekleKapat();
    }
}
