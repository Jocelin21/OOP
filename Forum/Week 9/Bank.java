public class Bank {
    private Customer[] customers = new Customer[100];
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bName){
        this.bankName = bName;
        this.numberOfCustomers = 0;
    }

    public addCustomer(String f, String l){
        customers[numberOfCustomers] = new Customer(f, l);
        this.numberOfCustomers += 1;
    }

    public int getNumOfCustomers(){
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index){
        return this.customers[index];
    }
}