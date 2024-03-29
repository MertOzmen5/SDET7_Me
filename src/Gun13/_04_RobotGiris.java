package Gun13;
/*
Interview Sorusu

Windows pencerelerini
 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _04_RobotGiris extends BaseDriver {

    @Test
    public void test() throws AWTException {

        driver.get(" https://www.selenium.dev/");
        MyFunc.Bekle(2);

        //Klavyeden ctrl+t basarak yeni bir sekme açıp,başka sayfa çağıralım.
        //Bunu bu sefer ROBOT class la yapalım.

        Robot robot = new Robot();

        // Yeni pencere açalım
        robot.keyPress(KeyEvent.VK_CONTROL); // ctrl bas,şu an artık basılı durumda
        robot.keyPress(KeyEvent.VK_T); // ctrl basılı idi ,T harfine bastım
        robot.keyRelease(KeyEvent.VK_T); // T tuşunu bırak
        robot.keyRelease(KeyEvent.VK_CONTROL); // Ctrl tuşunu bırak
        MyFunc.Bekle(2);

        // Şimdi 2.sayfanın id sini bulup ona geçip yeni sayfayı çağıralım
        Set<String> idler = driver.getWindowHandles();
        Iterator gosterge = idler.iterator(); // id lerin baş tarafına konumlan
        String birinciSekmeId = gosterge.next().toString(); // ilk pencerenin id sini aldım
        String ikinciSekmeId = gosterge.next().toString(); // ikinci pencerenin id sini aldım

        driver.switchTo().window(ikinciSekmeId);
        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(2);
        BekleKapat();


    }
}
