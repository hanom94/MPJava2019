package com.company.homeworks.BankAccountObservable;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount implements Observable{

    //Deposit
    public abstract void deposit(double amount);

    //Withdraw
    public abstract void withdraw(double amount);

    //Get balance
    public double getBalance() {
        return balance;
    }



    private List<Observer> observers = new ArrayList<>();
    public double balance;

    public void setBalance(int balance) {
        this.balance = balance;
        notifyObservers();
    }
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        for (Observer eachObserver : observers){
            eachObserver.update(this);
        }
    }

    public void updateDeposit(){
        for (Observer eachObserver : observers){
            eachObserver.updateDeposit(this);
        }
    }

    public void updateWithdraw(){
        for (Observer eachObserver : observers){
            eachObserver.updateWithdraw(this);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
