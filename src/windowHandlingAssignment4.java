import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlingAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com");

		driver.findElement(By.linkText("Multiple Windows")).click();

		driver.findElement(By.linkText("Click Here")).click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println("Parent Window ID:" + windows);

		Iterator<String> ID = windows.iterator();

		String Parentid = ID.next();

		String childId = ID.next();
		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

		driver.switchTo().window(Parentid);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	}

}
