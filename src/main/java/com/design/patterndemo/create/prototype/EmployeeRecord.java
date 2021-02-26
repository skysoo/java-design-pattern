package com.design.patterndemo.create.prototype;

import com.google.gson.Gson;
import com.sun.org.apache.regexp.internal.RE;
import lombok.Builder;

public class EmployeeRecord implements Cloneable{
    private static final Gson gson = new Gson();
    private int id;
    private String name;
    private String designation;
    private double salary;
    private String address;

    public EmployeeRecord() {}

    @Builder
    public EmployeeRecord(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void print() {
        System.out.println(gson.toJson(this));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return new EmployeeRecord(id,name,designation,salary,address);
        return this;
//        return EmployeeRecord.builder()
//                .id(this.id)
//                .name(this.name)
//                .designation(this.designation)
//                .salary(this.salary)
//                .address(this.address)
//                .build();
    }
}
