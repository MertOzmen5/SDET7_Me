package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _02_ActionClickTest extends BaseDriver {

    @Test

    public void test() {

        driver.get("https://demoqa.com/buttons");

        MyFunc.Bekle(2);
        List<WebElement> consent = driver.findElements(By.xpath("//p[text()='Consent']"));
        if (consent.size() > 0)
            consent.get(0).click();

        WebElement btnClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //btnClick.click(); bu yol da kullanılabilir ama biz action ile yapacağız.

        Actions aksiyonlar = new Actions(driver); // web sayfası aksiyonlara açıldı.

        Action aksiyon = aksiyonlar.moveToElement(btnClick).click().build();
        // elementin üzerine click için git orada bekle,aksiyonu hazırla.
        System.out.println("Aksiyon hazırlandı.");

        MyFunc.Bekle(2);
        aksiyon.perform(); // aksiyon gerçekleşiyor.işleme al, uygula.
        System.out.println("Aksiyon gerçekleşti.");

        // Kısa hali
        // aksiyonlar.moveToElement(btnClick).click().build().perform(); // çok aksiyon için

        // Daha da kısa hali
        // new Actions(driver).moveToElement(btnClick).click().build().perform(); // bir tek aksiyon için

        // Daha da kısası :D
        // new Actions(driver).click(btnClick).build().perform(); // bir tek aksiyon için


        BekleKapat();

    }
}
