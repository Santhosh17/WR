package com.wildriver.pageobjects.Admin.AdmnistrationArea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class AdministrationAreaPage extends SuperTestNG
{
	public static WebElement txtbx_Search()
	{
		WebElement Element = driver.findElement(By.xpath("//input[@placeholder='SEARCH, DEALER & P/O']"));
		return Element;
	}
	public static WebElement btn_CommitSelectedToOrder()
	{
		WebElement Element = driver.findElement(By.id("commitid"));
		return Element;
	}
}
