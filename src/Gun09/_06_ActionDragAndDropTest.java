package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

public class _06_ActionDragAndDropTest extends BaseDriver {

    @Test

    public void test() {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions driverAksiyon = new Actions(driver);


        MyFunc.Bekle(2);
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box101"));

        // 1.Yöntem
        driverAksiyon.dragAndDrop(oslo, norway).build().perform();
        // Oslo'yu al , Norveç'e götür bırak.

        // 2.Yöntem
        driverAksiyon.clickAndHold(oslo).build().perform(); // Oslo'yu al eline
        driverAksiyon.moveToElement(norway).release().build().perform();

        BekleKapat();


    }
}
