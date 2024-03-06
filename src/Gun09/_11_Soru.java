package Gun09;
//    https://www.mediamarkt.com.tr/ sayfasına gidiniz.
//    Tüm Kategoriler -> Beyaz Eşya -> Kombiler click
//    tıklatma işleminden sonra URL de
//    kombi kelimesinin geçtiğini doğrulayın.

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _11_Soru extends BaseDriver {

    @Test

    public void test() {

        driver.get("https://www.mediamarkt.com.tr/");

        WebElement tumKategori = driver.findElement(By.linkText("Tüm Kategoriler"));
        MyFunc.Bekle(2);

        Actions driverAksiyon = new Actions(driver);
        driverAksiyon.moveToElement(tumKategori).build().perform();
        MyFunc.Bekle(2);

        WebElement beyazEsya = driver.findElement(By.linkText("Beyaz Eşya"));
        MyFunc.Bekle(2);

        new Actions(driver).moveToElement(beyazEsya).build().perform();
        MyFunc.Bekle(2);

        WebElement kombiler = driver.findElement(By.linkText("Kombiler"));
        kombiler.click();
        MyFunc.Bekle(2);

        Assert.assertTrue("Kombi kelimesi geçmiyor", driver.getCurrentUrl().contains("kombi")); //mevcut url
        // getCurrentUrl ile alınıyor.


        BekleKapat();

    }
}
