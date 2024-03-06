package Gun12;
/*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class _02_Soru extends BaseDriver {

    @Test

    public void test() {

        driver.get("https://chercher.tech/practice/frames");
        wait.until(ExpectedConditions.urlToBe("https://chercher.tech/practice/frames"));

        driver.switchTo().frame(0);

        WebElement topic = driver.findElement(By.cssSelector("[type='text']"));
        topic.sendKeys("Türkiye");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");

        WebElement animal = driver.findElement(By.id("animals"));
        Select menu = new Select(animal);
        menu.selectByVisibleText("Avatar");

        BekleKapat();

    }
}
