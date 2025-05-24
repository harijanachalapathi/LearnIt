//package selen1;
//import static org.testng.Assert.assertEquals;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver; 
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.*;
//import org.testng.annotations.*;
//
//import io.github.bonigarcia.wdm.WebDriverManager; 
//public class chromedemo {
//
//	public static void main(String[] args) throws InterruptedException {
//		final Logger logger = LogManager.getLogger(chromedemo.class);
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//	    driver.get("https://www.amazon.in/");
//	    Thread.sleep(2000);
//		driver.quit();
//		logger.info("printing.....");
//        System.out.println("Program ran and closed and then asserted");
//        assert true;
//        }
//	
////	@Test
////	public void Vedam() {
////    int a = 1;
////    int b = 1;
////    System.out.println("testng method.............");
////    Assert.assertEquals(1, 1);
////    }
//	
//	
//
//}
