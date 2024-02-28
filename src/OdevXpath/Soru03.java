package OdevXpath;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
1) Bu siteye gidin. -> https://www.snapdeal.com/
2) "teddy bear" aratın ve Search butonuna tıklayın.
3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
 */
public class Soru03 extends BaseDriver {
    @Test
    public void test(){
        driver.get("https://www.snapdeal.com/");
        WebElement teddyBear = driver.findElement(By.xpath("//*[@id='inputValEnter']"));
        teddyBear.sendKeys("teddy bear");
        MyFunc.Bekle(1);

        WebElement search = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        search.click();
        MyFunc.Bekle(1);

        WebElement check = driver.findElement(By.xpath("//*[@id='searchMessageContainer']/div/span"));
        Assert.assertTrue("Aranan mesaj bulunamadı", check.getText().contains("We've got 258 results for teddy bear"));

        WaitClose();
    }
}
