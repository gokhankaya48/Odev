package odev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*1) Bu siteye gidin. -> https://demo.applitools.com/

  2) Username kısmına "ttechno@gmail.com" girin.

3) Password kısmına "techno123." girin.

4) "Sign in" buttonunan tıklayınız.

  5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.*/


public class soru2 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demo.applitools.com/");

        WebElement username= driver.findElement(By.cssSelector("[class='form-control'][placeholder='Enter your username']"));
        username.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(1);

        WebElement password= driver.findElement(By.cssSelector("[class='form-control'][placeholder='Enter your password']"));
        password.sendKeys("techno123.");
        MyFunc.Bekle(1);


        WebElement singIn= driver.findElement(By.cssSelector("[action]>:nth-child(3)>a"));
        singIn.click();
        MyFunc.Bekle(1);

        WebElement control= driver.findElement(By.cssSelector("[class='element-actions']  +h6"));
        Assert.assertTrue("Aranan mesaj bulunamadı",control.getText().contains("Your nearest branch closes in: 30m 5s"));


BekleKapat();

    }

}
