package com.ranjanenterprises.test;

public class HashTest {

    public static void main(String[] args) {
        Employee employee1 = Employee.EmployeeBuilder.anEmployee().withEmployeeeId(1).withEmployeeDesignation("Des").withEmpoyeeName("Rahul").build();
        Employee employee2 = Employee.EmployeeBuilder.anEmployee().withEmployeeeId(2).withEmployeeDesignation("Des").withEmpoyeeName("Rahul").build();
        Employee employee3 = employee1;

        System.out.println(employee1.hashCode() + " " + employee2.hashCode());
        System.out.println(employee2.getEmployeeeId());


        System.out.println(employee1 == employee2);
        System.out.println(employee1 == employee3);

        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.equals(employee3));

    }

}

