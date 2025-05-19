package week1.day2;

public class EdgeBrowser {
	public void userBrowserMethods() {
	Browser browser = new Browser();
	String LaunchedBrowser = browser.launchBrowser("Edge");
	System.out.println("Launched browser from EdgeBrowser: " + LaunchedBrowser);
	browser.loadUrl();
}
}
