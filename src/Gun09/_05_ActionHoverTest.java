package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionHoverTest extends BaseDriver {

    @Test

    public void test() {
        driver.get("https://www.hepsiburada.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunc.Bekle(2);

        Actions aksiyonDriver = new Actions(driver);
        Action aksiyon = aksiyonDriver.moveToElement(element).build(); // burada click yok çünkü ikonun üstüne gidiyor
        // ama click yapmıyor,etki ediyor.
        aksiyon.perform(); // etkinleştir.(mouse üzerinde).

        // new Actions(driver).moveToElement(element).build().perform();


        BekleKapat();


    }
}
