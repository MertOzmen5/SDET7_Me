package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _05_Scrollintro extends BaseDriver {

    @Test
    public void test(){

        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor) driver;


        js.executeScript("window.scrollTo(0,500)"); // dikey yönde 500 pixel kaydır
        MyFunc.Bekle(2);

        js.executeScript("window.scrollBy(0,500)"); // bulunduğu yerde 500 scroll
        MyFunc.Bekle(2);

        js.executeScript("window.scrollBy(0,-200)"); // bulunduğu yerden 200 pixel geri



        BekleKapat();
    }
}
