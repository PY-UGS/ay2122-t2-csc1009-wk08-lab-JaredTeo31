public class CheckingAccount {
    public double balance;
    public int number;
    public CheckingAccount(){}
    public CheckingAccount(double balance, int number){
        this.balance=balance;
        this.number=number;
    }
    public void setBalance(double amount) throws IllegalArgumentException{
        if (amount <= 0){
            throw new IllegalArgumentException("Amount cannot be negative");}
        else{
            this.balance=amount;
        }
    }
    public void setAccount(int number) throws IllegalArgumentException{
        if (number <= 0){
            throw new IllegalArgumentException("account number cannot be negative");}
        else{
            this.number=number;
        }

    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public boolean withdraw(double amount) throws InsufficientFundsException,IllegalArgumentException{
        if (amount <= 0){
            throw new IllegalArgumentException("Withdraw amount cannot be negative");}
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
