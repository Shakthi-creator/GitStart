import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.basssl.com/");
		//	driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
	} 

}
