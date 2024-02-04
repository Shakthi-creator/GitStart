import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		
	
		int j = 0;

		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for(int i = 0; i<products.size();i++) {
			// brocolli - 1kg we gonna split
			// cucumber -1 kg we gonna split

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// format it get actual vegetable name
			// check whether name extracted is present or not
			// convert array into array list for easy search

			List<String> itemsNeededLists = Arrays.asList(itemsNeeded);

			if (itemsNeededLists.contains("formattedName")) {
				j++;

			//	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); 
				
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click(); 
				
				//  //button[text()='ADD TO CART']
				if(j==3) {
					break;
				}
			}

		}

	}

}
