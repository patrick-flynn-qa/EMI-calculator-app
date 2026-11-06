package day3;

import java.util.Scanner;

public class EmiCalculator {
// Enter Loan Amount
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total loan amount");
		double LoanAmount = scanner.nextDouble();
		
		//Select term length
		System.out.println("Select The Option for Term Length");
		System.out.println("1 Loan Term in Months");
		System.out.println("2 Loan Term in Years");
		
		int Termchoice = scanner.nextInt();
		
		// Enter term length
        System.out.println("Enter the Loan Term");
        int TermLength = scanner.nextInt();

        int NumberOfPayments;

        if (Termchoice == 1) {
            NumberOfPayments = TermLength;
        } else if (Termchoice == 2) {
            NumberOfPayments = TermLength * 12;
        } else {
            System.out.println("Invalid selection");
            scanner.close();
            return;
        }
        

        // Enter interest rate
        System.out.println("Enter the Interest Rate");
        double InterestRate = scanner.nextDouble();

        System.out.println("Number of monthly payments: " + NumberOfPayments);

        
        
        double i = (InterestRate / 100) / 12;

        double Payment = (LoanAmount * i * Math.pow(1 + i, NumberOfPayments)) /
                (Math.pow(1 + i, NumberOfPayments) - 1);

        System.out.printf("Monthly Payment: $%.2f%n", Payment);
        
        scanner.close();
        
    }
	
}
