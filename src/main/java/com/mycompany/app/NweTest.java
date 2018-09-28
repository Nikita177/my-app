package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NweTest {
	 @Test
	  public void f() {
			
			System.setProperty("webdriver.chrome.driver",
					"A://software//selenium//chromedriver_win32//chromedriver.exe");
			WebDriver dir = new FirefoxDriver();

			dir.get("http://demo.automationtesting.in/FileUpload.html");
//status
	  }

}
