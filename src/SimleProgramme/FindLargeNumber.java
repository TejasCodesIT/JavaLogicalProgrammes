package SimleProgramme;

import java.util.Scanner;

public class FindLargeNumber {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new 	Scanner(System.in);
		
		
		System.out.println("Enter a first number : - ");
		int num1 = sc.nextInt();
		
		
		System.out.println("Enter a secound Number : - ");
		int num2= sc.nextInt();
		
		
		System.out.println("Ente a third number  : - ");
		int num3 = sc.nextInt();
		
		
		if(num1>num2) {
			
			if(num1>num3) System.out.println(+num1);
			else System.out.println(+num3);
			
		}
		else if(num2>num3) System.out.println(num2);
		else if(num3>num2)System.out.println(+num3);
		else System.out.println("Number are same  ");
		
		
		
		
		
	}
	

}
