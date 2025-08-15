package com.example.bus_terminal.model;

import java.time.LocalDate;

public class PaymentMethod {

    private String methodName;
    private String toggleSwitch; // "ON" or "OFF"
    private double transactionLimit;
    private double feesLimit;
    private LocalDate date;


    public PaymentMethod(String methodName, String toggleSwitch, double transactionLimit, double feesLimit, LocalDate date) {
        this.methodName = methodName;
        this.toggleSwitch = toggleSwitch;
        this.transactionLimit = transactionLimit;
        this.feesLimit = feesLimit;
        this.date = date;
    }


    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getToggleSwitch() {
        return toggleSwitch;
    }

    public void setToggleSwitch(String toggleSwitch) {
        this.toggleSwitch = toggleSwitch;
    }

    public double getTransactionLimit() {
        return transactionLimit;
    }

    public void setTransactionLimit(double transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    public double getFeesLimit() {
        return feesLimit;
    }

    public void setFeesLimit(double feesLimit) {
        this.feesLimit = feesLimit;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "PaymentMethod{" +
                "methodName='" + methodName + '\'' +
                ", toggleSwitch='" + toggleSwitch + '\'' +
                ", transactionLimit=" + transactionLimit +
                ", feesLimit=" + feesLimit +
                ", date=" + date +
                '}';
    }

    public void add(PaymentMethod paymentMethod) {
    }
}
