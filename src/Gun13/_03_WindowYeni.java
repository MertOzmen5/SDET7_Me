package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class _03_WindowYeni extends BaseDriver {
    @Test
    public void test1() {
        driver.get("  https://www.selenium.dev/");
        MyFunc.Bekle(2);

        driver.switchTo().newWindow(WindowType.TAB); // yeni BOŞ sekme açar.
        // yeni açılan tab da https://www.facebook.com/ nasıl çağırırız ?
        // açılan yeni tab da olduğumdan sadece driver.get ile yeni sayfayı açtırabilirim.
        driver.get("https://www.facebook.com/");


        MyFunc.Bekle(2);
        BekleKapat();
    }
}
