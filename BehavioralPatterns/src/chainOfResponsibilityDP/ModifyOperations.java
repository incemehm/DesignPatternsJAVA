package chainOfResponsibilityDP;

class RemoveSpaceOperation extends Operation {

	@Override
	protected String DoProcess(String word)
	{
		System.out.println("RemoveSpaceOperation before " + word);

		String result = word.replaceAll(" ", "");

		System.out.println("RemoveSpaceOperation before " + result);

		return result;
	}
}

class InsertDashOperation extends Operation {

	@Override
	protected String DoProcess(String word)
	{
		System.out.println("InsertDashOperation before " + word);

		String result = " - " + word;

		System.out.println("InsertDashOperation before " + result);

		return result;
	}
}
