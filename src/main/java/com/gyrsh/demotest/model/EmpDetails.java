package com.gyrsh.demotest.model;

public class EmpDetails {
    private int id;
    private String name;
    private String dept;
    private String email;
    private String address;
    private String doj;
    private long phone;
    private long sal;
    private String designation;
    public EmpDetails(int id, String name, String dept, String email, String address, String doj, long phone,
                      long sal, String designation) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.email = email;
        this.address = address;
        this.doj = doj;
        this.phone = phone;
        this.sal = sal;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getDoj() {
        return doj;
    }

    public long getPhone() {
        return phone;
    }

    public long getSal() {
        return sal;
    }

    public String getDesignation() {
        return designation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

