package Gun11;
/*
        Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
        (xpath kullanmayınız)
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_Soru extends BaseDriver {

    @Test

    public void test() {

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name = driver.findElement(By.cssSelector("[name='title']"));
        name.sendKeys("Mert");

        WebElement comment = driver.findElement(By.cssSelector("textarea[name='description']"));
        comment.sendKeys("yorum");

        WebElement submit = driver.findElement(By.id("btn-submit"));
        submit.click();

        wait.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submited Successfully!"));
        WebElement msg = driver.findElement(By.id("submit-control"));

        Assert.assertTrue("Yazı görünmedi.", msg.getText().equals("Form submited Successfully!"));


        BekleKapat();


    }
}
