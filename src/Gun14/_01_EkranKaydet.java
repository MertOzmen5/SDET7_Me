package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_EkranKaydet extends BaseDriver {
    @Test

    public void test() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Bekle(2);

        // kendinize kod yazıyorsanız.
        driver.findElement(By.name("username")).sendKeys("ismet");
        driver.findElement(By.name("password")).sendKeys("1234");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        List<WebElement> errorMsg = driver.findElements(By.xpath("//*[text()='Invalid credentials']"));
        if (errorMsg.size() > 0) { // hata olmuş demektir, ekran kaydı alalım
            System.out.println("Hata oldu");

            //ekranı kaydet
            TakesScreenshot ts = (TakesScreenshot) driver;  // aynı js gibi
            File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE); // ekran kaydı aldı dosya
            // formatında ama hafıda duruyor.


            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuler\\screenshot.jpg"));
            //Şu anda hazıfzadaki görüntüyü dosya olarak kaydetti.
        }


        BekleKapat();

    }
}
