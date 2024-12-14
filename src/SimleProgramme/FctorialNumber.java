package SimleProgramme;

import java.util.Scanner;

public class FctorialNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num ;
	
		
		int fact=1;
		
		System.out.println("Enter a number to find factorial  : ");
		
		num =scanner.nextInt();
		
		
		for(int i = num ;i>0 ;i-- )
		{
			
			
			fact = fact*i;
			
		}
		System.out.println("Factorial of "+num+" is "+fact);
		
		
	}
	
	

}
