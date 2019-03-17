package com.Netcracker.Employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary = 0;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        if(salary > 0)
            this.salary = salary;
    }

    public int getID(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public int getSalary(){
        return salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }

    public void setSalary(int salary){
        if(salary >= 0)
            this.salary = salary;
    }

    public int raiseSalary(int percent){
        if(percent > 0)
            salary = salary/100 * (100+percent);
        return salary;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Employee)){
            return false;
        }

        Employee employee = (Employee) obj;
        return this.id == employee.id &&
                this.salary == employee.salary &&
                this.firstName.equals(employee.firstName) &&
                this.lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode(){
        int hashCode = 23;

        hashCode = 31 * hashCode + id;
        hashCode = 31 * hashCode + salary;
        hashCode = 31 * hashCode + firstName.hashCode();
        hashCode = 31 * hashCode + lastName.hashCode();

        return hashCode;
    }

    @Override
    public String toString(){
        String allInfo = "Employee[id = " + id + ", name = " +
                this.getName() + ", salary = " + salary + "]";
        return allInfo;
    }
}
