package selen1;

import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.*;

public class chromedemoTest {

  @Test
  public void VedamTest() {
	  System.out.println("running tests..............");
  }
  
  public void vedalu() {
	  int a = 1;
	  int b = 1;
	  Assert.assertEquals(a, b);
  }
}
  