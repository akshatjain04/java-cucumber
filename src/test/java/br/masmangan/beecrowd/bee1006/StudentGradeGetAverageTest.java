
// ********RoostGPT********
/*
Test generated by RoostGPT for test sample-test-11 using AI Type  and AI Model

ROOST_METHOD_HASH=getAverage_3b87df4523
ROOST_METHOD_SIG_HASH=getAverage_5d8b4919d3

"""
  Scenario 1: Normal case where all grades are positive

  Details:
    TestName: testAverageWithAllPositiveGrades.
    Description: This test checks the average calculation when all grades a, b, c are positive numbers.
  Execution:
    Arrange: Set a, b and c with positive numbers using setA(), setB() and setC() methods respectively.
    Act: Call getAverage() method.
    Assert: Use JUnit assertions to compare the actual result against the expected outcome.
  Validation:
    The assertion verifies that the average is calculated correctly when all grades are positive. This is a basic functionality check for the getAverage() method.

  Scenario 2: Case where all grades are zero

  Details:
    TestName: testAverageWithAllZeroGrades.
    Description: This test checks the average calculation when all grades a, b, c are zero.
  Execution:
    Arrange: Set a, b and c with zero using setA(), setB() and setC() methods respectively.
    Act: Call getAverage() method.
    Assert: Use JUnit assertions to compare the actual result against the expected outcome.
  Validation:
    The assertion verifies that the average is calculated correctly when all grades are zero. This is an edge case check for the getAverage() method.

  Scenario 3: Case where all grades are negative

  Details:
    TestName: testAverageWithAllNegativeGrades.
    Description: This test checks the average calculation when all grades a, b, c are negative numbers.
  Execution:
    Arrange: Set a, b and c with negative numbers using setA(), setB() and setC() methods respectively.
    Act: Call getAverage() method.
    Assert: Use JUnit assertions to compare the actual result against the expected outcome.
  Validation:
    The assertion verifies that the average is calculated correctly when all grades are negative. This is an edge case check for the getAverage() method.

  Scenario 4: Case where grades are a mix of positive and negative numbers

  Details:
    TestName: testAverageWithMixedGrades.
    Description: This test checks the average calculation when grades a, b, c are a mix of positive and negative numbers.
  Execution:
    Arrange: Set a, b and c with a mix of positive and negative numbers using setA(), setB() and setC() methods respectively.
    Act: Call getAverage() method.
    Assert: Use JUnit assertions to compare the actual result against the expected outcome.
  Validation:
    The assertion verifies that the average is calculated correctly when grades are a mix of positive and negative numbers. This is another functionality check for the getAverage() method.
"""
*/

// ********RoostGPT********

package br.masmangan.beecrowd.bee1006;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class StudentGradeGetAverageTest {

	@Test
	@Tag("valid")
	public void testAverageWithAllPositiveGrades() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(2.0);
		studentGrade.setB(3.0);
		studentGrade.setC(5.0);
		double result = studentGrade.getAverage();
		assertEquals(3.7, result, 0.001);
	}

	@Test
	@Tag("boundary")
	public void testAverageWithAllZeroGrades() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(0.0);
		studentGrade.setB(0.0);
		studentGrade.setC(0.0);
		double result = studentGrade.getAverage();
		assertEquals(0.0, result, 0.001);
	}

	@Test
	@Tag("boundary")
	public void testAverageWithAllNegativeGrades() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(-2.0);
		studentGrade.setB(-3.0);
		studentGrade.setC(-5.0);
		double result = studentGrade.getAverage();
		assertEquals(-3.7, result, 0.001);
	}

	@Test
	@Tag("valid")
	public void testAverageWithMixedGrades() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(2.0);
		studentGrade.setB(-3.0);
		studentGrade.setC(5.0);
		double result = studentGrade.getAverage();
		assertEquals(2.3, result, 0.001);
	}

}