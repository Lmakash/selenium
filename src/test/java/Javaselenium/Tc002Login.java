package Javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc002Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://demo.opencart.com/");
		 driver.findElement(By.linkText("My Account")).click();
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.id("input-email")).clear();
		 driver.findElement(By.id("input-email")).sendKeys("akash11@gmail.com");
		 driver.findElement(By.id("input-password")).clear();
		 driver.findElement(By.id("input-password")).sendKeys("akash111");
		 driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
		// driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

}
