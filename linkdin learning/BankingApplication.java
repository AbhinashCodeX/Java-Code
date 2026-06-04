

public class BankingApplication {
    private String owner;
    private double balance;

    public BankingApplication(String owner, double StartingBalance) {
        this.owner = owner;
        this.balance = Math.max(StartingBalance, 0);
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
        }

    public double deposit(double amt){
        if(amt>0){
            balance+=amt;
            return amt;
        }
        return 0;
    }

    public double withdraw(double amt){
        if(amt<=this.balance){
            this.balance = this.balance-amt;
            return amt;
        }
        return 0;

    }
}
