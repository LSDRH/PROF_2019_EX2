package exam2.exam2;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {
	
	public static List<Integer> primos(int n) {
		
		if (n <= 1) {
			throw new RuntimeException("Entrada invalida");
		}
		
		int number = n;
		List<Integer> factors = new ArrayList<Integer>();
        
		for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
		
	}
}
