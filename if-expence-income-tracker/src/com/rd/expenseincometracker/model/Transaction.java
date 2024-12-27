package com.rd.expenseincometracker.model;

public class Transaction {
        private String type;
        private double amount;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return type + ": " + (type.equals("Income") ? "+" : "-") + amount;
        }
    }


