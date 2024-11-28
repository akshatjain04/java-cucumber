
// ********RoostGPT********
/*
Test generated by RoostGPT for test shared-test_clone_clone using AI Type Open AI and AI Model gpt-4

ROOST_METHOD_HASH=getAverage_3b87df4523
ROOST_METHOD_SIG_HASH=getAverage_5d8b4919d3

Here are your existing test cases which we found out and are not considered for test generation:

File Path: /var/tmp/Roost/RoostGPT/shared-test_clone_clone/ad980ec5-dd81-4521-b616-663ff1671157/source/java-cucumber/src/test/java/br/masmangan/beecrowd/bee1005/StudentGradeSteps.java
Tests:
    "@Test
@When("average is calculated")
public void average_is_calculated() {
    actual = equation.getAverage();
}
"

File Path: /var/tmp/Roost/RoostGPT/shared-test_clone_clone/ad980ec5-dd81-4521-b616-663ff1671157/source/java-cucumber/src/test/java/br/masmangan/beecrowd/bee1006/StudentGradeSteps.java
Tests:
    "@Test
@When("average is calculated")
public void average_is_calculated() {
    actual = equation.getAverage();
}
"Scenario 1: Test when all parameters are positive
  Details:
    TestName: testAllPositiveParameters
    Description: This test is meant to check the average calculation when all parameters (a, b, c) are positive.
  Execution:
    Arrange: Set a, b, c with positive values.
    Act: Invoke the getAverage() method.
    Assert: Assert that the returned value is as expected.
  Validation:
    This test verifies that the average calculation is correct when all parameters are positive. The expected result is based on the formula used in the getAverage() method. This test is significant to ensure that the method functions correctly under normal conditions.

Scenario 2: Test when all parameters are zero
  Details:
    TestName: testAllZeroParameters
    Description: This test is meant to check the average calculation when all parameters (a, b, c) are zero.
  Execution:
    Arrange: Set a, b, c with zero values.
    Act: Invoke the getAverage() method.
    Assert: Assert that the returned value is zero.
  Validation:
    This test verifies that the average calculation is correct when all parameters are zero. The expected result is zero, as the average of zero values is zero. This test is significant as it tests the method's behavior with edge values.

Scenario 3: Test when parameters are negative
  Details:
    TestName: testNegativeParameters
    Description: This test is meant to check the average calculation when parameters (a, b, c) are negative.
  Execution:
    Arrange: Set a, b, c with negative values.
    Act: Invoke the getAverage() method.
    Assert: Assert that the returned value is as expected.
  Validation:
    This test verifies that the average calculation is correct when parameters are negative. The expected result is based on the formula used in the getAverage() method. This test is significant as it tests the method's behavior with negative values.

Scenario 4: Test with large parameters
  Details:
    TestName: testLargeParameters
    Description: This test is meant to check the average calculation when parameters (a, b, c) are large numbers.
  Execution:
    Arrange: Set a, b, c with large values.
    Act: Invoke the getAverage() method.
    Assert: Assert that the returned value is as expected.
  Validation:
    This test verifies that the average calculation is correct when parameters are large numbers. The expected result is based on the formula used in the getAverage() method. This test is significant as it tests the method's ability to handle large numbers.
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
	public void testAllPositiveParameters() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(2.0);
		studentGrade.setB(3.0);
		studentGrade.setC(5.0);
		double expectedAverage = (2.0 * 2.0 + 3.0 * 3.0 + 5.0 * 5.0) / 10.0;
		assertEquals(expectedAverage, studentGrade.getAverage());
	}

	@Test
	@Tag("boundary")
	public void testAllZeroParameters() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(0.0);
		studentGrade.setB(0.0);
		studentGrade.setC(0.0);
		assertEquals(0.0, studentGrade.getAverage());
	}

	@Test
	@Tag("valid")
	public void testNegativeParameters() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(-2.0);
		studentGrade.setB(-3.0);
		studentGrade.setC(-5.0);
		double expectedAverage = (-2.0 * 2.0 + -3.0 * 3.0 + -5.0 * 5.0) / 10.0;
		assertEquals(expectedAverage, studentGrade.getAverage());
	}

	@Test
	@Tag("valid")
	public void testLargeParameters() {
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.setA(1000000.0);
		studentGrade.setB(2000000.0);
		studentGrade.setC(5000000.0);
		double expectedAverage = (1000000.0 * 2.0 + 2000000.0 * 3.0 + 5000000.0 * 5.0) / 10.0;
		assertEquals(expectedAverage, studentGrade.getAverage());
	}

}