package AbstractBankAccount;
class SavingsAcct extends BankAccount{
    private double interestRate;

    public SavingsAcct(double initialBalance, double interestRate){
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){

        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Applied : $"+interest);

    }
    @Override
    public void displayBalance(){
        System.out.println("Savings Account Balance : $"+balance);

    }
}