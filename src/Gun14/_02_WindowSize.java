package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;


public class _02_WindowSize extends BaseDriver {

    @Test
    public void test() {
        driver.get("https://www.youtube.com/");
        MyFunc.Bekle(5);

        driver.manage().window().maximize(); // ekranı max yapar.

        Dimension ekranBoyutu = driver.manage().window().getSize();
        System.out.println("ekranBoyutu.width = " + ekranBoyutu.width);
        System.out.println("ekranBoyutu.height = " + ekranBoyutu.height);

        MyFunc.Bekle(5);
        Dimension yeniBoyut = new Dimension(516, 600);
        driver.manage().window().setSize(yeniBoyut); // tarayıcının boyutunu istenilen boyutlara getirdim,teste böyle
        // başlıyorum.

        // testler

        BekleKapat();
    }
}
