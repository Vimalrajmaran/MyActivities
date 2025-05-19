package week3.day1;

import java.util.Arrays;

public class AnagramComparision {
	public static void main (String[] args)
	{
		String text1 = "vimal";
		String text2 ="rajaa";
		int a=text1.length();
		int b=text2.length();
		if(a!=b)
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		else {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			System.out.println(charArray1);
			System.out.println(charArray2);
			
			if(Arrays.equals(charArray1,charArray2))
			{
				System.out.println("the given text is Anagram");
			}
			else
			{
				System.out.println("the given text is not an Anagram");
			}
			
		}
	}

}
