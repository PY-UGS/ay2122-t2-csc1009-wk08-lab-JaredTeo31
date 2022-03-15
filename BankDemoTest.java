import java.util.Scanner;
public class BankDemoTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of balance: ");
        double balance = input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        int number = input2.nextInt();

        CheckingAccount account1 = new CheckingAccount(balance, number);
        try {
            Scanner input3 = new Scanner(System.in);
            System.out.print("Enter the amount to withdraw: ");
            double withdraw = input3.nextDouble();
            account1.withdraw(withdraw);
          
        } catch (InsufficientFundsException e) {
            System.out.println(e + ": Sorry, but your account is short by: $"+e.getAmount());
        }
    }
}
