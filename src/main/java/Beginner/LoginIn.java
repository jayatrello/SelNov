package Beginner;

import java.util.concurrent.TimeUnit;

import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.*;

public class LoginIn {
	
	@Test
	public void Flipkart() throws InterruptedException {

	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='✕']").click();
		Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();	
		WebElement electronics = driver.findElementByXPath("//span[contains(text(),'Electronics')]");
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();
		driver.findElementByLinkText("Realme").click();
		driver.findElementByXPath("//div[text()='Newest First']").click();
		List<WebElement> allMobiles = driver.findElementsByClassName("_3wU53n");
		for (WebElement eachMobile : allMobiles) {
			System.out.println(eachMobile.getText());
		}
		List<WebElement> allprices = driver.findElementsByClassName("_1uv9Cb");
		for (WebElement eachprice : allprices) {
			System.out.println(eachprice.getText());
		}
		driver.findElementByXPath("(//div[@class='_3wU53n'])[1]").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> lst = new ArrayList<> ();
		lst.addAll(allWindows);
		driver.switchTo().window(lst.get(1));
		
		System.out.println("The title is:"+driver.getTitle());
		// Verify the title of the new window
				if(driver.getTitle().contains("mobileModelName")) {
					System.out.println("Title Matches");
				}else {
					System.out.println(driver.getTitle());
					System.out.println("Title does not match");
				}
				
				// Get the ratings and reviews
				String ratings = driver.findElementByXPath("//span[contains(text(),'Ratings')]").getText();
				System.out.println(ratings);
				String reviews = driver.findElementByXPath("//span[contains(text(),'Reviews')]").getText();
				System.out.println(reviews);
				
				// Close the browser
				driver.quit();

}
}
