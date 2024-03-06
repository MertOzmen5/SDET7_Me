package Gun03;


import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _01_OpeningWebsite {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver(); // driver tarayıcı demek,chrome burada.

        driver.get("https://techno.study/tr"); // web sayfasını aç.

        // new FirefoxDriver();
        // new EdgeDriver();

        MyFunc.Bekle(3);
        // bekleme
        driver.quit();


    }
}
