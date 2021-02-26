package com.design.patterndemo.create.prototype;

import com.google.gson.Gson;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        int eid = 100301;
        String ename = "홍길동";
        String edesignation = "직함";
        double esalary = 200000;
        String eaddress = "서울시 서초구";

        EmployeeRecord employeeRecord1 = EmployeeRecord
                .builder()
                .id(eid)
                .name(ename)
                .designation(edesignation)
                .salary(esalary)
                .address(eaddress)
                .build();
        employeeRecord1.print();
        System.out.println("================");

        // deep copy
        EmployeeRecord employeeRecord2 = (EmployeeRecord) employeeRecord1.clone();
        employeeRecord2.print();

        boolean equals = employeeRecord2.equals(employeeRecord1);
        System.out.println("equals : "+equals);
    }
}
