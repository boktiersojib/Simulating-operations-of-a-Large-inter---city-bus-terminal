package com.example.bus_terminal;

import java.time.LocalDate;

public class TerminalManager extends User {
    public TerminalManager(String name, String phoneNo, String email, String address, String gender, String password, LocalDate dob) {
        super(name, phoneNo, email, address, gender, password, dob);
    }

    @Override
    public String generateID() {
        return "";
    }

    @Override
    public boolean login(String id, String password) {
        return false;
    }
};
