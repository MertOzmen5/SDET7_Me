package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _04_ActionRightClickTest extends BaseDriver {

    @Test

    public void test() {

        driver.get("https://demoqa.com/buttons");

        MyFunc.Bekle(2);
        List<WebElement> consent = driver.findElements(By.xpath("//p[text()='Consent']"));
        if (consent.size() > 0)
            consent.get(0).click();
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        MyFunc.Bekle(2);

        Actions aksiyonDriver = new Actions(driver);
        Action aksiyon = aksiyonDriver.moveToElement(rightClickBtn).contextClick().build();
        aksiyon.perform();

        // new Actions(driver).contextClick(rightClickBtn).build().perform();

        BekleKapat();

    }
}
