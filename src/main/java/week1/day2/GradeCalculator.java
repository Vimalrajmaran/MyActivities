package week1.day2;

import java.util.Scanner;

public class GradeCalculator {
	public double CalculateAverage(int mathmark, int sciencemark, int englishmark)
	{
		int totalmark = mathmark+sciencemark+englishmark;
		double average = totalmark/3.0;
		return average;
	}
	public String determineaverage(double average){
		String grade;
		if(average>=90)
		{
			grade = "A+";
		}
		else if (average>=80) {
			grade ="B";
		}
		else if (average>=70) {
			grade ="C";
		}
		else if (average>=60) {
			grade ="D";
		}
		else if (average>=50) {
			grade ="E";
		}
		else {
			grade ="Fail";
		}
		return grade;
	}
	public static void main(String[] args) {
		GradeCalculator Calculator = new GradeCalculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Maths Mark");
		int mathInput = scanner.nextInt();
		System.out.println("Enter the Science Mark");
		int scienceInput = scanner.nextInt();
		System.out.println("Enter the English Mark");
		int englishInput = scanner.nextInt();
		if (mathInput<0||mathInput>100||scienceInput<0||scienceInput>100||englishInput<0||englishInput>100) {
			System.out.println("Invalid Input : Give me a valid input from 0 to 100");
		} else {
			double averageInput=Calculator.CalculateAverage(mathInput,scienceInput,englishInput);
			String gradeInput= Calculator.determineaverage(averageInput);
			System.out.println("Average Mark:"+averageInput);
			System.out.println("Grade :"+gradeInput);
		}
	}
}

