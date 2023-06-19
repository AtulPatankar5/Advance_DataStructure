package Day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				System.out.println("not Prime ");

			else 
				System.out.println("prime");
		}
	}

}
