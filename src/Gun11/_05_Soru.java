package Gun11;
/*Senaryo:
        https://google.com/ da selenium kelimesini aratınız.
        ilk çıkan sonuca tıklatıp,
        çıkan URL yi ekrana yazdırınız.
        Beklenen url https://www.selenium.dev/  olduğunu doğrulayınız

 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class _05_Soru extends BaseDriver {

    @Test

    public void test(){

        driver.get("https://google.com/ ");
        wait.until(ExpectedConditions.urlToBe("https://www.google.com/"));


        Actions driverAksiyon=new Actions(driver);

        WebElement search= driver.findElement(By.cssSelector("[class='gLFyf']"));

        driverAksiyon.moveToElement(search).sendKeys("selenium").sendKeys(Keys.ENTER).build().perform();

        WebElement selenium= driver.findElement(By.cssSelector("[href='https://www.selenium.dev/']"));
        selenium.click();
        wait.until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue("Url yanlış",driver.getCurrentUrl().equals("https://www.selenium.dev/"));



        BekleKapat();

    }
}
