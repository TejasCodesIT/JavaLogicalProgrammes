package SimleProgramme;

import java.util.Scanner;

public class CompareString {
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Please enter first number :- ");
		String str1 = sc.next();
		
		
		System.out.println("Please Enter ssecound number : -");
		String str2 = sc.next();
		
		
		
		if(str1.compareTo(str2)>0) {
			
			System.out.println("First String is greater than secound string");
			
		} 
		else if (str1.compareTo(str2)<0)  System.out.println("First String is smaller than secound");
		
		else System.out.println("Both string are same");
		
		
		
		
	}
	
	

}
