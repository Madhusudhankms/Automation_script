package streams;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterInSearchBox {

	public static void main(String... arg) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("idiot");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys(Keys.ENTER);
		//drive`r.findElement(By.xpath("//input[contains(@span,'idiot')]")).sendKeys("idiot" + Keys.ENTER);
		

		

		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']/center/input[1]")).click();
		

//		String cssValue = driver.findElement(By.className("product-action")).getCssValue("color");
//		System.out.println(cssValue);
//		driver.quit();
//		driver.manage().window().maximize();
//		Thread.sleep(8000);
//		driver.findElement(By.xpath("//*[@id='i0116']")).click();
//		driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("adtestid4247@ds.dev.accenture.com");
//		driver.findElement(By.id("idSIButton9")).click();
//		Thread.sleep(8000);
//		driver.findElement(By.xpath("//*[@id='passwordInput']")).sendKeys("b4LM!SC3@uJcR7%(\r\n" + "\r\n" + "");
//		driver.findElement(By.id("idSIButton9")).click();
//		Thread.sleep(8000);
//		// driver.findElement(By.xpath("//*[@id='main']/div[5]/div/div/div[2]/div[2]/div[2]/div/button")).click();
//		driver.findElement(By.xpath("//*[@id='operational-dashboard']/div/div[2]/div/div[2]/div/div[3]/div/button"))
//				.click();
//		Thread.sleep(8000);
//		Actions action = new Actions(driver);
//		WebElement we = driver.findElement(By.cssSelector("path[class='apexcharts-bar-area']"));
//		action.moveToElement(we).click().build().perform();
//
//		String s = driver.findElement(By.xpath("//span[@class='apexcharts-tooltip-text-value']")).getText();
//
//		System.out.println("volume efficiency: " + s);
//		String aht = driver.findElement(By.xpath("//*[@id='apexchartsmixxchart']/div[2]/div[3]/div/div[1]/span[2]"))
//				.getText();
//		System.out.println("AHT efficiency:" + aht);
//
//		String ef = driver.findElement(By.xpath("//*[@id='apexchartsmixxchart']/div[2]/div[4]/div/div[1]/span[2]"))
//				.getText();
//		System.out.println("effective productive:" + ef);

	}

}
