package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] word = test.split(" ");
		for (int i = 0; i < word.length; i++) {
			if(i%2!=0)
			{
				String reversed ="";
				for (int j = word[i].length()-1; j >=0; j--) {
					reversed += word[i].charAt(j);
					}
				word[i] = reversed;
			}
			System.out.print(word[i]+" ");
		}
		
		/*for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
			if(i<word.length-1)
			{
				System.out.println(" ");
			}
		}*/
		}

}
