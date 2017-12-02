package lesson5;

import java.util.Date;
import java.util.GregorianCalendar;

public class DeptEmployee {

	String name;
	Date hireDate;
	double salary;
	
	DeptEmployee(String name,double salary,int yearOfHire, 
			int monthOfHire, int dayOfHire) {
	this.name=name;
	
	this.salary=salary;
	GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
					hireDate = cal.getTime();
	
	}
	
	
	public double computeSalary(){
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public String getName(){
		return name;
	}
	public Date getDate(){
		
		return hireDate;
	}
	public int getNumberOfPublication(){
		 return 0;
	}
	public String getFormattedInfo(DeptEmployee emp){
		StringBuffer sb = new StringBuffer();
		if(emp.getClass()== Professor.class ){
		sb.insert(0, "HireDate is on "+getDate()+" Salary :"+ computeSalary()+" No of Publications are " + getNumberOfPublication() );
		}
		else 
			sb.insert(0, "HireDate is on "+getDate()+"Salary :"+ computeSalary() );

		return sb.toString();
	}
}
