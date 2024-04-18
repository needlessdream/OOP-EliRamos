
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eliseo Teuz
 */
class bank {
    private Map<String, Double> accounts; // Map to store account numbers and balances

    public bank() {
        accounts = new HashMap<>();
    }

    // Precondition: account number should be unique
    // Postcondition: account is created with initial balance
    public void createAccount(String accountNumber, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, initialBalance);
            JOptionPane.showMessageDialog(null,"Account created successfully.");
        } else {
            JOptionPane.showMessageDialog(null,"Account number already exists.");
        }
    }

    // Precondition: account should exist
    // Postcondition: returns balance of the account
    public double getBalance(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            return accounts.get(accountNumber);
        } else {
           JOptionPane.showMessageDialog(null,"Account not found.");
            return 0.0;
        }
    }

    // Precondition: account should exist and withdrawal amount <= balance
    // Postcondition: withdrawal is made and balance is updated
    public void withdraw(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double balance = accounts.get(accountNumber);
            if (balance >= amount) {
                balance -= amount;
                accounts.put(accountNumber, balance);
                JOptionPane.showMessageDialog(null,"Withdrawal successful. Current balance: " + balance);
            } else {
               JOptionPane.showMessageDialog(null,"Insufficient funds.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Account not found.");
        }
    }

    // Precondition: account should exist
    // Postcondition: deposit is made and balance is updated
    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double balance = accounts.get(accountNumber);
            balance += amount;
            accounts.put(accountNumber, balance);
           JOptionPane.showMessageDialog(null,"Deposit successful. Current balance: " + balance);
        } else {
           JOptionPane.showMessageDialog(null,"Account not found.");
        }
    }
}