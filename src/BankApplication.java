class BankAccount{
    String name;
    double balance;

    BankAccount(){
        System.out.println("this is a default constructor");
    }
    BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    void printName(){
        System.out.println("name: " + name);
    }

    void showSummary(){
        printName();
        System.out.println("balance: " + balance);
    }
}

class SavingsAccount extends BankAccount{
    double interestRate;

    SavingsAccount(String name, double balance, double interestRate){
        super(name, balance);
        this.interestRate = interestRate;
    }

    void showSummary(){
        super.showSummary();
        System.out.println("interestRate: " + interestRate);
    }
}

class FixedAccount extends BankAccount{
    FixedAccount(String name, double balance){
        super(name, balance);
    }
}


public class BankApplication {
    static void main() {
        BankAccount account1 = new BankAccount("Jaques", 188);
        account1.showSummary();

        BankAccount account2 = new BankAccount();
//        System.out.println(account2);

        SavingsAccount savings1 = new SavingsAccount("joseph", 199, 12);
        savings1.showSummary();
    }
}
