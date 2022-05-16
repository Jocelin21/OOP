import java.util.Scanner;
public class BankingDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Bank BNI = new Bank();
        BNI.Bank("BNI");
        System.out.println("Welcome to the bank!");
        System.out.println("Currently we have " + BNI.getNumOfCustomers());

        boolean flag = true;
        do{
            System.out.println("Pick a number: ");
            System.out.println("1. Make Account");
            System.out.println("2. Select Account");
            System.out.println("3. Quit");
            System.out.print("Choice >> ");
            
            int choice = input.nextInt();

            switch(choice){
                case 1: 
                    System.out.println("Enter your first name: ");
                    String f = input.nextLine();
                    System.out.println("Enter your last name: ");
                    String l = input.nextLine();
                    BCA.addCustomer(f, l);

                    System.out.println("Account has been successfully created!");
                    System.out.println("Welcome, " + f + " " + l);
                    System.out.println("Currently we have " + BNI.getNumOfCustomers());
                    break;

                case 2: 
                    do{
                        System.out.println("Pick a number: ");
                        System.out.println("1. See Balance");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Quit");
                        System.out.print("Choice >> ");
                        
                        int choice2 = input.nextInt();
            
                        switch(choice2){
                            case 1: 
                                System.out.print("Current Balance is " + account.getBalance());
                                break;
            
                            case 2: 
                                System.out.print("Enter the deposit amount: ");
                                int depo = input.nextInt();
                                if(depo > 0){ 
                                    account.deposit(depo);
                                    System.out.println("Deposit Successful");
                                    System.out.println("Current Balance is " + account.getBalance());
                                }else{
                                    System.out.println("Deposit Denied!");
                                    System.out.println("Current Balance is " + account.getBalance());
                                }
                                break;
            
                            case 3: 
                                System.out.print("Enter the withdraw amount: ");
                                int with = input.nextInt();
                                
                                if(with > 0){ 
                                    account.withdraw(with);
                                    System.out.println("Withdraw Successful");
                                    System.out.println("Current Balance is " + account.getBalance());
                                }else{
                                    System.out.println("Withdraw Denied!");
                                    System.out.println("Current Balance is " + account.getBalance());
                                }
                                break;
            
                            case 4: 
                                flag = false;
                                break; 
                        }
                    }while(flag);

                case 3: 
                    System.out.println("Thank you for using our service!");
                    flag = false;
                    break; 
            }
        }while(flag);    
    input.close();
    }
}