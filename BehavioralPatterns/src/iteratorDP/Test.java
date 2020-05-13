package iteratorDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        PhoneBook<Person> phoneBook = new PhoneBook<Person>();
        phoneBook.Add(new Person("fatih",333));
        phoneBook.Add(new Person("ahmet",555));
        phoneBook.Add(new Person("murat",777));
        phoneBook.Add(new Person("aykut",999));

        Iterator<Person> iterator = phoneBook.GetIterator();

        while (iterator.MoveNext())
        {
            System.out.printf("Name: {%s}, Number:{%s}", iterator.Current().Name, iterator.Current().Number);
            System.out.println();
        }
	}

}
