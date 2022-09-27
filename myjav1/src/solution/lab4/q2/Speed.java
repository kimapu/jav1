package solution.lab4.q2;

public enum Speed {
	SLOW(1), MEDIUM(2), FAST(3);

	private int value;
	Speed(int i) {
		this.value = i;
	}

	public int getValue() {
		return value;
	}
	
}
