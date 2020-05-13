package observerDP;

public class BlogFollower implements IFollower {

	@Override
	public void GetNotification(String tweet)
	{
		System.out.println("Blog follower did get new tweet! => " + tweet );
	}
}
