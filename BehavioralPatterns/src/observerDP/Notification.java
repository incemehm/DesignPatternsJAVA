package observerDP;

import java.util.ArrayList;
import java.util.List;

public class Notification implements INotification {

	 private final List<IFollower>  followers  = new ArrayList<IFollower>();
	 private String tweet = new String();
	
	@Override
	public void Notify() {
		 for (IFollower follower : followers )
		 {
			 follower.GetNotification(tweet);
		 }
	}

	@Override
	public void AddFollower(IFollower follower)
	{
		followers.add(follower);
	}

	public void TweetSomething(String content)
    {
        this.tweet = content;
        Notify();
    }
}
