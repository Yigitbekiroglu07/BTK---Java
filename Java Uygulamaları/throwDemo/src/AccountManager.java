public class AccountManager {
    private double balance; // Kişinin hesabındaki para miktarı

    public void deposit(double amount) { // Nek kadar para yatırılacak
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws Exception {
        if(balance>=amount){
            balance = getBalance()-amount;
        }else{
            throw new Exception("Bakiye yetersiz.");
        }

    }

    public double getBalance() {
        return balance;
    }
}
