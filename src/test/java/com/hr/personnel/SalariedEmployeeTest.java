package com.hr.personnel;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SalariedEmployeeTest {

  @Test
  public void getEmployeeInfo() {
  }

  @Test
  public void computeMonthlyCompensation_should_return_monthly_salary() {
    SalariedEmployee alice = new SalariedEmployee(
        "Alice",
        LocalDate.of(2020, 01, 02),
        2000.0);

    double monthlyCompensation = alice.computeMonthlyCompensation();
    Assertions.assertThat(monthlyCompensation).isEqualTo(2000.0);
  }

}