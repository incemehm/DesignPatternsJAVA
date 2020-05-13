package chainOfResponsibilityDP;

class LowercaseOperation extends Operation {

	@Override
	protected String DoProcess(String word)
	{
		System.out.println("LowercaseOperation before " + word);

		String result = word.toLowerCase();

		System.out.println("LowercaseOperation before " + result);

		return result;
	}
}

class UppercaseOperation extends Operation {

	@Override
	protected String DoProcess(String word)
	{
		System.out.println("UppercaseOperation before " + word);

		String result = word.toLowerCase();

		System.out.println("UppercaseOperation before " + result);

		return result;
	}
}
