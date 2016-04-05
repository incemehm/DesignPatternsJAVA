package iteratorDP;

import java.util.ArrayList;
import java.util.List;

public class Rehber implements IRehber {

	 private List<Kisi> kisiler = new ArrayList<Kisi>();
     public int GetKisiSayisi() 
     { 
       return kisiler.size();
     }
     
     public void Ekle(Kisi kisi)
     {
         kisiler.add(kisi);
     }
     public Kisi GetItem(int index)
     {
         return kisiler.get(index);
     }
	
	@Override
	public IKisiIterator GetIterator() {
		return new KisiIterator(this);
	}

}
