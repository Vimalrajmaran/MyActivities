package week3.day1;

import java.util.Iterator;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java sessions of a part week1";
		int count=0;
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if(words[i].equalsIgnoreCase(words[j]))
				{
					words[j]="";
					count++;
				}
			}
		}
		if(count>=1) {
			System.out.println("Modified text after removing duplicates:");
			for(String word : words)
			{
				if(!word.equals(""))
				{
					System.out.print(word+" ");
				}
			}
		}else {
			System.out.println("No duplicate found");
		}
	}

}
