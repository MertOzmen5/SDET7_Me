package Gun12;
/*
   1-driver.get("https://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 2.elemanını seçiniz.
 */

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru extends BaseDriver {

    @Test

    public void test() {

        driver.get("https://chercher.tech/practice/frames");

        wait.until(ExpectedConditions.urlToBe("https://chercher.tech/practice/frames"));

        driver.switchTo().frame(0);

        WebElement topic = driver.findElement(By.cssSelector("[type='text']"));
        topic.sendKeys("Türkiye");

        driver.switchTo().frame("frame3");

        WebElement tik = driver.findElement(By.cssSelector("[type='checkbox']"));
        tik.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");

        WebElement animal = driver.findElement(By.id("animals"));
        Select menu = new Select(animal);
        menu.selectByVisibleText("Baby Cat");


        BekleKapat();

    }
}
