package AbstractBankAccount;

public class Main {
    public static void main(String args [])
    {
        SavingsAcct savings = new SavingsAcct(1000,5);
        ChcekingAccount checking = new ChcekingAccount(500, 200);

        savings.deposit(200);
        savings.applyInterest();
        savings.withdraw(150);
        savings.displayBalance();

        checking.deposit(300);
        checking.withdraw(400);
        checking.withdraw(700);
        checking.displayBalance();
    }
}
