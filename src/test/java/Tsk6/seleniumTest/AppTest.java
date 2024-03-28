package Tsk6.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class AppTest 
   
{
	
	WebDriver driver;


@Test
public void test1()
{
    System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
    	driver=new ChromeDriver();
	driver.get("https://google.com");
	WebElement p=driver.findElement(By.name("q"));
	p.sendKeys("VIT");
	p.submit();
	
}
}
