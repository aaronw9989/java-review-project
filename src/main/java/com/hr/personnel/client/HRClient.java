package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

public class HRClient {

  public static void main(String[] args) {

//    Employee employee1 = new Employee();
//    employee1.setName("Aaron");
//    employee1.setHireDate(LocalDate.of(2020,   3, 10));
//    String employeeInfo1 = employee1.getEmployeeInfo();
//    System.out.println("employee1 info = " + employeeInfo1);
//
//    Employee employee2 = new Employee("mary", LocalDate.of(1900, 03, 05));
//    String employeeInfo2 = employee2.getEmployeeInfo();
//    System.out.println("employee1 info = " + employeeInfo2);
//
//    int numYears = employee2.computeNumberOfYearsWorkedSinceHired();
//    System.out.println("Number of years worked = " + numYears);

    SalariedEmployee salariedEmployee = new SalariedEmployee();
    salariedEmployee.setMonthlySalary(2000.0);
    salariedEmployee.setName("Aaron");
    String employeeInfo1 = salariedEmployee.getEmployeeInfo();
    System.out.println("Salaried employee1 = " + employeeInfo1);

    SalariedEmployee salariedEmployee2 = new SalariedEmployee(
        "Joe",
        LocalDate.of(2020, 03, 04),
        3000.0);

    System.out.println("Salaried employee2 = " + salariedEmployee2.getEmployeeInfo());

    HourlyEmployee hourlyEmployee1 = new HourlyEmployee(
        "Mary",
        LocalDate.of(2019, 04, 03),
        100,
        10.0);

    System.out.println("Hourly employee = " + hourlyEmployee1.getEmployeeInfo());

    Department department = new Department("Engineering", "Boston");
    department.addEmployee(salariedEmployee);
    department.addEmployee(salariedEmployee2);
    department.addEmployee(hourlyEmployee1);

    int numberOfEmployeesWhoWorked = department.getEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
    System.out.println("Number of employees who worked = " + numberOfEmployeesWhoWorked);


    double totalMonthlyCompensation = department.computeDepartmentTotalMonthlyCompensation();

    System.out.println("Department total monthly compensation = " + totalMonthlyCompensation);

  }

}
