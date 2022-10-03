package com.hr.personnel;

import gov.irs.TaxPayer;
import java.util.ArrayList;
import java.util.List;

public class Department {

  private String name;
  private String location;

  private List<Employee> employees = new ArrayList<>();


  // private Employee[] employees = new Employee[100];
  // int currentIndex = 0;

  public Department(String name, String city) {
    this.name = name;
    this.location = city;
  }

  public void addEmployee(Employee employee) {
    // employees[currentIndex++] = employee;
    employees.add(employee);
  }

  public int getEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
    int numberOfWorkersWhoWorked = 0;
//    for (int i = 0; i < currentIndex; i++) {
//      if (employees[i].work().contains("worked")) {
//        numberOfWorkersWhoWorked++;
//      }
//    }

    for (Employee employee : employees) {
      if (employee.work().contains("worked")) {
        numberOfWorkersWhoWorked++;
      }
    }
    return numberOfWorkersWhoWorked;
  }

  public double computeDepartmentTotalMonthlyCompensation() {
    double monthlyTotalCompensation = 0.0;

//    for (int i = 0; i < currentIndex; i++){
//      monthlyTotalCompensation += employees[i].computeMonthlyCompensation();
//    }

    for (Employee employee : employees) {
      double monthlyCompensation = employee.computeMonthlyCompensation();
      monthlyTotalCompensation += monthlyCompensation;
    }
    return monthlyTotalCompensation;
  }

  public int getCurrentIndex() {
    return employees.size();
  }

//  public Employee[] getEmployees() {
//    return employees;
//  }
//
//  public void setEmployees(Employee[] employees) {
//    this.employees = employees;
//  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public List<Employee> getEmployees() {
    return employees;
  }


  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

}
