import static org.junit.Assert.*;

import org.junit.Test;

public class ComputingTaskTest {

	@Test
	public void testTotalValue() {
		assertEquals(ComputingTask.totalValue(12, 22, 33), 34);
		assertEquals(ComputingTask.totalValue(12, 22, 111133), 34);
		assertEquals(ComputingTask.totalValue(122222, 222, 33), 255);
		assertEquals(ComputingTask.totalValue(1, 0, 3), 1);
		assertEquals(ComputingTask.totalValue(-1001, -10000, -10000), -20000);
		assertEquals(ComputingTask.totalValue(100, 22, 333), 122);
		
	}

	@Test
	public void testCheckLetter() {
		assertEquals(ComputingTask.checkLetter('A', 'a'), true);
		assertEquals(ComputingTask.checkLetter('A', 'B'), false);
		assertEquals(ComputingTask.checkLetter('Z', 'Z'), true);
		assertEquals(ComputingTask.checkLetter('F', 'f'), true);
		assertEquals(ComputingTask.checkLetter('F', 'E'), false);
		assertEquals(ComputingTask.checkLetter('A', 'h'), false);
		
	}

	@Test
	public void testCheckSize() {
		assertEquals(ComputingTask.checkSize(12, 5, 56), true);
		assertEquals(ComputingTask.checkSize(122, 5, 56), true);
		assertEquals(ComputingTask.checkSize(12, 15, 56), true);
		assertEquals(ComputingTask.checkSize(12, 5, 156), false);
		assertEquals(ComputingTask.checkSize(12, 5, 60), false);
		assertEquals(ComputingTask.checkSize(12, 5, 1), true);
	}

	@Test
	public void testMedianNumber() {
		assertEquals(ComputingTask.medianNumber(12, 2, 2), 2);
		assertEquals(ComputingTask.medianNumber(12, 12, 2), 12);
		assertEquals(ComputingTask.medianNumber(12, 12, 12), 12);
		assertEquals(ComputingTask.medianNumber(12333, 2, 2), 2);
		assertEquals(ComputingTask.medianNumber(1, 222, 222), 222);
		assertEquals(ComputingTask.medianNumber(12, 223344, 2), 12);
	}

	@Test
	public void testFindEqualLetter() {
		assertEquals(ComputingTask.findEqualLetter('a', 'a', 'a'), true);
		assertEquals(ComputingTask.findEqualLetter('a', 'b', 'a'), true);
		assertEquals(ComputingTask.findEqualLetter('z', 'Z', 'Z'), true);
		assertEquals(ComputingTask.findEqualLetter('a', 'A', 'B'), false);
		assertEquals(ComputingTask.findEqualLetter('Q', 'P', 'a'), false);
		assertEquals(ComputingTask.findEqualLetter('Z', 'z', 'a'), false);
	}

	@Test
	public void testNumberLevel() {
		assertEquals(ComputingTask.numberLevel(60), 's');
		assertEquals(ComputingTask.numberLevel(12), 'f');
		assertEquals(ComputingTask.numberLevel(100), 'o');
		assertEquals(ComputingTask.numberLevel(85), 'o');
		assertEquals(ComputingTask.numberLevel(75), 'e');
		assertEquals(ComputingTask.numberLevel(80), 'e');
		
	}

	@Test
	public void testFindRelation() {
		assertEquals(ComputingTask.findRelation(12, 22, 44), false);
		assertEquals(ComputingTask.findRelation(12, 22, 34), true);
		assertEquals(ComputingTask.findRelation(12, 5, 7), true);
		assertEquals(ComputingTask.findRelation(120, 22, 98), true);
		assertEquals(ComputingTask.findRelation(12, 12, 12), false);
		assertEquals(ComputingTask.findRelation(44, 0, 44), true);
		
	}

	@Test
	public void testReturnLargestGap() {
		assertEquals(ComputingTask.returnLargestGap(11, 1, 1000), 999);
		assertEquals(ComputingTask.returnLargestGap(11, -1001, 1000), 2001);
		assertEquals(ComputingTask.returnLargestGap(-1111, 1, 1000), 2111);
		assertEquals(ComputingTask.returnLargestGap(11, 1, 1), 10);
		assertEquals(ComputingTask.returnLargestGap(1000, 999, 1000), 1);
		assertEquals(ComputingTask.returnLargestGap(11, 11, 11), 0);
		
	}

}
