package week3.day1;

import java.io.CharArrayReader;

public class OddIndexToUpperCase {
	public static void main(String[] args) 
	{
		String input = "changeme";
		char[] array = input.toCharArray();
		for (int i =array.length-1 ; i >= 0; i--) {
			if(i%2!=0)
			{
				array[i]= Character.toUpperCase(array[i]);
			}
		}
		for(char c:array) {
			System.err.print(c);
		}
	}
	
}
