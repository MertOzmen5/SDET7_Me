package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.dom.model.BackendNode;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement aramaKutusu = driver.findElement(By.id("inputValEnter"));


        // parametrenin değerini veriyor.
        System.out.println("aramaKutusu.getAttribute () = " + aramaKutusu.getAttribute("class"));


        // Elementi şekillendiren değerleri veriyor.
        System.out.println("aramaKutusu.getCssValue(color) = " + aramaKutusu.getCssValue("color"));
        System.out.println("aramaKutusu.getCssValue(background) = " + aramaKutusu.getCssValue("background"));
        System.out.println("aramaKutusu.getCssValue(font-size) = " + aramaKutusu.getCssValue("font-size"));
        System.out.println("aramaKutusu.getCssValue(border) = " + aramaKutusu.getCssValue("border"));


        BekleKapat();

    }
}
