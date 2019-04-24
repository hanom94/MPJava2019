package com.company.homeworks.BankAccountObservable;



public class Main {
    public static void main(String[] args) {
//        DebitCard debitCard = new DebitCard();
//        debitCard.addObserver(new LogObserver());
//
//        debitCard.deposit(100);
//        debitCard.withdraw(50);
//        debitCard.withdraw(5);
//        debitCard.deposit(200);
//        debitCard.withdraw(245);

        CreditCard creditCard = new CreditCard();
        creditCard.addObserver(new LogObserver());

        creditCard.deposit(500);
        creditCard.withdraw(100);
        creditCard.withdraw(399);
        creditCard.deposit(100);
    }
}
