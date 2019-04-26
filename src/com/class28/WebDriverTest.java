
package com.class28;
public class WebDriverTest{
	public static void main(String[] args) {
		WebDriver obj=new ChromeDriver();
		obj.closeBrowser();
		obj.maximizeWindow();
		obj.openBrowser();
		System.out.println();
		WebDriver obj2= new FirefoxDriver();
		obj2.closeBrowser();
		obj2.openBrowser();
		obj2.maximizeWindow();
	}
}