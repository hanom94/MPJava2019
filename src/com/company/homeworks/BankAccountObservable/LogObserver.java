package com.company.homeworks.BankAccountObservable;

public class LogObserver implements Observer {
    @Override
    public void updateWithdraw(BankAccount bankAccount) {
        System.out.println("Your account has been reduced -, on account " + bankAccount.getBalance() );
    }

    @Override
    public void updateDeposit(BankAccount bankAccount) {
        System.out.println("Your account has been increased +, on account " + bankAccount.getBalance() );
    }

    @Override
    public void update(BankAccount bankAccount) {
        System.out.println("*****" + bankAccount.getBalance());
    }
}
