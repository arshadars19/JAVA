package exercise;

public class SumofDivisor {

	private int num;
	int sum = 0;

	public SumofDivisor(int num) {
		this.num = num;
	}

	public int SumDivisor() {
		for (int i = 2; i < num; i++) { // 4 < 5
			if (num % i == 0) { // 6

				sum = sum + i;// 2,3
			}
		}
		return sum;
	}

}
