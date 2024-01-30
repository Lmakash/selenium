package Day2seleniumweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC005_webTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://letcode.in/table");
		WebElement table=driver.findElement(By.id("simpletable"));
		List<WebElement> headers=table.findElements(By.tagName("th"));
		
		for(WebElement header:headers) {
			System.out.println(header.getText());
		}
		
		List<WebElement> allrows=table.findElements(By.tagName("th"));
		System.out.println("row:"+allrows.size());
		
//		for(WebElement row:allrows) {
//			List<WebElement> columns=row.findElements(By.tagName("td"));
//			System.out.println(columns.get(0).getText());
//			System.out.println();
//		}
    	int size=allrows.size();
		for(int i=0;i<allrows.size();i++)
		{
			List<WebElement> rows=allrows.get(i).findElements(By.tagName("td"));
			String text=rows.get(i).getText();
					System.out.println(text);
			//System.out.println(allrows.get(i).findElement(By.tagName("td")).getText());
		}
	}

}
