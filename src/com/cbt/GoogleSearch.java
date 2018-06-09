package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"/Users/tanergur/Documents/selenium dependencies/drivers/geckodriver");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://learn.cybertekschool.com/courses/62/pages/recording-va-selenium-introduction?module_item_id=1932");
	
}
}