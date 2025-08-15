package com.example.bus_terminal;

import java.time.LocalDate;
import java.util.Random;

public class CutomerSupportAgent extends User {
    private int status: // status == 2 pending; 1 == confirmed; 0 == cancelled;


    public CutomerSupportAgent(String name, String phoneNo, String email, String address, String gender, String password, LocalDate dob) {
        super(name, phoneNo, email, address, gender, password, dob);
        this.setId(this.generateID());
        this.status = status;
    }

    private void setId(String s) {
    }

    @Override
    public String generateID() {
        String id = "";

        Random random = new Random();
        id = Integer.toString(random.nextInt(1000000, 9999999));


        return id;
    }

    @Override
    public boolean login(String id, String password) {

        return false;
    }


}
