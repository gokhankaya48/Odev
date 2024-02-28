package OdevXpath;
/*
  1) Bu siteye gidin. -> http://demoqa.com/text-box
  2) Full Name kısmına "Automation" girin.
  3) Email kısmına "Testing@gmail.com" girin.
  4) Current Address kısmına "Testing Current Address" girin.
  5) Permanent Address kısmına "Testing Permanent Address" girin.
  6) Submit butonuna tıklayınız.
  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
*/


import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru01 extends BaseDriver {
    @Test
    public void test(){
        driver.get("http://demoqa.com/text-box");
        MyFunc.Bekle(3);
        WebElement fullName=driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Automation");


        WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        Email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(2);

        WebElement CurrentAdress = driver.findElement(By.xpath("//*[@id='currentAddress']"));
        CurrentAdress.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);


        WebElement ParmanentAdress = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        ParmanentAdress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);

        WebElement Submit = driver.findElement(By.xpath("//button[@id='submit']"));
        Submit.click();
        MyFunc.Bekle(2);

        WebElement checkName = driver.findElement(By.xpath("//*[@id='name']"));
        WebElement checkEmail = driver.findElement(By.xpath("//*[@id='email']"));

        Assert.assertTrue("Aranılan mesaj bulunamadı", checkName.getText().contains("Automation"));
        Assert.assertTrue("Aranılan mesaj bulunamadı", checkEmail.getText().contains("Testing"));

        WaitClose();
    }
}
