package iteratorDP;

public class KisiIterator implements IKisiIterator {

	 private Rehber rehber;
     private int index = 0;
	
	public KisiIterator(Rehber rehber) {
		this.rehber = rehber;
	}

	@Override
	public Kisi Next() {
		 index++;
         if (HasItem())
             return rehber.GetItem(index);
         else
             return null;
	}

	@Override
	public Boolean HasItem() {
		return index < rehber.GetKisiSayisi();
	}

	@Override
	public Kisi Current() {
		 return rehber.GetItem(index);
	}

}
