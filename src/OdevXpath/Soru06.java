package OdevXpath;
/*
Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
        Fake Alerts'e tıklayınız.
        Show modal dialog buttonuna tıklayınız.
        Ok'a tıklayınız.
        Alert kapanmalıdır.
*/
import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru06 extends BaseDriver {
    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement FakeAlerts = driver.findElement(By.xpath("//*[@id='fakealerttest']"));
        FakeAlerts.click();
        MyFunc.Bekle(2);

        WebElement showModal = driver.findElement(By.xpath("//*[@id='modaldialog']"));
        showModal.click();
        MyFunc.Bekle(2);

        WebElement ok = driver.findElement(By.xpath("//*[@id='dialog-ok']"));
        ok.click();
        MyFunc.Bekle(2);

        WaitClose();
    }
}
