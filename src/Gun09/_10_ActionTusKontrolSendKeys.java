package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _10_ActionTusKontrolSendKeys extends BaseDriver {

    @Test

    public void test() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.id("autoCompleteSingleInput"));
        MyFunc.Bekle(2);

        // txtBox'a git,içine tıklat,b harfine bas,aşağı yön tuşuna bas,enter a bas.
        Actions driverAksiyon = new Actions(driver);

        driverAksiyon
                .moveToElement(txtBox).
                click().
                sendKeys("b").
                build().
                perform();

        MyFunc.Bekle(2); // tuşa basıldığında seçeneklerin çıkması için bir süre gerekiyor.Eğer bekle komutunu
        // çağırmazsak o süre geçmeden işlem yapmaya çalışacağı için sıkıntı olabilir.

        driverAksiyon.
                sendKeys(Keys.DOWN).
                sendKeys(Keys.ENTER).
                build().
                perform();


        BekleKapat();


    }
}
