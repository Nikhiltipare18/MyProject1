package javaprojects;

import java.util.Scanner;

//Write code to find out the area of rectangle, square, circle,triangle as per user choice 
public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
float b,h,r,l,w,s;
System.out.println("Enter the redius");
r=sc.nextFloat();
System.out.println("enter the breadth");
b=sc.nextFloat();
System.out.println("enter the height");
h=sc.nextFloat();
System.out.println("enter the length");
l=sc.nextFloat();
System.out.println("enter the width");
s=sc.nextFloat();
System.out.println("enter side");

System.out.println("enter the operation from fowlling criteria");
System.out.println("1.Circle \t  2.Triangle \t 3.Square \t 4.Rectangle");
char A=sc.next().charAt(0);

switch(A)
{ case '1'  : System.out.println("Circle "+ (3.14*r*r) );
break;

  case '2'  : System.out.println( "Triangle" + (1/2*b*h));
break;

  case '3'  : System.out.println( "Square" + (s*s ));
  break;
  
  case '4' : System.out.println("Rectangle" + (l*b));
  break;
  
}
	}
}
