
public class Main {

	public static int fibonaccir(int n) { // function for finding fibonacci using recursive method
		if (n <= 1) {
			return 1;
		} else {
			return fibonaccir(n - 1) + fibonaccir(n - 2);
		}
	}

	public static int fibonaccii(int n) { // function for finding fibonacci using iterative method
		if (n <= 1) {
			return 1;
		}
		int r = 0, p = 1, pp = 1, i;
		for (i = 2; i <= n; i++) {
			r = p + pp;
			pp = p;
			p = r;
		}

		return r;
	}

	public static void main(String[] args) {
		int i, n = 40, f1, f2;
		System.out.print("n\tIterative\tRecursive\n");
		System.out.print("==\t=========\t=========\n");
		long start_time, end_time;
		int difference, difference2;
		for (i = 20; i <= n; i++) // loop from 20 to 40
		{
			start_time = System.nanoTime(); // for initial time
			f1 = fibonaccii(i); // calling function for finding fibonacci using iterative method
			end_time = System.nanoTime(); // for end time
			difference = (int) ((end_time - start_time) / 1e6); // for calculating difference
			start_time = System.nanoTime(); // for initial time
			f2 = fibonaccir(i); // calling function for finding fibonacci using recursive method
			end_time = System.nanoTime(); // for end time
			difference2 = (int) ((end_time - start_time) / 1e6); // for calculating difference
			System.out.print(i + "\t\t" + difference + "\t\t\t" + difference2 + "\t\n"); // for outputting result
		}
	}
}
