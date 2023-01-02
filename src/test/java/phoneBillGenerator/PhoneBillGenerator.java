package phoneBillGenerator;

import java.util.Scanner;

public class PhoneBillGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter plan fee:");
		double bill = sc.nextInt();
		System.out.println("enter overage minutes:");
		double min = sc.nextInt();
		double overageAmt = calculateOverageRate(min);
		double taxamt = calculateTax(bill + overageAmt);
		double total = bill + overageAmt + taxamt;
		System.out.println(total);

	}

	private static double calculateTax(double overageAmt) {

		return overageAmt * 0.15;
	}

	private static double calculateOverageRate(double min) {
		// TODO Auto-generated method stub
		return min * 0.25;
	}
}
