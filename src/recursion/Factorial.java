package recursion;

public class Factorial {
	
	public int iterativeFactorial(int number) {
		int res = 1;
		for(int i = 1; i<=number; i++) {
			res = res * i;
		}
		return res;
	}
	
	
	public int recursiveFactorial(int number) {
		if(number == 0)
			return 1;
		else
			return number * recursiveFactorial(number - 1);
	}
}