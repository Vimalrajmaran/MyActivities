package week3.day2;

public class BrowserTest {
public static void main(String[] args) {
	chrome chrome = new chrome("chrome","117.0.5938");
	chrome.openUrl("https://www.google.co.in/");
	chrome.openincognito();
	chrome.clearcache();
	chrome.navigateBack();
	chrome.closeBrowser();
	System.out.println("----------------");
	
	Edge edge = new Edge("Edge","117.0.6180");
	edge.openUrl("https://www.google.co.in/");
	edge.takeSnap();
	edge.clearCookies();
	edge.navigateBack();
	edge.closeBrowser();
}
}
