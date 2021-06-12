package com.example.accountapp.logic;

//import com.example.accountapp.ui.OutputInterface;

/**
 * This file defines the Account class.  It provides the basis for a
 * series of improvements you'll need to make as you progress through
 * the lessons in Module 6.
 */
public class Account {

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p/>
     * This is how we will interact with the User Interface
     * [MainActivity.java].
     * </p>
     * This was renamed to 'mOut' from 'out', as it is in the video
     * lessons, to better match Android/Java naming guidelines.
     */
   //// final OutputInterface mOut;

    /**
     * Name of the account holder.
     */
   private String name;

    /**
     * Number of the account.
     */
   private int number;

    /**
     * Current balance in the account.
     */
    private double balance;

    /**
     * Constructor initializes the field
     */
    //public Account(OutputInterface out) {
     //   mOut = out;
    LogicInterface mLogic;
public Account(String newName, int newNumber){
        name = newName;
        number = newNumber;
}
public Account(String newName,int newNumber,double initialBalance){
        this(newName,newNumber);
        balance = initialBalance;
}
public Account(LogicInterface logic){
    mLogic = logic;
}
    /**
     * Deposit @a amount into the account.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraw @a amount from the account.  Prints "Insufficient
     * Funds" if there's not enough money in the account.
     */
//    public void withdrawal(double amount) {
//        if (balance > amount)
//            balance -= amount;
//        else
//            mOut.println("Insufficient Funds");
//    }
public void withdrawal(double amount){
        if(balance>amount){
            balance=balance-amount;
    }
    else{
      System.out.println("Insufficient Funds");
    }
}
    /**
     * Display the current @a amount in the account.
     */
    public void displayBalance() {
        mLogic.println("The balance on account "
                     + number
                     + " is " 
                     + balance);
    }


    public void setNumber(int i) {
        this.number = number;
    }

    public void setName(String bill) {
        this.name = name;
    }
    public String toString(){
        return "Account holder:" + this.getName() +" ," + this.getNumber();
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
}
