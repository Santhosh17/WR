package com.wildriver.pageobjects.Admin.PurchaseOrderMGR.SupplierMGR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class SupplierMGRPage extends SuperTestNG
{
	public static WebElement btn_AddASupplier()
	{
		WebElement Element = driver.findElement(By.linkText("ADD A SUPPLIER"));
		return Element;
	}
	public static WebElement btn_ViewArchived()
	{
		WebElement Element = driver.findElement(By.linkText("VIEW ARCHIVED"));
		return Element;
	}
	public static WebElement txtbx_Search()
	{
		WebElement Element = driver.findElement(By.linkText("//input[@placeholder='SEARCH']"));
		return Element;
	}
	public static WebElement txt_ValidationMSG()
	{
		WebElement Element = driver.findElement(By.id("flashMessage"));
		return Element;
	}
	public static WebElement lnk_SupplierName(String SupplierName)
	{
		WebElement Element = driver.findElement(By.xpath("//tr/td[text()='"+SupplierName+"']"));
		return Element;
	}
}