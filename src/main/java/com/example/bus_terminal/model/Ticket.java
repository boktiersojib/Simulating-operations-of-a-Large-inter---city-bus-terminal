package com.example.bus_terminal.model;

public class Ticket {
    private String passengerName;
    private String phoneNumber;
    private String email;
    private int age;
    private String gender;
    private String route;
    private String bus;
    private String seat;
    private String paymentMethod;
    private double amount;

    public Ticket() {
    }

    public Ticket(String passengerName, String phoneNumber, String email, int age,
                  String gender, String route, String bus, String seat,
                  String paymentMethod, double amount) {
        this.passengerName = passengerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.route = route;
        this.bus = bus;
        this.seat = seat;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    // Getters and Setters
    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getRoute() { return route; }
    public void setRoute(String route) { this.route = route; }

    public String getBus() { return bus; }
    public void setBus(String bus) { this.bus = bus; }

    public String getSeat() { return seat; }
    public void setSeat(String seat) { this.seat = seat; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}

