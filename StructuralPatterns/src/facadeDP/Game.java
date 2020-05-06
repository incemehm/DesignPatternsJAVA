package facadeDP;

public class Game {
	public void KickOff()
    {
        Ball ball = new Ball(0,0);
        Team team = new Team("Super Heroes");

        team.AddPlayer(new Player("SpiderMan"));
        team.AddPlayer(new Player("SuperMan"));
        team.AddPlayer(new Player("Batman"));
        team.AddPlayer(new Player("Hulk"));
        team.AddPlayer(new Player("IronMan"));

        team.StartWithPlayer(team.GetPlayer("Hulk"));
    }
}
