package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _03_Soru extends BaseDriver {
    //        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Email i tekrar girmenizi isteyen bir input daha açıldığını
//           öncesinde de görünmediğini, sonrasında da göründüğünü
//           assert ile doğrulayınız.
//        5- Doğum tarihinizi Select sınıfı ile seçiniz


    @Test
    public void test1() {

        driver.get("https://www.facebook.com/");
        MyFunc.Bekle(2);

        List<WebElement>cookiesAccept=driver.findElements(By.cssSelector("[data-testid='cookie-policy-manage-dialog-accept-button']"));
        // elemanı bulursa 1 elemanlı list döndürür.Yani cookies kabul et 1 kere gelir,tek eleman o yüzden.
        // bulamazsa size 0 olan bir list döndürür.Yani cookies kabul et hiç çıkmazsa
        // burada findElementS kullanmamızın sebebi bulamazsa hata vermiyor işleme devam ediyor.
        // findElement list olmadığı için bulamazsa hata veriyor.

        if (cookiesAccept.size()>0) // eğer elemanı bulabilmişse yani list boş değilse
            cookiesAccept.get(0).click(); // 0.eleman oluyor
        MyFunc.Bekle(2);

        WebElement create= driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']"));
        // By.linkText("Create new account") a tagli olduğu için linkText de kullanılabilir.
        // [id^='u_0_0'] id si bununla başlıyorsa.Burada id ler değişken olduğu için tüm id yi kullanmadık
        // sadece başlangıç kısmı yukarıdaki kadar aynı olduğu için bununla başlıyorsa kullanılabilir.
        create.click();
        MyFunc.Bekle(2);

        WebElement name= driver.findElement(By.name("firstname")); // idler değişken o yüzden kullanmadık.
        name.sendKeys("Mert");
        MyFunc.Bekle(2);

        WebElement surName= driver.findElement(By.name("lastname"));
        surName.sendKeys("Özmen");
        MyFunc.Bekle(2);

        WebElement reEmail= driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse("ReEmail Gözüktü", reEmail.isDisplayed()); // gözükmemesini bekliyorum
        // assertFalse bu anlamı katıyor,gözükmezse devam gözükürse mesajı ver.
        System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());
        MyFunc.Bekle(2);

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("mert@hotmail.com");
        MyFunc.Bekle(2);
        
        Assert.assertTrue("ReEmail Gözükmedi",reEmail.isDisplayed()); // gözükmesini bekliyorum
        // assertTrue bu anlamı katıyor,gözükmezse bu mesajı verecek.
        System.out.println("ReEmail.isDisplayed() = " + reEmail.isDisplayed());
        MyFunc.Bekle(2);

        

        WebElement gTarihi= driver.findElement(By.id("day"));
        Select gun=new Select(gTarihi);
        gun.selectByIndex(20);
        MyFunc.Bekle(2);

        WebElement aTarihi= driver.findElement(By.id("month"));
        Select ay=new Select(aTarihi);
        ay.selectByIndex(9);
        MyFunc.Bekle(2);

        WebElement yil= driver.findElement(By.id("year"));
        Select yil1=new Select(yil);
        yil1.selectByValue("1993");
        MyFunc.Bekle(2);




        BekleKapat();


    }
}
