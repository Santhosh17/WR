package com.wildriver.pageobjects.Admin.PurchaseOrderMGR.SupplierMGR.SupplierDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class SupplierDetailsPage extends SuperTestNG
{
	public static WebElement txtbx_SupplierCode()
	{
		WebElement Element = driver.findElement(By.id("SupplierCode"));
		return Element;
	}
	public static WebElement txtbx_SupplierName()
	{
		WebElement Element = driver.findElement(By.id("SupplierName"));
		return Element;
	}
	public static WebElement txtbx_SupplierAddress()
	{
		WebElement Element = driver.findElement(By.id("SupplierAddress"));
		return Element;
	}
	public static WebElement txtbx_SupplierEmailAddress()
	{
		WebElement Element = driver.findElement(By.id("SupplierEmail"));
		return Element;
	}
	public static WebElement txtbx_SupplierPhoneNumber()
	{
		WebElement Element = driver.findElement(By.id("SupplierPhone"));
		return Element;
	}
	public static WebElement txtbx_YourSupplierNotes()
	{
		WebElement Element = driver.findElement(By.id("SupplierNotes"));
		return Element;
	}
	public static WebElement btn_AddSupplier()
	{
		WebElement Element = driver.findElement(By.id("addsupp-btn"));
		return Element;
	}
	public static WebElement btn_UpdateSupplier()
	{
		WebElement Element = driver.findElement(By.id("edit-supp-btn"));
		return Element;
	}
}