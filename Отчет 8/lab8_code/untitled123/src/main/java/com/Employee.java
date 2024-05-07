package com;

public class Employee {
    private String fullName;
    private String post;
    private double salary;
    public Employee(String fullName, String post, double salary) {
        this.fullName = fullName;
        this.post = post;
        this.salary = salary;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
