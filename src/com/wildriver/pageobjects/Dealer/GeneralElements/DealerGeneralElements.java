package com.wildriver.pageobjects.Dealer.GeneralElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class DealerGeneralElements extends SuperTestNG
{
	public static WebElement btn_Home()
	{
		WebElement element = driver.findElement(By.linkText("HOME"));
		return element;
	}
	public static WebElement btn_MyOrders()
	{
		WebElement element = driver.findElement(By.linkText("MY ORDERS"));
		return element;
	}
	public static WebElement btn_OrderHistory()
	{
		WebElement element = driver.findElement(By.linkText("ORDER HISTORY"));
		return element;
	}
	public static WebElement btn_MyDetails()
	{
		WebElement element = driver.findElement(By.linkText("MY DETAILS"));
		return element;
	}
	public static WebElement btn_Logout()
	{
		WebElement element = driver.findElement(By.linkText("LOGOUT"));
		return element;
	}
}
