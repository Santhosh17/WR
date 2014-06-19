package com.wildriver.pageobjects.Admin.StockMGR.ProductEditor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.wildriver.libraries.SuperTestNG;

public class ProductEditorPage	extends SuperTestNG
{
	public static WebElement txtbx_Category()
	{
		WebElement element = driver.findElement(By.id("category"));
		return element;
	}
	public static WebElement txtbx_ProductGroup()
	{
		WebElement element = driver.findElement(By.id("ProductProductGroup"));
		return element;
	}
	public static WebElement txtbx_StockCode()
	{
		WebElement element = driver.findElement(By.id("ProductStockCode"));
		return element;
	}
	public static WebElement txtbx_ProductName()
	{
		WebElement element = driver.findElement(By.id("ProductProductName"));
		return element;
	}
	public static WebElement txtbx_ProductColor()
	{
		WebElement element = driver.findElement(By.id("ProductColor"));
		return element;
	}
	public static WebElement txtbx_Grade()
	{
		WebElement element = driver.findElement(By.id("ProductGrade"));
		return element;
	}
	public static WebElement txtbx_Fill()
	{
		WebElement element = driver.findElement(By.id("ProductFill"));
		return element;
	}
	public static WebElement txtbx_PackWeight()
	{
		WebElement element = driver.findElement(By.id("ProductPackWeight"));
		return element;
	}
	public static WebElement txtbx_MinimumStockLevel()
	{
		WebElement element = driver.findElement(By.id("ProductMinStockLevel"));
		return element;
	}
	public static WebElement txtbx_QuantityPerPallet()
	{
		WebElement element = driver.findElement(By.id("ProductPalletQty"));
		return element;
	}
	public static WebElement txtbx_UnitOfMeasure()
	{
		WebElement element = driver.findElement(By.id("ProductUnitOfMeasure"));
		return element;
	}
	public static WebElement txtbx_OrderWindow()
	{
		WebElement element = driver.findElement(By.id("ProductOrderWindow"));
		return element;
	}
	public static WebElement txtbx_StockAdjustmentNewStockLevel()
	{
		WebElement element = driver.findElement(By.id("ProductOnHandQuantity"));
		return element;
	}
	public static WebElement txtbx_AdjustmentReason()
	{
		WebElement element = driver.findElement(By.xpath("//tr[td[contains(text(),'ADJUSTMENT REASON')]]/td/input"));
		return element;
	}
	public static WebElement txtbx_SupplierName()
	{
		WebElement element = driver.findElement(By.id("SupplierName"));
		return element;
	}
	public static WebElement txtbx_SupplierCode()
	{
		WebElement element = driver.findElement(By.id("SupplierCode"));
		return element;
	}
	public static WebElement txtbx_SupplierAddress()
	{
		WebElement element = driver.findElement(By.id("SupplierAddress"));
		return element;
	}
	public static WebElement txtbx_SupplierEmail()
	{
		WebElement element = driver.findElement(By.id("SupplierEmail"));
		return element;
	}
	public static WebElement txtbx_SupplierPhoneNumber()
	{
		WebElement element = driver.findElement(By.id("SupplierPhone"));
		return element;
	}
	public static WebElement txtbx_SupplierNotes()
	{
		WebElement element = driver.findElement(By.id("SupplierNotes"));
		return element;
	}
	public static WebElement btn_AddProduct()
	{
		WebElement element = driver.findElement(By.id("add-prd"));
		return element;
	}
}