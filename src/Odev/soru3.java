package odev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*1) Bu siteye gidin. -> https://www.snapdeal.com/

2) "teddy bear" aratın ve Search butonuna tıklayın.

3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.*/

public class soru3 extends BaseDriver {

    @Test
    public void Test1(){

      driver.get("https://www.snapdeal.com/");
        WebElement teddyBear= driver.findElement(By.cssSelector("[class='col-xs-14 search-box-wrapper'] input"));
        teddyBear.sendKeys("teddy bear");
        MyFunc.Bekle(1);

        WebElement search= driver.findElement(By.cssSelector("[class='searchformButton col-xs-4 rippleGrey']>span"));
        search.click();
        MyFunc.Bekle(1);

        WebElement check= driver.findElement(By.cssSelector(" [id='searchMessageContainer'] span"));
        Assert.assertTrue("Aranan mesaj bulunamadı",check.getText().contains("We've got 308 results for teddy bear"));

      BekleKapat();




    }




}
