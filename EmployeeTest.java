package Bonus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testSetTotalPay() {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
	
	emp1.setName("John");
	emp2.setName("Tom");
	emp1.setTotalPay(39);
	emp2.setTotalPay(45);
		assertEquals(585.0, emp1.getTotalPay(), "Test failed");
		assertEquals(682.5, emp2.getTotalPay(),  "Test failed");

	}


}
