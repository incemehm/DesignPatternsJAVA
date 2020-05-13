package iteratorDP;

public class PersonIterator<T> implements Iterator<T> {

	private PhoneBook<T> phoneBook;
	private int index;
	private T current;

	public PersonIterator(PhoneBook<T> phoneBook)
	{
		this.phoneBook = phoneBook;
		this.index = 0;
		this.current = null;
	}

	@Override
	public Boolean MoveNext()
	{
		if (index < phoneBook.Count())
		{
			current = phoneBook.GetItem(index);
			index++;
			return true;
		}
		else
			return false;
	}

	@Override
	public T Current()
	{
		return current;
	}
}
