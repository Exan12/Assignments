package MockAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class RedmiPhone4GB {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("Redmi mobile 4GB Ram");
	    driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	    String alloptions = driver.findElement(By.xpath("//div[@class=\"_1YokD2 _3Mn1Gg\"]")).getText();
	    System.out.println(alloptions);
	    driver.close();
	    
	} 
}
