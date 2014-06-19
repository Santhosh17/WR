package com.wildriver.pageobjects.Dealer.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class DealerHomePage extends SuperTestNG
{
	public static WebElement drpdn_ProductGroup()
	{
		WebElement element = driver.findElement(By.id("selectname"));
		return element;
	}
	public static WebElement txtbx_ProductName()
	{
		WebElement element = driver.findElement(By.id("ProductProductName"));
		return element;
	}
	public static WebElement txtbx_ProductCode()
	{
		WebElement element = driver.findElement(By.id("ProductStockCode"));
		return element;
	}
	public static WebElement txtbx_QTYRequired()
	{
		WebElement element = driver.findElement(By.id("SalesOrderOrderedQuantity"));
		return element;
	}
	public static WebElement txtbx_DateRequired()
	{
		WebElement element = driver.findElement(By.id("datepicker"));
		return element;
	}
	public static WebElement btn_Search()
	{
		WebElement element = driver.findElement(By.id("prd-search"));
		return element;
	}
	public static WebElement txt_ValidationMSG()
	{
		WebElement element = driver.findElement(By.id("flashMessage"));
		return element;
	}
}