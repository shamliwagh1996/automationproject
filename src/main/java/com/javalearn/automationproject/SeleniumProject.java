package com.javalearn.automationproject;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumProject {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://test.clouzer.com/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("userID")).sendKeys("five.john");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("12");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"logIn\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"TASKS\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Projects\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Add_Project\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}