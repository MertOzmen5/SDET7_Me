package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.amazon.com/");

        List<WebElement> linkler = driver.findElements(By.tagName("a")); // Bütün <a tagli elementlerin hepsini al.

        for (WebElement e : linkler)
            if (!e.getText().equals(""))
            System.out.println("e.getText() = " + e.getText());



        BekleKapat();


    }
}
