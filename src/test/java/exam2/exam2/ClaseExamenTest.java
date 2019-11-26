package exam2.exam2;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ClaseExamenTest {
	public ClaseExamen clasExamen = new ClaseExamen();
	
	@Test
	public void Test_6() {
		List<Integer> factors = new ArrayList<Integer>();
		factors.add(2);
		factors.add(3);
		assertEquals(factors, clasExamen.primos(6));
	}
	
	@Test
	public void Test_13() {
		List<Integer> factors = new ArrayList<Integer>();
		factors.add(13);
		assertEquals(factors, clasExamen.primos(13));
	}
	
	@Test
	public void Test_25() {
		List<Integer> factors = new ArrayList<Integer>();
		factors.add(5);
		factors.add(5);
		assertEquals(factors, clasExamen.primos(25));
	}
	
	@Test(expected = RuntimeException.class)
	public void Test_Exception() {
		 clasExamen.primos(1);
	}
	
}
