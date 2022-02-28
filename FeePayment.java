package StudentMnsys;

import java.util.Scanner;



public class FeePayment {
	 int amount;
	 int fees_paid;
	 int balance;
	public FeePayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeePayment(int amount, int fees_paid, int balance) {
		super();
		this.amount = amount;
		this.fees_paid = fees_paid;
		this.balance = balance;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getFees_paid() {
		return fees_paid;
	}
	public void setFees_paid(int fees_paid) {
		this.fees_paid = fees_paid;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "FeePayment Details: \n amount= " + amount + "\n"  + "fees_paid=  " + fees_paid +"\n " + "balance=" + balance ;
	}
	public FeePayment insert() {
		Scanner scan = new Scanner(System.in);
	    System.out.println("enter the total amount for the course");
		 amount = scan.nextInt();
		System.out.println("enter the fees paid");
		 fees_paid = scan.nextInt();
		  balance = amount-fees_paid;
		return new FeePayment (amount,fees_paid,balance);
		
		
	}
	}
