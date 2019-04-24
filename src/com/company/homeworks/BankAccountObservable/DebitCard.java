package com.company.homeworks.BankAccountObservable;

public class DebitCard extends BankAccount {
    public double percent = 1;

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        updateDeposit();
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance){
            balance = (balance - amount) - ((amount * percent) / 100);
            updateWithdraw();
        } else {
            System.err.println("Transaction cencelled due to insufficient funds");
        }
    }

}
