package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElemenInStatus extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html?locale=en#!CwCheckBox");

        WebElement ptesi = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
        MyFunc.Bekle(2);

        System.out.println("ptesi.isDisplayed() = " + ptesi.isDisplayed()); // web de görünüyor mu
        System.out.println("ptesi.isEnabled() = " + ptesi.isEnabled()); // web de etkin mi
        System.out.println("ptesi.isSelected() = " + ptesi.isSelected()); // checkli mi

        ptesi.click(); // checkledik
        MyFunc.Bekle(2);
        System.out.println("ptesi.isSelected() = " + ptesi.isSelected()); // checklendi mi


        /*** cumartesi ***/
        WebElement ctesi = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        System.out.println("ctesi.isDisplayed() = " + ctesi.isDisplayed()); // web de görünüyor mu
        System.out.println("ctesi.isEnabled() = " + ctesi.isEnabled()); // web de etkin mi
        System.out.println("ctesi.isSelected() = " + ctesi.isSelected()); // checkli mi

        BekleKapat();

    }

}
