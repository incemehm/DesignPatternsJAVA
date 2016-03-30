package flyweightDP;

import java.util.HashMap;
import java.util.Map;

public class NotHavuzu 
{
	private Map<String, Not> notHavuzu = new HashMap<String, Not>();

	public Not GetNot(String harf)
    {
        if (notHavuzu.containsKey(harf))
            return notHavuzu.get(harf);

        else
        {
            Not not = new Not(harf);

            notHavuzu.put(harf, not);

            return not;
        }
    
    }

}
