package facadeDP;

import java.util.ArrayList;
import java.util.List;

public class Team {

    String Name;
	List<Player> Players = new ArrayList<Player>();

    public Team(String name) {
        Name = name;
    }

    public void AddPlayer(Player player)
    {
        Players.add(player);
    }

	public void StartWithPlayer(Player player)
    {
        System.out.println(player.getName() + " kicked off. Game Started!");
    }

    public Player GetPlayer(String name)
    {
        return Players.stream().filter(x -> x.getName().equals(name)).findFirst().orElse(null);
    }
}
