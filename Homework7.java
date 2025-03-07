package sample;

import java.util.Scanner;

public class Main {
	
	public static final String ANSI_GREEN = "\u001B[32m";
	 public static final String ANSI_RED = "\u001B[31m";
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int a;
	        int b;
	        int c;
	        
	        System.out.println("Input site a:");
	        a = scanner.nextInt();
	        
	        System.out.println("Input site b:");
	        b = scanner.nextInt();
	        
	        System.out.println("Input site c:");
	        c = scanner.nextInt();
	        
	        if (c >= a + b || a <= b + c || a + c <= b) {
	        	System.out.println(ANSI_RED + "Error:such a triangle doesn't exist!");
	        } else {
	        	System.out.println(ANSI_GREEN + "Successfully: Valid triangle!");
	        }
	        	
	    
	    }
	}
