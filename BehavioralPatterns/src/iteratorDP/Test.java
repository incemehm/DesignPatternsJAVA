package iteratorDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rehber rehber = new Rehber();
        rehber.Ekle(new Kisi("mehmet",3));
        rehber.Ekle(new Kisi("ahmet",5));
        rehber.Ekle(new Kisi("murat", 7));
        rehber.Ekle(new Kisi("aykut", 9));


        IKisiIterator iterator = rehber.GetIterator();
        while (iterator.HasItem())
        {
            System.out.println("Ad: " + iterator.Current().Ad + ", Numara: " + iterator.Current().Numara);
            iterator.Next();
        }

	}

}
