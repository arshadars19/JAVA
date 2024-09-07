package oops_interface_ex;

interface operation {
	int perform(int x, int y);
}

class Add implements operation {

	@Override
	public int perform(int x, int y) {
		return x + y;
	}
}

class Subtract implements operation {

	@Override
	public int perform(int x, int y) {
		return x - y;
	}
}

class Divide implements operation {

	@Override
	public int perform(int x, int y) {
		if (y == 0 || x == 0) {
			return -1;
		}
		return x / y;
	}
}
