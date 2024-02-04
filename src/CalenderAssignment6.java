import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderAssignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebElement clickbox = driver.findElement(By.id("checkBoxOption2"));
		clickbox.click();
		clickbox.getText();
		System.out.println(clickbox);

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select drop = new Select(dropdown);
		drop.selectByIndex(2);
		
		System.out.println(drop);


		driver.findElement(By.name("enter-name")).sendKeys("Option2");
		driver.findElement(By.id("alertbtn")).click();

		String aa = driver.switchTo().alert().getText();
		
		
		if(aa.contains("Option2"))

		{

			System.out.println("Alert message success");

		}

		else

			System.out.println("Something wrong with execution");

	

		
	
		//aa.accept();

		driver.close();

	}
	

}
