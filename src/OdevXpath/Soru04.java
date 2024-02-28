package OdevXpath;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
Calculate'e tıklayınız.
İlk input'a herhangi bir sayı giriniz.
İkinci input'a herhangi bir sayı giriniz.
Calculate button'una tıklayınız.
Sonucu alınız.
Sonucu yazdırınız.
 */
public class Soru04 extends BaseDriver {
    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate = driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[1]/a/img"));
        calculate.click();
        MyFunc.Bekle(2);

        WebElement number1 = driver.findElement(By.xpath("//*[@id='number1']"));
        number1.sendKeys("5");
        MyFunc.Bekle(2);

        WebElement number2 = driver.findElement(By.xpath("//*[@id='number2']"));
        number2.sendKeys("12");
        MyFunc.Bekle(2);

        WebElement cBtn = driver.findElement(By.xpath("//*[@id='calculate']"));
        cBtn.click();
        MyFunc.Bekle(2);

        WebElement sonuc = driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println("sonuc.getText() = " + sonuc.getText());
        WaitClose();

    }
}
