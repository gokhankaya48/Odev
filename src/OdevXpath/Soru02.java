package OdevXpath;
/*
        1) Bu siteye gidin. -> https://demo.applitools.com/
        2) Username kısmına "ttechno@gmail.com" girin.
        3) Password kısmına "techno123." girin.
        4) "Sign in" buttonunan tıklayınız.
        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
 */


import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru02 extends BaseDriver {
    @Test
    public void test(){
        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
        username.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("techno123.");
        MyFunc.Bekle(1);


        WebElement singIn = driver.findElement(By.xpath("//*[@id='log-in']"));
        singIn.click();
        MyFunc.Bekle(1);

        WebElement control = driver.findElement(By.xpath("//*[@id='time']"));
        Assert.assertTrue("Aranan mesaj bulunamadı", control.getText().contains("Your nearest branch closes in: 30m 5s"));

        WaitClose();

    }
}
