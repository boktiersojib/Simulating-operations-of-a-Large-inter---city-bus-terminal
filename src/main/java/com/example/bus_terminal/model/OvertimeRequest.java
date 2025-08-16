package com.example.bus_terminal.model;

import java.time.LocalDate;

public class OvertimeRequest {
    private LocalDate date;   // The selected date
    private String time;      // The time entered (e.g., "14:30")
    private String reason;    // Reason for overtime

    public OvertimeRequest(LocalDate date, String time, String reason) {
        this.date = date;
        this.time = time;
        this.reason = reason;
    }

    // Getters
    public LocalDate getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }

    // Setters
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

