package package1;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium_prog {

@Test

public boolean buildingTestMethod() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\projCert-master\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://18.191.149.84:8080/index.php");
	Thread.sleep(2000);
	driver.findElement(By.id("About Us")).click();
	Thread.sleep(2000);
	driver.get(driver.getCurrentUrl());
	String str = driver.findElement(By.xpath("//*[@id=\"PID-ab2-pg\"]")).getText();
	System.out.println(str + "\n\n\n");
	if (str.contains("This is about page. Lorem Ipsum Dipsum"))
	{
		System.out.println("Website is Successfully deployed");
		driver.quit();
		return true;
	}
	else {
		System.out.println("Website is NOT Successfully deployed");
		return false;
	}
	
}

public static void main(String[] args) throws InterruptedException {
	selenium_prog obj = new selenium_prog();
	boolean success=obj.buildingTestMethod();
	if(!success)
		System.exit(1);
	System.exit(0);	
	}
}