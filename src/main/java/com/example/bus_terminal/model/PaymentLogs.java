package com.example.bus_terminal.model;

import java.time.LocalDate;

public class PaymentLogs {
    private LocalDate date;
    private String userName;
    private String gateway;

    public PaymentLogs(LocalDate date, String userName, String gateway) {
        this.date = date;
        this.userName = userName;
        this.gateway = gateway;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    @Override
    public String toString() {
        return "PaymentLogs{" +
                "date=" + date +
                ", userName='" + userName + '\'' +
                ", gateway='" + gateway + '\'' +
                '}';
    }
}
