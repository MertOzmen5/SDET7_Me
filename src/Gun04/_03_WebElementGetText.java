package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_WebElementGetText {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        // sublabel_8_first
        // sublabel_8_last

        WebElement labelFirstName = driver.findElement(By.id("sublabel_8_first"));

        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());
        // getText () -> WebElementin ekranda gözüken yazısını verir.

        WebElement labelLastName=driver.findElement(By.id("sublabel_8_last"));

        System.out.println("labelLastName.getText () = " + labelLastName.getText());

        MyFunc.Bekle(6);

        driver.quit();
    }
}
