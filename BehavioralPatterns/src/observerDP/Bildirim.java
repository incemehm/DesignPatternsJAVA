package observerDP;

import java.util.ArrayList;
import java.util.List;

public class Bildirim implements IBildirim {

	 private final List< ITakipci >  takipciler  = new ArrayList<ITakipci>();
	  private String tweet = new String();
	
	@Override
	public void TakipcilereBildir() {
		 for ( ITakipci takipci : takipciler ) 
		 {
			 takipci.Bildir(tweet);
		 }
	}

	@Override
	public void TakipciEkle(ITakipci takipci) 
	{
		takipciler.add(takipci);
	}

	public void TweetAt(String tweet)
    {
        this.tweet = tweet;
        TakipcilereBildir();
    }
}
