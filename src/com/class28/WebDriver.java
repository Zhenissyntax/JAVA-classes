package com.class28;

public interface WebDriver {
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();

}

class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Chrome can openBrowser");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome can closeBrowser");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome can MaximizeWindow");
		// TODO Auto-generated method stub
		
	}
	
}


class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("FireFox can open browser");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("FireFox can close Browser");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("FireFox can maximize Window");
		// TODO Auto-generated method stub
		
	}
	
}