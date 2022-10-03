package com.hr.personnel;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HourlyEmployeeTest {

  @Test
  public void computeMonthlyCompensation_should_return_multiplication_of_hourlyRate_and_hours() {
    HourlyEmployee joe = new HourlyEmployee(
        "Joe",
        LocalDate.of(2020, 01, 02),
        200,
        10.0
    );
    double monthlyCompensation = joe.computeMonthlyCompensation();
    Assertions.assertThat(monthlyCompensation).isEqualTo(2000.0);
  }

  @Test
  public void computeMonthlyCompensation_should_return_monthly_salary() {
    SalariedEmployee alice = new SalariedEmployee(
        "Alice",
        LocalDate.of(2020, 01, 02),
        2000.0);
  }

  @Test
  public void getEmployeeInfo_should_return_name_hire_date_hourly_wage_and_hour_worked() {
    HourlyEmployee joe = new HourlyEmployee(
        "Joe",
        LocalDate.of(2020, 01, 02),
        200,
        10.0
    );

    String employeeInfo = joe.getEmployeeInfo();
    Assertions.assertThat(employeeInfo).isEqualTo("name = Joe, hireDate = 2020-01-02, hours worked = 200, hourly rate = 10.0");
  }


}