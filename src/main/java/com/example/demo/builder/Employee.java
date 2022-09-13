package com.example.demo.builder;

public class Employee {

    private String name;
    private String company;
    private boolean hasCar; //optional
    private boolean hasBike; //optional

    public Employee(EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.name;
        this.company = employeeBuilder.company;
        this.hasCar = employeeBuilder.hasCar;
        this.hasBike = employeeBuilder.hasBike;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", hasCar=" + hasCar +
                ", hasBike=" + hasBike +
                '}';
    }

    public static class EmployeeBuilder {
        private String name;
        private String company;
        private boolean hasCar; //optional
        private boolean hasBike; //optional


        public EmployeeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}

class TestBuilder {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("Alex", "Amaboba").setHasBike(true).setHasCar(true).build();
        System.out.println(employee);
    }
}
