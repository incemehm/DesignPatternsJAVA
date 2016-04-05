package visitorDP;

public class _4GBaglanti implements IBaglanti {

	@Override
	public void Gec(Telefon telefon) {
		 if (telefon instanceof  Samsung)
             System.out.println("Samsung 4G baglantiya gecti.");
         else if (telefon instanceof  Sony)
        	 System.out.println("Sony 4Gyi desteklemiyor!");

	}

}
