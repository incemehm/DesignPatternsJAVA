package facadeDP;

import java.util.ArrayList;
import java.util.List;

public class Team {
	public String Name = new String();
	List<Player> Players = new ArrayList<Player>();
	
	public void AddPlayer(Player player)
    {
        Players.add(player);
    }

	public void StartWithPlayer(Player player)
    {
        System.out.println(player.getName() + " kicked off. Game Started!");
    }
}
