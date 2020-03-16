//account class declared as abstract since it contains abstract method
abstract class account{
    private String customerName,accountNumber,accountType;
    protected int accountBalance;
    //method to add customer information
    public void addAccount(String customerName, int accountBalance, String accountNumber, String accountType) {
        this.customerName = customerName;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }
    //method to output customer's details.
    public void getCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }
    //method to deposit cash to an account
    public void deposit(int amount) {
        this.accountBalance += amount;
    }
    //"withdraw" declared as abstract class since withdrawal procedure depends on account type
    public abstract void withdraw(int amount);
}

class CurrentAccount extends account {
    //implements the abstract method "withdraw" for a Current account
    public void withdraw(int amount) {
        this.accountBalance -= amount;
        System.out.println("You have successfully withdrawn "+amount);
    }
}
class SavingsAccount extends account{
    //implements the abstract method "Withdraw"
    public void withdraw(int amount){
        if((this.accountBalance - amount)<500){
            System.out.println("Sorry, you do not have sufficient balance to withdraw "+amount
            +" account balance cannot be less than 500");}
        else{
        this.accountBalance -= amount;
        System.out.println("You have successfully withdrawn "+amount);
        }

}
}
public class OopPractice{
    public static void main( String[] args) {
        CurrentAccount acc1 = new CurrentAccount();
        acc1.addAccount("Myke", 1000, "MSP2020", "Current");
        SavingsAccount acc2 = new SavingsAccount();
        acc2.addAccount("Eric", 1500, "BFE1234", "Savings");
        //acc1.getCustomer();
        acc2.withdraw(400);
        acc2.deposit(300);
        acc2.getCustomer();
    }
}