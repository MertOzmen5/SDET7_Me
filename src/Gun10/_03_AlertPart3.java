package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_AlertPart3 extends BaseDriver {

    @Test

    public void test(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunc.Bekle(3);

        WebElement clickMe3= driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        clickMe3.click();
        MyFunc.Bekle(3);

        String alertYazi=driver.switchTo().alert().getText();
        System.out.println("alertYazi = " + alertYazi); // alertin yazısına ulaştım

        driver.switchTo().alert().sendKeys("mert"); // prompt'a yazı gönderdim.
        MyFunc.Bekle(2);
        driver.switchTo().alert().accept(); // ok'e bastım

        WebElement msg= driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("Girilen yazı bulunamadı",msg.getText().contains("mert")); // çıkan mesajı kontrol ettim

        BekleKapat();
    }
}
