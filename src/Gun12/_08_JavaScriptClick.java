package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _08_JavaScriptClick extends BaseDriver {

    @Test
    public void test() {
        driver.get("https://www.copado.com/robotic-testing");
        MyFunc.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement readStory = driver.findElement(By.xpath("//div[text()='Read Success Story']"));
        //readStory.click();  // sayfa önünden mouse click
        js.executeScript("arguments[0].click();", readStory); // js click : sayfa içinden click


        MyFunc.Bekle(3);
        BekleKapat();
    }
}
