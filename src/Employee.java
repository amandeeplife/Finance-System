
import java.util.Date;
import java.util.GregorianCalendar;
/* The first line looks like   double  yearlyFederalTax ()

Write the method.  

 If the salary is greater than $80,000 then the tax is 28% of the salary.
 If the salary is greater than $50,000 and  <=  $80,000  then the tax is 24% of the salary.
 If the salary is greater than $26,000  and  <=  $50,000  then the tax is 20% of the salary.*/

public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;
	
	public Employee(String name, int yearOfHire, 
int monthOfHire, int dayOfHire){
		this.name = name;
		GregorianCalendar cal = 
new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
	}
public String getName(){
	return name;
}
	public void createNewChecking(double startAmount) {
		
		checkingAcct = new Account(this,AccountType.CHECKING,startAmount);		
	}
	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this,AccountType.SAVING,startAmount)	;	
	}
	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT,startAmount);		
	}

	public void deposit(AccountType acctType, double amt){
			if (acctType.equals(AccountType.CHECKING)){
				checkingAcct.makeDeposit(amt);
				}
			else if (acctType.equals(AccountType.RETIREMENT)){
				retirementAcct.makeDeposit(amt);
			}
			else {
				savingsAcct.makeDeposit(amt);
			}
}
	
	public boolean withdraw(AccountType acctType, double amt){
				if (acctType.equals(AccountType.CHECKING) && checkingAcct.getBalance()>amt){
					checkingAcct.makeWithdrawal(amt);
					return true;
				}
				else if(acctType.equals(AccountType.SAVING) &&  savingsAcct.getBalance()>amt){
					savingsAcct.makeWithdrawal(amt);
					return true;
				}
				else if (acctType.equals(AccountType.RETIREMENT) && retirementAcct.getBalance()>amt ){
					retirementAcct.makeWithdrawal(amt);
				}
				
				return false;
	}

	public String getFormattedAcctInfo() {
		StringBuffer sb = new StringBuffer();
		if(checkingAcct!=null && savingsAcct!=null && retirementAcct!=null){
		sb.insert(0,checkingAcct.toString()  +"\n"+ savingsAcct.toString()+"\n"+retirementAcct.toString());
		}
		else if (checkingAcct!=null && savingsAcct!=null && retirementAcct==null){
			sb.insert(0,checkingAcct.toString() +"\n"+ savingsAcct.toString());
			}
		else if (checkingAcct!=null && savingsAcct==null && retirementAcct!=null){
			sb.insert(0,checkingAcct.toString() +"\n"+retirementAcct.toString());
			}
		else if (checkingAcct==null && savingsAcct!=null && retirementAcct!=null){
			sb.insert(0, savingsAcct.toString()+"\n"+retirementAcct.toString());
			}
		else if(checkingAcct!=null && savingsAcct==null && retirementAcct==null){
			sb.insert(0,checkingAcct.toString());
			}
		return sb.toString();
	}

}
