package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public abstract class Employee implements TaxPayer {

  private String name;
  private LocalDate hireDate;

  public Employee() {
  }

  public Employee(String name, LocalDate hireDate) {
    this.name = name;
    this.hireDate = hireDate;
  }

  public abstract String getEmployeeInfo();

  public String work() {
    return name + " worked";
  }

  // If current year is 2022 and the year of hireDate is
  // 2020, it returns 2
  public int computeNumberOfYearsWorkedSinceHired() {
    // add code here - do not use deprecated method
    int year = hireDate.getYear();
    int currYear = LocalDate.now().getYear();
    int diff = currYear - year;

    return diff;
  }


  public abstract double computeMonthlyCompensation();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }





}
