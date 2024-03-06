package Gun05;

import Utility.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Test; // Bu junit Javan'nın kendi test kütüphanesi.Altta Test1 metodunu yazmamızı sağlıyor.
// Yani bunlar test organizatörü.Test kütüphaneleri bu işe yarıyor.
// Selenium ise WEB DRIVER yani testi yapmanı sağlayan araç.

public class _04_CssSelector_Test extends BaseDriver {


    @Test
    public void Test1()
    {


        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement element = driver.findElement(By.cssSelector("input[id='user-message']"));
        element.sendKeys("Mert Özmen");

        WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));


        Assert.assertTrue("Aranılan mesaj bulunamadı !", msg.getText().contains("Mert Özmen"));

        // Ben true bekliyorum, değilse göster , yoksa test passed.

        BekleKapat();
    }
}
