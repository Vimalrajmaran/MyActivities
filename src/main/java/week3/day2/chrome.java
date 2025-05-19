package week3.day2;

public class chrome extends Browser{

	public chrome(String name, String Version) {
		super(name, Version);
	}
	public void openincognito() {
		System.out.println("Chrome is in incognito mode");
	}
	public void clearcache()
	{
		System.out.println("Chrome cache cleared");
	}
}
