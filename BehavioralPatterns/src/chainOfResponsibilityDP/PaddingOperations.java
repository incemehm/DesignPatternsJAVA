package chainOfResponsibilityDP;

import com.sun.xml.internal.ws.util.StringUtils;

class PadLeftOperation extends Operation {

	@Override
	protected String DoProcess(String word)
	{
		System.out.println("PadLeftOperation before " + word);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 25; i++) {
			sb.append('.');
		}

		String result = word.length() <= 25 ? sb.substring(word.length()) + word : word;

		System.out.println("PadLeftOperation before " + result);

		return result;
	}
}

class PadRightOperation extends Operation {

	@Override
	protected String DoProcess(String word)
	{
		System.out.println("PadRightOperation before " + word);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 25; i++) {
			sb.append('.');
		}

		String result = word.length() <= 25 ? word + sb.substring(word.length()) : word;

		System.out.println("PadRightOperation before " + result);

		return result;
	}
}
