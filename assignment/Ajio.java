package week3day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@for,'Fashion Bags')]")).click();
		Thread.sleep(2000);
		String itemsFound = driver.findElement(By.className("length")).getText();
		System.out.println("total items found: "+itemsFound);
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		System.out.println("Bag Brandname list:");
		System.out.println("total brand list: "+brandList.size());
		   for(WebElement brandname:brandList) {
			       String text = brandname.getText();
			       System.out.println(text);
			   
		   }
		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		System.out.println("Bag name list:");
		System.out.println("Total bag name list:"+bagNameList.size());
		for(WebElement bagName:bagNameList) {
		       String text = bagName.getText();
		       System.out.println(text);
		   
	   }
		 

		
	}

}
