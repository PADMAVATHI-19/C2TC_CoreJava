package com.tns.dayone;

public class FirstProgram {
	//Main Function
	public static void main(String[]args)
	{
	//Variable Declaration
	int a=10;
	int b=5;
	System.out.println("a= "+a);
	System.out.println("b= "+b);

	System.out.println("Arithmetic Operators");

	// Addition
	        int add = a + b;
	        System.out.println("Addition: " + add);
	        //System.out.println("Addition: " + a+b);
	       
	        //Subraction
	        System.out.println(a-b);
	       
	        //Multiplication
	        System.out.println(a*b);
	       
	        //Division
	        System.out.println(a/b);
	       
	        //Modulo
	        System.out.println(a%b);
	       
	       
	        // Increment operations
	       
	        a++; // Post-increment
	        System.out.println("post-increment: " + a);
	        ++a; // Pre-increment
	        System.out.println("pre-increment: " + a);

	        // Decrement operations
	       
	        b--; // Post-decrement
	        System.out.println("post-decrement: " + b);
	        --b; // Pre-decrement
	        System.out.println("pre-decrement: " + b);
	       
	        //Relational Operators
	       
	        System.out.println("a == b: " + (a == b));  // Equal to
	        System.out.println("a != b: " + (a != b));  // Not equal to
	        System.out.println("a > b: " + (a > b));    // Greater than
	        System.out.println("a < b: " + (a < b));    // Less than
	        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
	        System.out.println("a <= b: " + (a <= b));  // Less than or equal to
	       
	        //Assignment Operators
	        //'+='means a=a+3
	        a += 3;
	        System.out.println(a);

	        //'-=' means a=a-3
	        a -= 3;
	        System.out.println(a);

	        //'*=' means a=a*3
	        a *= 3;
	        System.out.println(a);

	       
	        //Ternary Operator(condition? true : false)
	       
	        int max = (a > b) ? a : b;

	        System.out.println("maximum num: " + max);
	}

	}

	


