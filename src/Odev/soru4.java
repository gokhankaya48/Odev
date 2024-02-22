package odev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Calculate'e tıklayınız.

    İlk input'a herhangi bir sayı giriniz.

    İkinci input'a herhangi bir sayı giriniz.

Calculate button'una tıklayınız.

Sonucu alınız.

Sonucu yazdırınız.
*/

public class soru4 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate= driver.findElement(By.cssSelector("[class='thumb'] >a>[src='/images/microapps/simple-calculator-300x300.png']"));
        calculate.click();
        MyFunc.Bekle(2);

        WebElement number1= driver.findElement(By.cssSelector("[method='post']>[class='form-label'] >input[name='number1']"));
        number1.sendKeys("5");
        MyFunc.Bekle(2);

        WebElement number2= driver.findElement(By.cssSelector("[method='post']>[class='form-label'] >input[name='number2']"));
        number2.sendKeys("12");
        MyFunc.Bekle(2);

        WebElement cBtn= driver.findElement(By.cssSelector("[type='submit'][value='Calculate']"));
        cBtn.click();
        MyFunc.Bekle(2);

        WebElement sonuc= driver.findElement(By.cssSelector("[class='centered'] :nth-child(2)>p>span"));
        System.out.println("sonuc.getText() = " + sonuc.getText());





BekleKapat();


    }


}
