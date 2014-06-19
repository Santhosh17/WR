package com.wildriver.pageobjects.Admin.StockMGR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class StockMGRPage extends SuperTestNG
{
	public static WebElement txtbx_Search()
	{
		WebElement element = driver.findElement(By.id("//input[@placeholder='SEARCH']"));
		return element;
	}
	public static WebElement txtbx_StockReservedFor()
	{
		WebElement element = driver.findElement(By.xpath("//div[span[contains(text(),'STK RESERVED FOR')]]/div[2]/form/input[1]"));
		return element;
	}
	public static WebElement btn_AddANewProduct()
	{
		WebElement element = driver.findElement(By.linkText("ADD A NEW PRODUCT"));
		return element;
	}
	public static WebElement lnk_ProductName(String ProductCredential)
	{
		WebElement element = driver.findElement(By.xpath("//tr/td[text()='"+ProductCredential+"']"));
		return element;
	}
	public static WebElement txt_ValidationMsg()
	{
		WebElement element = driver.findElement(By.id("flashMessage"));
		return element;
	}
}