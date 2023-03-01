package javaprojects;

import java.util.Scanner;

//Take 1 to 5 number from user and display number in word 
public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number betwwen 1 to 5");
int num= sc.nextInt();
switch(num) {
          case 1 : 
	          System.out.println("ONE");
              break;
          case 2 :
        	  System.out.println("TWO");
              break;
          case 3 :
        	  System.out.println("THREE");
              break;
          case 4 :
        	  System.out.println("FOUR");
        	  break;
          case 5 :
        	  System.out.println("FIVE");
        	  break;
        	  
	
}
	}

}
