package interpreterDP;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Takim takim = new Takim(); 
		takim.Form = "GGBMGG"; 
		takim.Puan = 0;

        List<ISonuc> sonuclar = new ArrayList<ISonuc>();

        for (final char c : takim.Form.toCharArray())
        {
            switch (c)
            {
                case 'G':
                    sonuclar.add(new Galibiyet());
                    break;
                case 'B':
                    sonuclar.add(new Beraberlik());
                    break;
                case 'M':
                    sonuclar.add(new Maglubiyet());
                    break;
                default:
                    break;
            }
        }

        for (ISonuc sonuc : sonuclar)
        {
            sonuc.PuanHesapla(takim);
        }

        System.out.println("Form Durumu:" + takim.Form + ", Puan: " + takim.Puan);

	}

}
