import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_64 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Shakthi");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Shakthi@gmail.com");

		WebElement password = driver.findElement(By.id("exampleInputPassword1"));
		password.sendKeys("password");

		WebElement checkbox = driver.findElement(By.id("exampleCheck1"));
		checkbox.click();

		JavascriptExecutor pagedown = (JavascriptExecutor) driver;
		pagedown.executeScript("window.scrollBy(0,1000)");

		WebElement w = driver.findElement(By.id("exampleFormControlSelect1"));
		Select s = new Select(w);
		List<WebElement> o = s.getOptions();
		for (WebElement x : o) {
			System.out.println(x.getAttribute("Male"));

			Thread.sleep(3000);

			WebElement status = driver.findElement(By.id("inlineRadio2"));
			status.click();

			WebElement dob = driver.findElement(By.name("bday"));
			dob.sendKeys("23/12/2000");

			WebElement submit = driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/input"));
			submit.click();
			
			JavascriptExecutor pageup = (JavascriptExecutor) driver;
			pageup.executeScript("window.scrollBy(0,-1000)");
			
			String getMessage = driver.findElement(By.cssSelector("div.alert:nth-child(1)")).getText();
			System.out.println(getMessage);
			
			
		}

	}

}
