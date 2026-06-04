public class BnkMain {
    public static void main(String[] args) {
        BankingApplication account = new BankingApplication("John Doe", 1000.0);

        account.deposit(500.0);
        account.withdraw(600);
        account.withdraw(1000);

        System.out.println("Account owner: " + account.getOwner());
        System.out.println("Current balance: " + account.getBalance());
    }
    
}
