package com.example.bus_terminal.model;

import java.time.LocalDate;

public class Transaction {

    private LocalDate date;
    private String status;
    private String paymentMethod;

    public Transaction(LocalDate of, String completed, String creditCard) {
    }

    public Transaction(LocalDate date) {
        this.date = date;
    }

    public Transaction(String txn001, LocalDate of, double v, String failed, String creditCard) {
    }

    public LocalDate getDate() {
        
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", status='" + status + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    public Object getTransactionId() {
        return null;
    }

    public String getAmount() {
        return "";
    }

    public String getMethod() {
        return "";
    }
}
