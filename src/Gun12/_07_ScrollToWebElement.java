package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _07_ScrollToWebElement extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement iframe = driver.findElement(By.name("nested_scrolling_frame"));

        js.executeScript("arguments[0].scrollIntoView(true);", iframe); // elemente kadar kaydır

        BekleKapat();
    }


}