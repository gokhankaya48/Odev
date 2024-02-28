package OdevXpath;
/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
Fake Alerts' tıklayınız.
Show Alert Box'a tıklayınız.
Ok'a tıklayınız.
Alert kapanmalıdır.
*/

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru05 extends BaseDriver {
    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement FakeAlerts = driver.findElement(By.xpath("//*[@id='fakealerttest']"));
        FakeAlerts.click();
        MyFunc.Bekle(2);

        WebElement ShowAlerts = driver.findElement(By.xpath("//*[@id='fakealert']"));
        ShowAlerts.click();
        MyFunc.Bekle(2);

        WebElement ok = driver.findElement(By.xpath("//*[@id='dialog-ok']"));
        ok.click();
        MyFunc.Bekle(2);

        WaitClose();

    }
}
