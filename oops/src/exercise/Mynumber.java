package exercise;

public class Mynumber {
	private int num;

	public Mynumber(int num) {
		this.num = num;
	}

	public boolean isPrime() {

		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0)

			{
				return false;
			}
		}
		return true;
	}

}
