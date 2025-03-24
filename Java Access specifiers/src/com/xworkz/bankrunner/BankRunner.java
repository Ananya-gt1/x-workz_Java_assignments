package com.xworkz.bankrunner;

import com.xworkz.bank.Account;
import com.xworkz.bank.Bank;
import com.xworkz.bank.Customer;

    public class BankRunner {
        public static void main(String[] args) {

            Account account = new Account("1234567890", 50000.75,true);

            Customer customer = new Customer("Ananya", 25, account,"Active");

            Bank bank = new Bank("State Bank of India", "Bangalore","Karantaka", customer);

            bank.displayBank();
        }
    }
