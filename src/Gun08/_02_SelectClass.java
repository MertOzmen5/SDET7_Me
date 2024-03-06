package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://www.amazon.com/");
        MyFunc.Bekle(2);

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        // Eğer ki bir html elementi select ile başlıyorsa daha kolay yol için,onu selenium SELECT classına çevirip
        // kullanabilirim.

        Select ddMenu = new Select(webMenu);
        //ddMenu.selectByIndex(4); // istersen indexle seç
        //ddMenu.selectByValue("search-alias=stripbooks-intl-ship"); // istersen value ile seç
        ddMenu.selectByVisibleText("Electronics");

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());

        for (WebElement e : ddMenu.getOptions()) {
            System.out.println("e.getText() = " + e.getText());
            System.out.println("e.getAttribute(value) = " + e.getAttribute("value"));

        }

        BekleKapat();
    }
}
