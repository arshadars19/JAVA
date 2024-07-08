package exercise;

public class SumofN {

	private int n;
	int sum = 0;

	public SumofN(int n) {
		this.n = n;
	}

	public int sumUptoN() {
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;

	}

}
