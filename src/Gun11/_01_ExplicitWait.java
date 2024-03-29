package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
/*
   Interview Sorusu : ImplicitlyWait ile ExplicitWait arasında ne fark vardır

   Implicitly : Bütün elementler için kullanılır.1 kere yazılır ve HTML de ilgili locator
                var mı ? (findElement/s bunda çalışır)

   Explicit   : Elemente özeldir. Element için verilen kriterin kontrolü için mühlet, süre.

 */

public class _01_ExplicitWait extends BaseDriver {

    @Test

    public void test() {
        // element var ama tıklanabilir olana kadar beklemem gereken durumlar.
        // element var ama içine yazı gönderilebilir durumda değil.
        // alert'in gözükmesini bekle.
        // url beklediğin gibi olana kadar bekle.

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        WebElement msg = driver.findElement(By.id("demo"));


        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(20));
        // üst limit 20 sn bekle

        bekle.until(ExpectedConditions.textToBe(By.id("demo"), "WebDriver"));
        // text i bu olana kadar bekle ama üst limit 20 sn

        System.out.println("msg.getText() = " + msg.getText());

        BekleKapat();
    }
}
