public class Account {
 
private final static double DEFAULT_BALANCE = 0.0;
private double balance;
 private Employee employee;
private AccountType acctType;
Account(Employee emp, AccountType acctType, double balance){
employee = emp;
this.acctType =acctType;
this.balance = balance;
}

Account(Employee emp, AccountType acctType){
this(emp,acctType,DEFAULT_BALANCE);
}
public String toString() {
return "type = "+acctType+", balance = "+balance;
}
public void makeDeposit(double deposit) {

 balance= balance+deposit;
}
public boolean makeWithdrawal(double amount) {
	/* //updates the balance field and returns true, unless
	//withdrawal amount is too large; in that case,
	//it does not modify the balance field, and returns false*/
	if (balance<amount){
		return false;
	}
	else
	{
	balance=balance-amount;	
	return true;
	}
	
 }

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public AccountType getAcctType() {
	return acctType;
}

public void setAcctType(AccountType acctType) {
	this.acctType = acctType;
}
public double computeInterest(String AcntType){
	/* The method returns the yearly interest amount for that account.
      If the account is a checking account then the interest  =  balance * 0.02
      If the account is a savings account then the interest  =  balance * 0.04
      If the account is a retirement account then the interest  =  balance * 0.05

      The signature and return type of the method is      double computeInterest();*/
	if (AcntType.equals( "checking")){
		return balance*0.02;
	}
	if (AcntType.equals("savings")){
		return balance*0.04;
	}
	else  {
		return balance*0.05;
	}
	
}
}
