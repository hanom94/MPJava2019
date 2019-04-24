package com.company.homeworks.BankAccountObservable;

public interface Observer {
    void updateWithdraw(BankAccount bankAccount);
    void updateDeposit(BankAccount bankAccount);
    void update(BankAccount bankAccount);
}
