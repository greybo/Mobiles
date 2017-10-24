package com.mobiles.entity;

/**
 * Created by m on 22.10.2017.
 */

public class Employee {
    private String Position;
    private String email;
    private int accessType;

    public Employee() {
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccessType() {
        return accessType;
    }

    public void setAccessType(int accessType) {
        this.accessType = accessType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Position='" + Position + '\'' +
                ", email='" + email + '\'' +
                ", accessType=" + accessType +
                '}';
    }
}
