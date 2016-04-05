package visitorDP;

public class _3GBaglanti implements IBaglanti {

	@Override
	public void Gec(Telefon telefon) {
		 if (telefon instanceof  Samsung)
             System.out.println("Samsung 3G baglantiya gecti.");
         else if (telefon instanceof  Sony)
        	 System.out.println("Sony 3G baglantiya gecti.");

	}

}
