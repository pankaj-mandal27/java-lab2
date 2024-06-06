package AbstractBankAccount;



class ChcekingAccount extends BankAccount{

    private double overdraftLimit;

    public ChcekingAccount(double initialBalance , double overdraftLimit)
    {
        super(initialBalance);
        this.overdraftLimit =  overdraftLimit;

    }
    @Override
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance + overdraftLimit)
        {
            balance -= amount;
            System.out.println("Withdraw : $"+amount);
        } else {
            System.out.println("Invalid withdraw amount or overdraftlimit.");
        }
    }
    @Override
    public void displayBalance(){
        System.out.println("Checking Account balance: $"+balance);
    }
}
