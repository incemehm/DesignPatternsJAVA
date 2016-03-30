package observerDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Bildirim bildirim = new Bildirim();

        bildirim.TakipciEkle(new TwitterTakipci());
        bildirim.TakipciEkle(new TwitterTakipci());
        bildirim.TakipciEkle(new BlogTakipci());

        bildirim.TweetAt("Ýlk tweet!");

	}

}
