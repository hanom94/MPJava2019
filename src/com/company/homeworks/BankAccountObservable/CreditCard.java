package com.company.homeworks.BankAccountObservable;

public class CreditCard extends BankAccount{
    public double percent = 1;
    public double fivepercent = 5;

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        updateDeposit();
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance){
            balance = (balance - amount) - ((amount * percent) / 100);
        } else {
            balance = (balance - amount) - ((amount * fivepercent)/100);
        }
        updateWithdraw();
    }

}
