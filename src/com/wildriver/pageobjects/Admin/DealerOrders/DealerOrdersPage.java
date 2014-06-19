package com.wildriver.pageobjects.Admin.DealerOrders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class DealerOrdersPage extends SuperTestNG
{
	public static WebElement btn_DispatchAndPrint()
	{
		WebElement Element = driver.findElement(By.id("disNprt-id"));
		return Element;
	}
	public static WebElement btn_PrintOnly()
	{
		WebElement Element = driver.findElement(By.id("btnPrint"));
		return Element;
	}
	public static WebElement btn_DispatchOnly()
	{
		WebElement Element = driver.findElement(By.id("dispatch-id"));
		return Element;
	}
	public static WebElement txtbx_Search()
	{
		WebElement Element = driver.findElement(By.xpath("//input[@placeholder='SEARCH']"));
		return Element;
	}
}
