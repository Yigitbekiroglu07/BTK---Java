// Abstract Classes
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databasemanager = new OracleDataBaseManager();
        customerManager.getCustomers();
    }
}