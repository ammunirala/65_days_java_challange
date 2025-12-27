package Inheritance;

class BankAccount {

    double balance = 1000;

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {

    void showBalance() {
        super.showBalance();
        System.out.println("Saving Account balance shown");
    }

    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.showBalance();
    }
}
