package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {

    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(3);
        // navigate().to -> get ile aynı , history için kullanılır.

        WebElement element = driver.findElement(By.id("alerttest"));
        element.click();
        MyFunc.Bekle(3);

        System.out.println("driver.getTitle() =" + driver.getTitle()); // geçerli title
        System.out.println("driver.getCurrentUrl() =" + driver.getCurrentUrl()); // geçerli URL.

        driver.navigate().back(); // bir önceki sayfaya dön.
        MyFunc.Bekle(3);
        System.out.println("driver.getTitle() =" + driver.getTitle()); // geçerli title
        System.out.println("driver.getCurrentUrl() =" + driver.getCurrentUrl()); // geçerli URL.

        driver.navigate().forward();
        MyFunc.Bekle(3);
        System.out.println("driver.getTitle() =" + driver.getTitle()); // geçerli title
        System.out.println("driver.getCurrentUrl() =" + driver.getCurrentUrl()); // geçerli URL.


        BekleKapat();
    }
}
