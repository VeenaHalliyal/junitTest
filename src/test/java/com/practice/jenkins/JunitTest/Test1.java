package com.practice.jenkins.JunitTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Test1 {
	@Test
	public void firstTest(){
		for(int i=0;i<9;i++)
		System.out.println("junit test");
	}

	@Test
	public void launch(){
		String key="webdriver.chrome.driver";
		String value="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		 WebDriver driver=new ChromeDriver();
			 WebDriverWait wait=new WebDriverWait(driver,5000);
		driver.get("https://www.google.co.in/");
		
	}
}
