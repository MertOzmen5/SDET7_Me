package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.xml.xpath.XPath;
import java.util.List;

public class Soru extends BaseDriver {
    //        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.


    @Test
    public void Test1() {

        driver.get("https://www.saucedemo.com");
        WebElement bul = driver.findElement(By.xpath("//input[@id='user-name']"));
        bul.sendKeys("standard_user");
        MyFunc.Bekle(2);

        WebElement bul1 = driver.findElement(By.xpath("//input[@id='password']"));
        bul1.sendKeys("secret_sauce");
        MyFunc.Bekle(2);

        WebElement bul2 = driver.findElement(By.xpath("//input[@id='login-button']"));
        bul2.click();
        MyFunc.Bekle(2);

        WebElement bul3 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        bul3.click();
        MyFunc.Bekle(2);

        WebElement bul4 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        bul4.click();
        MyFunc.Bekle(2);

        WebElement bul5 = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        bul5.click();
        MyFunc.Bekle(2);

        WebElement bul6 = driver.findElement(By.xpath("//*[@id='item_1_title_link']/div"));
        bul6.click();
        MyFunc.Bekle(2);

        WebElement bul7 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        bul7.click();
        MyFunc.Bekle(2);

        WebElement bul8 = driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a"));
        bul8.click();
        MyFunc.Bekle(2);

        WebElement bul9 = driver.findElement(By.xpath("//button[@id='checkout']"));
        bul9.click();
        MyFunc.Bekle(2);

        WebElement bul10 = driver.findElement(By.xpath("//input[@id='first-name']"));
        bul10.sendKeys("Mert");
        MyFunc.Bekle(2);

        WebElement bul11 = driver.findElement(By.xpath("//input[@id='last-name']"));
        bul11.sendKeys("Özmen");
        MyFunc.Bekle(2);

        WebElement bul12 = driver.findElement(By.xpath("//input[@id='postal-code']"));
        bul12.sendKeys("42");
        MyFunc.Bekle(2);

        WebElement bul13 = driver.findElement(By.xpath("//input[@id='continue']"));
        bul13.click();
        MyFunc.Bekle(2);


        // Sepet toplam işlemleri yapılıyor.

        List<WebElement> bul14 = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam = 0;
        for (WebElement urun : bul14) {
            String urunFiyati = urun.getText().replaceAll("[^0-9,.]", "");
            double urunFiyat1 = Double.parseDouble(urunFiyati);
            toplam = toplam + urunFiyat1;

        }
        System.out.println("toplam = " + toplam);

        WebElement bul15 = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        String bul16 = bul15.getText().replaceAll("[^0-9,.]", "");
        double bul17 = Double.parseDouble(bul16);
        System.out.println("bul17 = " + bul17);

        Assert.assertTrue("Price is different", toplam == bul17);


        BekleKapat();

    }
}
