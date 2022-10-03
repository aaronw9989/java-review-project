package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

  private int hoursWorkedPerMonth;
  private double hourlyRate;

  public HourlyEmployee() {

  }

  public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth,
      double hourlyRate) {
    super(name, hireDate);
    this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    this.hourlyRate = hourlyRate;
  }
  @Override
  public double computeMonthlyCompensation() {
    return hourlyRate * hoursWorkedPerMonth;
  }

  @Override
  public double computeMonthlyTaxToPay() {
    return computeMonthlyCompensation() * HOURLY_TAX_RATE;
  }

  public String getEmployeeInfo() {
    return "name = " + this.getName() + ", hireDate = " + this.getHireDate()
        + ", hours worked = " + getHoursWorkedPerMonth()
        + ", hourly rate = " + getHourlyRate();
  }


  public int getHoursWorkedPerMonth() {
    return hoursWorkedPerMonth;
  }

  public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
    this.hoursWorkedPerMonth = hoursWorkedPerMonth;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }


}
