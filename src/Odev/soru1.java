package odev;
/*1) Bu siteye gidin. -> http://demoqa.com/text-box

        2) Full Name kısmına "Automation" girin.

        3) Email kısmına "Testing@gmail.com" girin.

        4) Current Address kısmına "Testing Current Address" girin.

        5) Permanent Address kısmına "Testing Permanent Address" girin.

        6) Submit butonuna tıklayınız.

        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.*/


import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru1 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get(" http://demoqa.com/text-box");

        WebElement fullname=driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        fullname.sendKeys("Automation");
        MyFunc.Bekle(2);


        WebElement Email=driver.findElement(By.cssSelector("[id='userEmail']"));
        Email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(2);

        WebElement CurrentAdress=driver.findElement(By.cssSelector(" [id='currentAddress']"));
        CurrentAdress.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);


        WebElement ParmanentAdress=driver.findElement(By.cssSelector("[id='permanentAddress']"));
        ParmanentAdress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);

        WebElement Submit=driver.findElement(By.cssSelector("[id='submit']"));
        Submit.click();
        MyFunc.Bekle(2);

        WebElement checkName=driver.findElement(By.cssSelector("[id='name'][class='mb-1']"));
        WebElement checkEmail=driver.findElement(By.cssSelector("[id='email'][class='mb-1']"));

        Assert.assertTrue("Aranılan mesaj bulunamadı",checkName.getText().contains("Automation"));
        Assert.assertTrue("Aranılan mesaj bulunamadı",checkEmail.getText().contains("Testing"));






   BekleKapat();




    }

}
