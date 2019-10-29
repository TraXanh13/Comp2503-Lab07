public class Lab7 {
	public int factorialRecursive(int n) {
		if (n <= 1)
			return 1;
		return n * factorialRecursive(n - 1);
	}

	public int factorialIterative(int n) {
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			ans *= i;
		}
		return ans;
	}

	public long h(int n) { // The recursive HyperFactorial method
		double temp = Math.pow(n, n);
		if (temp <= 1) {
			return 1;
		}
		return (int) temp * h(n - 1);
	}

	public long hIterative(int n) {
		long result = 1;
		if (n <= 1) {
			return 1;
		}
		for (int i = 1; i <= n; i++) {
			result *= Math.pow(i, i);
		}
		return result;
	}

	public long hTail(int n, long partialResult) { // The tail recursive HyperFactorial method
		if (n <= 1) {
			return partialResult;
		}
		partialResult = partialResult * (int)Math.pow(n, n);
		return hTail(n - 1, partialResult);
	}

	public static void main(String args[]) {
		Lab7 f = new Lab7();
		int i = 7;

		for (int n = 0; n <= i; n++) {
			System.out.println("Recursive Factorial: (" + n + ") " + f.factorialRecursive(n));
			System.out.println("Iterative Factorial: (" + n + ") " + f.factorialIterative(n));

			System.out.println("Recursive HyperFactorial: (" + n + ") " + f.h(n));
			System.out.println("Iterative HyperFactorial: (" + n + ") " + f.hIterative(n));
			System.out.println("TailRecur HyperFactorial: (" + n + ") " + f.hTail(n, 1));
			System.out.println();
		}
	}
}