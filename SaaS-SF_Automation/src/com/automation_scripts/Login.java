package com.automation_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public int Login_func(){
	
	Config config_obj = new Config();
	WebDriver firefox_dri = new FirefoxDriver();

	firefox_dri.get(config_obj.Environment_URL);
	firefox_dri.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
	firefox_dri.findElement(By.linkText("Log In")).click();
	firefox_dri.findElement(By.id("username")).sendKeys(config_obj.Username);
	firefox_dri.findElement(By.id("password")).sendKeys(config_obj.Password);
	firefox_dri.findElement(By.id("id7")).click();

	return 0;
	}
			
}
