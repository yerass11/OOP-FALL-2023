package p1;

class Data{
	private double sum;
	private double max;
	private int cnt;
	
	public Data() {
		sum = 0;
		max = Integer.MIN_VALUE;
		cnt = 0;
	}
	
	public void Workin(double value) {
		sum += value;
		if (value > max) {
			max = value;
		}
		cnt++;
	}

	public double Average() {
		return sum / cnt;
	}
	
	public double Max() {
		return max;
	}
	
}