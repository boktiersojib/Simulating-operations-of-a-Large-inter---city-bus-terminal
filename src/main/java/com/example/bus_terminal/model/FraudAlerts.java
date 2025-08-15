package com.example.bus_terminal.model;

import java.time.LocalDate;

public class FraudAlerts {
    private String transactionId;
    private String reason;
    private LocalDate date;
    private double amount;

    public FraudAlerts(String transactionId, String reason, LocalDate date, double amount) {
        this.transactionId = transactionId;
        this.reason = reason;
        this.date = date;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "FraudAlerts{" +
                "transactionId='" + transactionId + '\'' +
                ", reason='" + reason + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
