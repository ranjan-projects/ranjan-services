package com.ranjanenterprises.test;

import java.util.Objects;

public class Employee {

    private int employeeeId;
    private String empoyeeName;
    private String employeeDesignation;

    public int getEmployeeeId() {
        return employeeeId;
    }

    public void setEmployeeeId(int employeeeId) {
        this.employeeeId = employeeeId;
    }

    public String getEmpoyeeName() {
        return empoyeeName;
    }

    public void setEmpoyeeName(String empoyeeName) {
        this.empoyeeName = empoyeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public static final class EmployeeBuilder {
        private int employeeeId;
        private String empoyeeName;
        private String employeeDesignation;

        private EmployeeBuilder() {
        }

        public static EmployeeBuilder anEmployee() {
            return new EmployeeBuilder();
        }

        public EmployeeBuilder withEmployeeeId(int employeeeId) {
            this.employeeeId = employeeeId;
            return this;
        }

        public EmployeeBuilder withEmpoyeeName(String empoyeeName) {
            this.empoyeeName = empoyeeName;
            return this;
        }

        public EmployeeBuilder withEmployeeDesignation(String employeeDesignation) {
            this.employeeDesignation = employeeDesignation;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.setEmployeeeId(employeeeId);
            employee.setEmpoyeeName(empoyeeName);
            employee.setEmployeeDesignation(employeeDesignation);
            return employee;
        }
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return getEmployeeeId() == employee.getEmployeeeId() &&
                        Objects.equals(getEmpoyeeName(), employee.getEmpoyeeName()) &&
                        Objects.equals(getEmployeeDesignation(), employee.getEmployeeDesignation());
    }*/

    @Override
    public int hashCode() {
        return 1;
    }
}