package strategyDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 9, 5, 7, 3 };

		ArrayManager arrayManager = new ArrayManager(new BubbleSort());
		arrayManager.Sort(numbers);

		arrayManager = new ArrayManager(new QuickSort());
		arrayManager.Sort(numbers);
	}
}
