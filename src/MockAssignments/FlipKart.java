package MockAssignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FlipKart {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("winter heater");
	    driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	    String Text = driver.findElement(By.xpath("//a[text()=\"Viyasha Laurels !!Made in India!!Room Heater!! Fan Heat...\"]")).getText();
	    System.out.println(Text);
	    driver.findElement(By.xpath("//a[text()=\"Viyasha Laurels !!Made in India!!Room Heater!! Fan Heat...\"]")).click();
	    Set<String> allwhs = driver.getWindowHandles();
	    System.out.println(allwhs.size());
	    String x=null;
	    for (String wh:allwhs)
	    {
	       x = driver.switchTo().window(wh).getTitle();
	       System.out.println(x);
	     }
	    
	     driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
	     String Text2 = driver.getTitle();
	    // String Text2 = driver.findElement(By.xpath("//a[@class=\"_2Kn22P gBNbID\"]")).getText();
	     System.out.println(Text2);
	     //Assert.assertEquals(x.equals(Text2),true);
	     //Reporter.log("Product Sucessfully added in the cart", true);
	     
	     if(Text2.equals(x))
	     {
	    	 System.out.println("Product Sucessfully added in the cart");
	     }
	     else
	     {
	    	 System.out.println("Product Sucessfully not added in the cart");
	     } 
	     
	     driver.quit();
	    
	}

}
