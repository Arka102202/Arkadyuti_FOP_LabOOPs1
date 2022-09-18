package com.arkatech.model;

public class Employee implements Comparable<Employee> {

    private String firstName, lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Employee e) {
        return (e.firstName.compareTo(this.firstName)) + (e.lastName.compareTo(this.lastName));
    }
}
