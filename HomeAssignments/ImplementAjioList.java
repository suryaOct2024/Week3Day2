package week3.day2.HomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementAjioList {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("closeBtn")).click();
		
		//In the search box, type as "bags" and press enter 
		
		WebElement srchWE = driver.findElement(By.name("searchVal"));
		srchWE.sendKeys("bags");
		srchWE.sendKeys(Keys.ENTER);
		
		//To the left of the screen under "Gender" click on "Men" 
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		// Under "Category" click "Fashion Bags" 
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		//Print the count of the items found.  
		
		Thread.sleep(3000);
		String itemsCount = driver.findElement(By.xpath("//div[contains (@aria-label,' Items Found')]")).getText();
		System.out.println(itemsCount);
		
		//Get the list of brand of the products displayed in the page and print the list. 
		
		driver.findElement(By.xpath("//span[@aria-label='brands']")).click();
		List<WebElement> brands = driver.findElements(By.name("brand"));
		List<String> brandNames = new ArrayList<String>();
		
		System.out.println("Total number of brands found:"+brands.size());
		
		for(WebElement element:brands)
		{
			String txt = element.getAttribute("id");
			brandNames.add(txt);
		}
		
		System.out.println("The brands available in search results are:");
		
		for(String brandTxt : brandNames)
			System.out.println(brandTxt);
		
	}

}
