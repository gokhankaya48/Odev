package odev;
/*Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html

Fake Alerts'e tıklayınız.

Show modal dialog buttonuna tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.*/

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru6 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get(" https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement FakeAlerts=driver.findElement(By.cssSelector(" [href='alerts/fake-alert-test.html']"));
        FakeAlerts.click();
        MyFunc.Bekle(2);

        WebElement showModal=driver.findElement(By.cssSelector("[class='centered']>[onclick='show_modal()']"));
        showModal.click();
        MyFunc.Bekle(2);

        WebElement ok=driver.findElement(By.cssSelector("[class='dialog-actions']>[class='dialog-button']"));
        ok.click();
        MyFunc.Bekle(2);

        BekleKapat();






    }




}
