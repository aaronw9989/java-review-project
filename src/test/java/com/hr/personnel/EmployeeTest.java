package com.hr.personnel;

import com.hr.personnel.Employee;
import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

  private Employee employee;

  @Before
  public void setUp() throws Exception {
//    this.employee = new Employee(
//        "Aaron",
//        LocalDate.of(2020, 01, 03));
  }

  @Test
  public void getEmployeeInfo_should_return_name_and_hireDate() {

    // act
    String employeeInfo = employee.getEmployeeInfo();

    // assert
    Assert.assertEquals("name = Aaron, hireDate = 2020-01-03",
        employeeInfo);

    Assertions.assertThat(employeeInfo).isEqualTo("name = Aaron, hireDate = 2020-01-03");
  }

  @Test
  public void work_should_return_name_worked_string() {
    String work = employee.work();
    Assertions.assertThat(work).isEqualTo("sang worked");
  }

}
