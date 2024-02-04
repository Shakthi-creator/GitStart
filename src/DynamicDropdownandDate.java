import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownandDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		//  //a[@value='MAA']  - Xpath for chennai

		//  //a[@value='BLR']

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);

			driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //- Xpath using indexex

	//	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); // xpath without using indexes. used parent to child relationship locator

	//	driver.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[4]/a")).click();
		
		
		
	}
}
