package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {

        // By.name
        // Senaryo (locator olarak name kullanılacak)
        // 1-  https://form.jotform.com/221934510376353 sayfasını açınız.
        // 2- isim kutucuğuna "mert" yazdırınız.
        // 3- soyad kutucuğuna "özmen" yazdırınız.


        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement firstName = driver.findElement(By.name("q8_name[first]"));
        firstName.sendKeys("Mert");

        WebElement lastName = driver.findElement(By.name("q8_name[last]"));
        lastName.sendKeys("Özmen");

        WebElement btnSubmit=driver.findElement(By.id("input_2"));
        btnSubmit.click();

        MyFunc.Bekle(6);

        driver.quit();

    }
}
