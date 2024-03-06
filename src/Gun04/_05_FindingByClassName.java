package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {

        // Browserda incelem yaptığımızda id lerden arama için # , class aramaları için . kullanılabilir
        // aratılacak kelimenin başına koyulur bu imgeler.

        // Senaryo
        // 1-  https://form.jotform.com/221934510376353 sayfasını açınız.
        // 2-  bütün labellerı bulup , textlerini yazdırınız.

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element = driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText() = " + element.getText());
        // findElement : locator birden fazla elemanı işaret ediyorsa bile,ilkini bulur.

        // Bütün elemanları almak için findElementS kullanılır.
        List<WebElement> etiketler = driver.findElements(By.className("form-sub-label"));
        System.out.println("etiketler.size() = " + etiketler.size());

        for (WebElement e : etiketler) {
            System.out.println("e.getText() = " + e.getText());
        }

        MyFunc.Bekle(6);
        driver.quit();

    }
}
