package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_AlertPart2 extends BaseDriver {

    @Test
    public void test() {

        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunc.Bekle(2);

        WebElement element = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg'][onclick='myConfirmFunction()']"));
        element.click();

        MyFunc.Bekle(2);
        // alert açıldı

        driver.switchTo().alert().dismiss();
        // alert kutusuna git, cancel'a bas


        BekleKapat();
    }
}
