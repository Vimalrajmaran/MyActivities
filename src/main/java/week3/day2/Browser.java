package week3.day2;

public class Browser {
		String browsername;
		String browserversion;
	public Browser(String name, String Version)
	{
		this.browsername=name;
		this.browserversion=Version;
	}
	public void openUrl(String URL)
	{
		System.out.println(browsername +" opening URL" + URL);
		
	}
	public void closeBrowser()
	{
		System.out.println(browsername +" Closing Browser");
	}
	public void navigateBack() {
		System.out.println(browsername+" Navigating Back");
	}
	}
