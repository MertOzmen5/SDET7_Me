package Gun13;
/*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowsSoru extends BaseDriver {

    @Test
    public void test() {

        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        List<WebElement> linkler = driver.findElements(By.cssSelector("[target='_blank']"));

        String anaSayfaWindowID = driver.getWindowHandle(); // bulunduğum window un ID sini verir

        for (WebElement e : linkler) {
            // e.click();
            js.executeScript("arguments[0].click();", e);
        }
        Set<String> windowsIDler = driver.getWindowHandles(); // bütün sekmelerin id sini ver

        // bütün açık tablerin title

        for (String id : windowsIDler) {
            driver.switchTo().window(id); // sıradaki id ye geçtim
            System.out.println(id + " " + driver.getTitle() + " " + driver.getCurrentUrl());
        }

        // ana sayfa hariç diğerlerini kapat

        for (String id : windowsIDler) {


            if (id.equals(anaSayfaWindowID)) continue; // ana sayfa hariç devam

            driver.switchTo().window(id); // ilgili sekmeye geç
            driver.close(); // sadece onu kapat
        }

        BekleKapat();


    }
}
