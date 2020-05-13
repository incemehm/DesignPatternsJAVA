package iteratorDP;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook<T> implements IPhoneBook<T> {

	 private List<T> items = new ArrayList<T>();

	 public int Count()
     { 
       return items.size();
     }
     
     public void Add(T item)
     {
         items.add(item);
     }
     public T GetItem(int index)
     {
         return items.get(index);
     }
	
	@Override
    public Iterator<T> GetIterator()
    {
        return new PersonIterator<T>(this);
    }
}
