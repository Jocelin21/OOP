public class Account {
    private double balance;

    public Account(){
        this.balance = 0.0;
    }

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean deposit(double amt){
        if (amt > 0){
            this.balance += amt;
            return true;
        }else{
            return false;
        }
    }

    public boolean withdraw(double amt){
        if (amt <= balance){
            this.balance -= amt;
            return true;
        }else{
            return false;
        }
    }
}
