// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap: "+manager.getBalance());
        manager.deposit(100);
        try{
            manager.withdraw(90);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap: "+manager.getBalance());
        try{
            manager.withdraw(120);
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap: "+manager.getBalance());
    }
}