public class CheckingAccount {
    public double balance;
    public int number;
    public CheckingAccount(){}
    public CheckingAccount(double balance, int number){
        this.balance=balance;
        this.number=number;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public boolean withdraw(double amount) throws InsufficientFundsException{
        if (this.balance < amount || amount <= 0) {
            double shortBy = amount -this.balance;
            //System.out.println("Sorry, but your account is short by: $" + shortBy);
            throw new InsufficientFundsException(shortBy);
       }
       balance -= amount;
       System.out.print("The balance after withdraw is: $" + this.balance);
       return true;
    }
    public double getBalance(){
        return this.balance;
    }
    public int getNumber(){
        return this.number;
    }


}
