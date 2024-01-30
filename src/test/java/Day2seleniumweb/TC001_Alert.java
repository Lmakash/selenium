package Day2seleniumweb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://letcode.in/alert");
		 driver.findElement(By.id("accept")).click();
		 Thread.sleep(2000);
		 Alert simplealert=driver.switchTo().alert();
		 System.out.println(simplealert.getText());
		 simplealert.accept();

		 driver.findElement(By.id("confirm")).click();
		 Thread.sleep(2000);
		 Alert confrimalert=driver.switchTo().alert();
		 System.out.println(confrimalert.getText());
		 confrimalert.accept();
		 
		 driver.findElement(By.id("prompt")).click();
		 
		 Alert promptalert=driver.switchTo().alert();
		 System.out.println(promptalert.getText());
		 promptalert.sendKeys("Akash");
		 promptalert.accept();
	}

}
