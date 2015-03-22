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
	
	//constructor
	Account(){
	}
	
	Account(int newId,double newBalance){
		id = newId;
		balance = newBalance;
	}
	
	
	//各個項目的set和get
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
	
	//領錢
	void withdraw(double amount){
		balance -= amount;
	}

	//存款
	void deposit(double amount){
		balance += amount;
	}
	
	//印出資訊
	public String toString(){
		return "The account:\n" + "The ID: " + getId() + "\nThe balance: " + getBalance() +
				"\nThe monthly interest: " + getMonthlyInterest() + "\nThe date: " + getDateCreated();
	}
}

class SavingAccount extends Account{
	SavingAccount() {
	}
	
	SavingAccount (int newId , double newBalance , double amount){
		super.setId(newId);
		super.setBalance(newBalance);
		super.deposit(amount);
	}
	
	public String toString(){
		return super.toString();
	}
}

class CheckingAccount extends Account{
	CheckingAccount() {
	}
	
	CheckingAccount (int newId , double newBalance){
		super.setId(newId);
		super.setBalance(newBalance);
	}
	
	public String toString(){
		return "The account:\n" + "The ID: " + getId() + "\nThe balance: " + getBalance() +
				"\nThe monthly interest: " + getMonthlyInterest() + "\nThe date: " + getDateCreated();
	}
}
