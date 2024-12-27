package com.rd.expenseincometracker;

import com.rd.expenseincometracker.model.Transaction;
import com.rd.expenseincometracker.service.TrackerService;

import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseIncomeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrackerService trackerService = new TrackerService();
        boolean running = true;

        System.out.println("Welcome to the Expense-Income Tracker!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter income amount: ");
                double income = scanner.nextDouble();
                trackerService.addIncome(income);
                System.out.println("Income added successfully.");
            }

            if (choice == 2) {
                System.out.print("Enter expense amount: ");
                double expense = scanner.nextDouble();
                trackerService.addExpense(expense);
                System.out.println("Expense added successfully.");
            }

            if (choice == 3) {
                System.out.println("Current balance: " + trackerService.getBalance());
            }

            if (choice == 4) {
                ArrayList<Transaction> transactions = trackerService.getTransactions();
                System.out.println("Transaction History:");
                if (transactions.isEmpty()) {
                    System.out.println("No transactions recorded ");
                } else {
                    for (Transaction transaction : transactions) {
                        System.out.println(transaction);
                    }
                }
            }

            if (choice == 5) {
                running = false;
                System.out.println("Exiting the tracker");
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid option");
            }
        }

    }
}


