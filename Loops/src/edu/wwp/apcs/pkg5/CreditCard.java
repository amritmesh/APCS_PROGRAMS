package edu.wwp.apcs.pkg5;

public class CreditCard 
{
	private double balance;
	private double minPayRate;
	private double interestRate;
	
	public CreditCard() {
		balance = 5000;
		minPayRate = 3;
		interestRate = 21;
	}
	
	public CreditCard(int myBalance, int myMinPayRate, int myInterestRate) {
		balance = myBalance;
		minPayRate = myMinPayRate;
		interestRate = myInterestRate;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getMinPayRate() {
		return minPayRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public static void debtSimulator() {
		CreditCard card = new CreditCard();
		System.out.println("Month\t Minimum Payment\t Monthly Interest\t Principal Paid\t Remaining Balance\t Total Interest");
		int month = 0;
		double minimumPayment, monthlyInterest, principalPaid, remainingBalance = card.getBalance(), totalInterest = 0;
		while (Math.round(remainingBalance * 100) > 0) {
			month++;
			minimumPayment = card.getMinPayRate() * 0.01 * remainingBalance;
			if (minimumPayment < 15) {
				minimumPayment = 15;
				if (minimumPayment > remainingBalance)
					minimumPayment = remainingBalance + remainingBalance * card.getInterestRate() * 0.01 / 12;
			}
			monthlyInterest = remainingBalance * card.getInterestRate() * 0.01 / 12;
			principalPaid = minimumPayment - monthlyInterest;
			remainingBalance -= principalPaid;
			totalInterest += monthlyInterest;
			System.out.printf("%-5d\t $%-14.2f\t $%-15.2f\t $%-13.2f\t $%-16.2f\t $%-13.2f\n", month, minimumPayment, monthlyInterest, principalPaid, remainingBalance, totalInterest);
		}
		System.out.println("It will take you " + month + " months to pay off your credit card.");
		System.out.printf("During that time, you will pay $%.2f to pay off your credit card.\n", totalInterest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		debtSimulator();
	}

}
