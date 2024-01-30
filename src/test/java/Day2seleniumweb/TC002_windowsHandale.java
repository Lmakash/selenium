package Day2seleniumweb;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_windowsHandale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver =new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	
		 driver.get("https://letcode.in/windows");
		 System.out.println(driver.getWindowHandle());
		// driver.findElement(By.id("multi")).click();
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.id("multi")));
		 ele.click();
		 
		
		 List<String> l1=new ArrayList<String>(driver.getWindowHandles());
		 System.out.println("size:"+l1.size());
		 
		 
		 for(int i=0;i<l1.size();i++){
			 driver.switchTo().window(l1.get(i));
			 //System.out.println(l1.get(i));
		 }
		 driver.switchTo().window(l1.get(0));
		 System.out.println("The URL is:"+driver.getCurrentUrl());
		 driver.close();
		 driver.switchTo().window(l1.get(1));
		 System.out.println("The URL is:"+driver.getCurrentUrl());
		 driver.switchTo().window(l1.get(2));
		 System.out.println("The URL is:"+driver.getCurrentUrl());
		 driver.quit();
	}

	private static void webDriverWait() {
		// TODO Auto-generated method stub
		
	}
	

}
