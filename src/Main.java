import java.util.Scanner;

/*implement each of the createNewXXX methods by creating a new instance of Account with the appropriate data, and storing the new instance in the appropriate instance variable in Employee

implement the deposit() method by calling the makeDeposit() method on the appropriate Account instance.

implement the withdraw() method as follows: Call the appropriate makeWithdrawal method on the appropriate Account instance and then use the return value as the new return value for withdraw().

implement the getFormattedAccountInfo() by calling the toString() method on each Account instance to provide its own formatted representation of its own account type and balance. The getFormattedAccountInfo method should then piece these 3 Strings together, and return the result. Note: your Account class already has an implementation of toString(); you may need to modify the implementation of this method in order to obtain the desired output format.

add “getter” methods for the name and hireDate fields.

Here is the expected output of your program, in the console application (for Phase I):

See a report of all account balances? (y/n) y
ACCOUNT INFO FOR Jim Daley:

Account type: checking
Current bal:  10500.0
Account type: savings
Current bal:  1000.0
Account type: retirement
Current bal:  9300.0

ACCOUNT INFO FOR Bob Reuben:

Account type: checking
Current bal:  34000.*/
public class Main {
	
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
//		for phase I – console output
		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			for (Employee e: emps){
				System.out.println("Account Report for " + e.getName());
				System.out.println(e.getFormattedAcctInfo()+"\n");
				
			}
		}
		else {
			//do nothing..the application ends here
		}				
	}
	
}