package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {

    // id -> By.id()
    // name -> By.name
    // class -> By.className
    // linktext -> By.linktext (Sadece a tag li elemanlar için kullanılır.) Ve görünen yazısı yazılır.
    // partiallinktext -> By.partiallinktext (Sadece a tag li elemanlar için kullanılır.)

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        //linktext : linkin görünen yazısı selector olarak kullanılır.

        WebElement siparislerimLinki = driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("getText() = " + siparislerimLinki.getText());


        // partiallinktext : Linkin görünen yazısının bir kısmını selector olarak kullanabilirsiniz.

        WebElement link2 = driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText());

        // elementin özelliklerine getAttribute ile ulaşabilirim.
        System.out.println("siparislerimLinki.href = " +siparislerimLinki.getAttribute("href") );
        System.out.println("siparislerimLinki.title = " +siparislerimLinki.getAttribute("title") );
        System.out.println("siparislerimLinki.rel = " +siparislerimLinki.getAttribute("rel") );

        MyFunc.Bekle(6);
        driver.quit();


    }
}
