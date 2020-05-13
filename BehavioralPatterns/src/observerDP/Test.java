package observerDP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Notification notification = new Notification();

		notification.AddFollower(new TwitterFollower());
		notification.AddFollower(new TwitterFollower());
		notification.AddFollower(new BlogFollower());

		notification.TweetSomething("First tweet!");
	}

}
