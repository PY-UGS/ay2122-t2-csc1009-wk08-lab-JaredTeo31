import java.util.Scanner;
public class BankDemoTest {
    public static void main(String[] args){
        try {
            CheckingAccount account1 = new CheckingAccount();
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the amount of balance: ");
            double balance = input.nextDouble();
            account1.setBalance(balance);
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter the account number: ");
            int number = input2.nextInt();
            account1.setAccount(number);
            Scanner input3 = new Scanner(System.in);
            System.out.print("Enter the amount to withdraw: ");
            double withdraw = input3.nextDouble();
            account1.withdraw(withdraw);
            input.close();
            input2.close();
            input3.close();
        } 
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        catch (InsufficientFundsException e) {
            System.out.println(e + ": Sorry, but your account is short by: $"+e.getAmount());
        } 
    }
}
