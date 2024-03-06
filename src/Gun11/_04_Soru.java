package Gun11;
/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _04_Soru extends BaseDriver {

    @Test
    public void test() {

        driver.get("https://www.demoblaze.com/index.html");

        WebElement samsung = driver.findElement(By.linkText("Samsung galaxy s6"));
        samsung.click();

        WebElement addToCart = driver.findElement(By.linkText("Add to cart"));
        addToCart.click();

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        WebElement logo = driver.findElement(By.linkText("PRODUCT STORE"));
        logo.click();

        Assert.assertTrue("Ana sayfa url si bulunamadı",
                driver.getCurrentUrl().equals("https://www.demoblaze.com/index.html"));

        BekleKapat();

    }
}
