package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_AlertPart1 extends BaseDriver {

    @Test

    public void test(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunc.Bekle(2);

        WebElement clickMe1= driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        clickMe1.click();
        MyFunc.Bekle(2);
        // alert açıldı

        driver.switchTo().alert().accept();
        // alert kutusuna git,okey e bas ve kabul et ,kapanıyor.




        BekleKapat();
    }
}
