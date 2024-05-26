package ChallengeTest;

public class Q1_Alternative {

    public static void main(String[] args) {
        double balance = 250; // initial balance
        double oddYearInterestRate = 0.20; // 20% interest rate for odd years
        double evenYearInterestRate = 0.10; // 10% interest rate for even years

        for (int year = 1; year <= 10; year++) {
            double interestRate = (year % 2 == 1) ? oddYearInterestRate : evenYearInterestRate;
            balance = balance * (1 + interestRate); // calculate new balance
        }

        System.out.println("Balance after 10 years: $" + balance);
    }
}
