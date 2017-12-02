package lesson5;

import java.util.Scanner;

public class MainClass {
public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	String userInput;
	Professor a = new Professor("Joseph",10,108000.00,2001,11,13);
	Professor b = new Professor("Chris",10,108000.00,2009,11,13);
	Professor c  = new Professor("Karl",10,108000.00,20011,11,13);
    Secretary d = new Secretary("Susan",80000.00,2002,12,11,200);
    Secretary e = new Secretary("Haweni",70000.00,2012,10,11,200);
    Administrator f = new Administrator("Alex",170000.00,2012,10,11,200);
    DeptEmployee[ ] department = new DeptEmployee [5];
    department[0]=a;
    department[1]=b;
    department[2]=c;
    department[3]=d;
    department[4]=e;
    department[4]=f;
    System.out.println("Do you want to see the populated result?");
    userInput=input.nextLine();
    if(userInput.equalsIgnoreCase("y")){
    	for (DeptEmployee emps:department){
    		System.out.println("\nInfo of Employee: "+emps.getName());
    		System.out.println(emps.getFormattedInfo(emps));
    	}
    	
    }
}
}
