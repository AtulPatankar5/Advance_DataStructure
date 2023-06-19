package Day1;

public class PrimeNumber_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Prime number has 2 factors => 1 and numer itself
		int num = 11;
		int factor = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				factor++;
		}
		if (factor > 2)
			System.out.println("Not Prime ");
		else
			System.out.println("prime number ");
	}

}
