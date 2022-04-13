package Bonus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testSetTotalPay() {
		Employee emp1 = new Employee();
	Employee emp2 = new Employee();
	
	emp1.setTotalPay(39, "John");
	emp2.setTotalPay(45, "David");
		assertEquals(585.0, emp1.getTotalPay(), "Test failed");
		assertEquals(682.5, emp1.getTotalPay(),  "Test failed");

	}


}
