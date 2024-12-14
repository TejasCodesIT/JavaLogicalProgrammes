package SimleProgramme;

import java.util.Scanner;

public class IfElseClause {
	
	
	
	public static void main(String[] args) {
		
		
		
		int markedObtained , passingMarks=40;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks that are obtained :" );
		markedObtained = sc.nextInt();
		
			
		
		
		if(markedObtained>=passingMarks) System.out.println("Student passed");
		else System.out.println("Student failse try best of luck next time50");
		
		
	}

}


















