package com.example.bus_terminal.TerminalManager;

import com.example.bus_terminal.User;

import java.time.LocalDate;

public class TerminalManager extends User {
    public TerminalManager(String name, String phoneNo, String email, String address, String gender, String password, LocalDate dob) {
        super(name, phoneNo, email, address, gender, password, dob);
    }
};
