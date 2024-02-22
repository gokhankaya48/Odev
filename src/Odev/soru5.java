package Odev;
/*Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Fake Alerts' tıklayınız.

Show Alert Box'a tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.*/


import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru5 extends BaseDriver {


    @Test
    public void Test1() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement FakeAlerts = driver.findElement(By.cssSelector(" [href='alerts/fake-alert-test.html']"));
        FakeAlerts.click();
        MyFunc.Bekle(2);

        WebElement ShowAlerts = driver.findElement(By.cssSelector(" [class='centered'] [class='styled-click-button'][type='button'][value='Show fake alert box']"));
        ShowAlerts.click();
        MyFunc.Bekle(2);

        WebElement ok = driver.findElement(By.cssSelector("[class='dialog-actions']>button "));
        ok.click();
        MyFunc.Bekle(2);

        WaitClose();


    }
}
