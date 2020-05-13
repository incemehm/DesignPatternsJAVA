package observerDP;

public class TwitterFollower implements IFollower {

	@Override
	public void GetNotification(String tweet)
	{
		System.out.println("Twitter follower did get new tweet! => " + tweet );
	}
}
