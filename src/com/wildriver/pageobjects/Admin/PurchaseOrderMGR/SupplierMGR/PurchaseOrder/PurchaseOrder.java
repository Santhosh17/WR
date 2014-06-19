package com.wildriver.pageobjects.Admin.PurchaseOrderMGR.SupplierMGR.PurchaseOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class PurchaseOrder extends SuperTestNG
{
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
	public static WebElement txtbx_POReceiversName()
	{
		WebElement Element = driver.findElement(By.id("tags"));
		return Element;
	}
	public static WebElement txtbx_POReceiversAddress()
	{
		WebElement Element = driver.findElement(By.id("PurchaseOrderReceiverAddress"));
		return Element;
	}
	public static WebElement txtbx_STKCodeRow1()
	{
		WebElement Element = driver.findElement(By.id("ProductStockCode"));
		return Element;
	}
	public static WebElement txtbx_ProductNameRow1()
	{
		WebElement Element = driver.findElement(By.id("ProductProductName"));
		return Element;
	}
	public static WebElement txtbx_ProductGradeRow1()
	{
		WebElement Element = driver.findElement(By.id("ProductGrade"));
		return Element;
	}
	public static WebElement txtbx_ProductFillRow1()
	{
		WebElement Element = driver.findElement(By.id("ProductFill"));
		return Element;
	}
	public static WebElement txtbx_ProductOrderQtyRow1()
	{
		WebElement Element = driver.findElement(By.id("PurchaseOrderOrderQuantity"));
		return Element;
	}
	public static WebElement txtbx_ProductPalletQtyRow1()
	{
		WebElement Element = driver.findElement(By.id("ProductPalletQty"));
		return Element;
	}
	public static WebElement txtbx_ProductDueDateRow1()
	{
		WebElement Element = driver.findElement(By.id("PurchaseOrderDueDate"));
		return Element;
	}
	public static WebElement txtbx_ProductUnitPriceRow1()
	{
		WebElement Element = driver.findElement(By.id("PurchaseOrderUnitPrice"));
		return Element;
	}
	public static WebElement txtbx_STKCodeRow2()
	{
		WebElement Element = driver.findElement(By.id("ProductStockCode3"));
		return Element;
	}
	public static WebElement txtbx_ProductNameRow2()
	{
		WebElement Element = driver.findElement(By.id("ProductName3"));
		return Element;
	}
	public static WebElement txtbx_ProductGradeRow2()
	{
		WebElement Element = driver.findElement(By.id("ProductGrade3"));
		return Element;
	}
	public static WebElement txtbx_ProductFillRow2()
	{
		WebElement Element = driver.findElement(By.id("ProductFill3"));
		return Element;
	}
	public static WebElement txtbx_ProductOrderQtyRow2()
	{
		WebElement Element = driver.findElement(By.id("PurchaseOrderDetailsOrderQuantity3"));
		return Element;
	}
	public static WebElement txtbx_ProductPalletQtyRow2()
	{
		WebElement Element = driver.findElement(By.id("ProductPalletQty3"));
		return Element;
	}
	public static WebElement txtbx_ProductDueDateRow2()
	{
		WebElement Element = driver.findElement(By.id("PurchaseOrderDueDate"));
		return Element;
	}
	public static WebElement txtbx_ProductUnitPriceRow2()
	{
		WebElement Element = driver.findElement(By.id("PurchaseOrderDetailsUnitPrice3"));
		return Element;
	}
}
