package AbstractBankAccount;

abstract class BankAccount {

    protected double balance;

    public BankAccount(double initialBalance){
        this.balance= initialBalance;
    }
    public void deposit(double amount){
        if (amount>0){
            balance +=amount;
            System.out.println("Deposited : $"+amount);
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount<+balance){
            balance-=amount;
            System.out.println("Withdraw : $"+amount);
        }else{
            System.out.println("Invalid Withdraw amount.");
        }
    }
    public void displayBalance(){
        System.out.println("Current balance : $"+balance);
    }
}
