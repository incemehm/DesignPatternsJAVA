package interpreterDP;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        String form = "WWDLDWL";

        List<IResult> results = new ArrayList<IResult>();

        for (final char c : form.toCharArray())
        {
            switch (c)
            {
                case 'W':
                    results.add(new Win());
                    break;
                case 'D':
                    results.add(new Draw());
                    break;
                case 'L':
                    results.add(new Lost());
                    break;
                default:
                    break;
            }
        }

        for (IResult result : results)
            result.CalculatePoint();
	}
}
