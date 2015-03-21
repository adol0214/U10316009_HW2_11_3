/**
 * Name:陳信邦
 * ID: U10316009
 * Ex: 8.14
 */
import java.sql.Date;

public class Homework2 {
	public static void main (String[] args){
		Account test = new Account(1122,20000);
		test.setAnnualInterestRate(4.5);
		test.withdraw(2500);
		test.deposit(3000);
		System.out.println(test.toString());
	}
}

class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	Account(){
	}
	
	Account(int newId,double newBalance){
		id = newId;
		balance = newBalance;
	}
	
	void setId(int newId){
		id = newId;
	}
	
	void setBalance(double newBalance){
		balance = newBalance;
	}
	
	void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	int getId(){
		return id;
	}
	
	double getBalance(){
		return balance;
	}
	
	double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	Date getDateCreated(){
		return dateCreated ;
	}

	double getMonthlyInterestRate(){
		return annualInterestRate/1200 ;
	}

	double getMonthlyInterest(){
		return balance*(annualInterestRate/1200);
	}

	void withdraw(double amount){
		balance -= amount;
	}

	void deposit(double amount){
		balance += amount;
	}

	public String toString(){
		return "The account:\n" + "The ID: " + getId() + "\nThe balance: " + getBalance() +
				"\nThe monthly interest: " + getMonthlyInterest() + "\nThe date: " + getDateCreated();
	}
}
