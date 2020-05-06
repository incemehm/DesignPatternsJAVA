package flyweightDP;

import java.util.HashMap;
import java.util.Map;

public class GradePool
{
	private Map<String, Grade> gradeDict = new HashMap<String, Grade>();

	public Grade GetGrade(String letter)
    {
        if (gradeDict.containsKey(letter))
            return gradeDict.get(letter);

        else
        {
            Grade grade = new Grade(letter);

            gradeDict.put(letter, grade);

            return grade;
        }
    }
}
