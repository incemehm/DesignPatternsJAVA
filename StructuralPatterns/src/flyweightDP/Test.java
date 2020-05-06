package flyweightDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] letters = {"AA", "BA", "BB", "AA", "CC", "FF", "FF", "BB", "CC", "BB", "AA", "CC", "FF", "BB", "CC", "BA"};
		GradePool gradePool = new GradePool();

		for (final String letter : letters) {
			Grade grade = gradePool.GetGrade(letter);
			grade.Print();
		}
	}
}
