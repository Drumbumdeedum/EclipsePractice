package dszalay.PracticeProject;

public class test {
	
	private static int sum;

	public static void main(String[] args) {
		int i = 0;
		while(i < 5) {
			System.out.println("This is iteration number: " + i);
			i++;
		}	
		setSum(0);
		int[] numbers = {1,2,3,4,5};
		for (int number : numbers) {
			setSum(getSum() + number);
		}
	}

	public static int getSum() {
		return sum;
	}

	public static void setSum(int sum) {
		test.sum = sum;
	}
}
