package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    private Integer pin;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer employeeID , String role){
        this.employeeID = employeeID;
        id = employeeID;
        this.role = role;
        this.securityIncidents = new ArrayList<>();
    }

    // TO DO: Implement HIPAACompliantUser!
    @Override
    public boolean assignPin(int pin){
        if(pin >= 100000){
        this.pin = pin;
            return true;
        }
        return false;
    }
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID){
        if(!this.id.equals(confirmedAuthID)){
            authIncident();
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return securityIncidents;
    }


    // TO DO: Implement HIPAACompliantAdmin!

    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
    public Integer getEmployeeID(){
        return employeeID;
    }
    public String getRole(){
        return role;
    }
    public void setEmployeeID(Integer employeeID){
        this.employeeID = employeeID;
    }
    public void setRole(String role){
        this.role =role;
    }


}
