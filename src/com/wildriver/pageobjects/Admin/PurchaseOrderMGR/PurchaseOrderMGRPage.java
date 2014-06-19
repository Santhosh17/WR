package com.wildriver.pageobjects.Admin.PurchaseOrderMGR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class PurchaseOrderMGRPage extends SuperTestNG
{
	public static WebElement btn_ManageSuppliers()
	{
		WebElement Element = driver.findElement(By.linkText("MANAGE SUPPLIERS"));
		return Element;
	}
	public static WebElement btn_CreateAnOrder()
	{
		WebElement Element = driver.findElement(By.linkText("CREATE AN ORDER"));
		return Element;
	}
	public static WebElement txtbx_SearchSupplierAndPO()
	{
		WebElement Element = driver.findElement(By.xpath("//input[@placeholder='SEARCH, SUPPLIER & P/O']"));
		return Element;
	}
}
