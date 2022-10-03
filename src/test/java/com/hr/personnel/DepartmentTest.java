package com.hr.personnel;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class DepartmentTest {

  private Department department;
  private Employee joe;

  @Before
  public void setUp() throws Exception {
    department = new Department("Engineering", "boston");

    joe = new SalariedEmployee("Joe",
        LocalDate.of(2020, 03, 04),
        3000.0);

  }

  @Test
  public void addEmployee_should_increase_currentIndex_by_one() {
    int currentIndexBeforeAddingNewEmployee = department.getCurrentIndex();
    department.addEmployee(joe);
    int currentIndexAfterAddingEmployee = department.getCurrentIndex();

  }



}