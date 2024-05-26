package ChallengeTest;

public class Q1 {
    public static double calculateBalance(double initialAmount) {
        double balance = initialAmount;
        for (int year = 1; year <= 10; year++) {
            double interestRate = (year % 2 == 1) ? 0.2 : 0.1; // 20% for odd years, 10% for even years
            double interestAmount = balance * interestRate;
            balance += interestAmount;
        }
        return balance;
    }

    public static void main(String[] args) {
        double initialAmount = 250.0;
        double finalBalance = calculateBalance(initialAmount);
        System.out.printf("The final balance after 10 years is: $%f", finalBalance);
    }
}
