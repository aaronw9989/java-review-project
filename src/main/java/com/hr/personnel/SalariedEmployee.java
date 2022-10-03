package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {
  private double monthlySalary;

  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
    super(name, hireDate);
    this.monthlySalary = monthlySalary;
  }

  @Override
  public double computeMonthlyTaxToPay() {
    return computeMonthlyCompensation() * HOURLY_TAX_RATE;
  }

  @Override
  public double computeMonthlyCompensation() {
    return getMonthlySalary();
  }

  public String getEmployeeInfo() {
    return "name = " + this.getName()
        + ", hireDate = " + this.getHireDate()
        + ", monthly salary = " + getMonthlySalary();
  }

  public double getMonthlySalary() {
    return monthlySalary;
  }

  public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }


}
