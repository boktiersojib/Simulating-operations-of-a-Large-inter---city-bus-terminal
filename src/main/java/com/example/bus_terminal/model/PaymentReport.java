package com.example.bus_terminal.model;

import java.time.LocalDate;

public class PaymentReport {

    public String transactionId;
    public LocalDate date;
    public double amount;
    public String reportType;

    public PaymentReport(String transactionId, LocalDate date, double amount, String reportType, String creditCard) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.reportType = reportType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
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

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    @Override
    public String toString() {
        return "PaymentReport{" +
                "transactionId='" + transactionId + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                ", reportType='" + reportType + '\'' +
                '}';
    }
}
