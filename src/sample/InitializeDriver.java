package sample;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InitializeDriver {
	

	@Test
	public static void BrowserInitialize() {

		String basePath = new File("").getAbsolutePath();
	    System.out.println(basePath);

	    String path = new File("src/main/resources/conf.properties")
	                                                           .getAbsolutePath();
	    System.out.println(path);
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		System.out.println("Page You Visited is: " + driver.getTitle());

	}
	
	@Test
	public static void PostJira() {
		System.out.println("Post Jira 1");
	}
	
	@Test
	public static void PostJira2() {
		System.out.println("Post Jira 2");
	}
	@Test
	public static void PostJira3() {
		System.out.println("Post Jira 3");
	}

}
