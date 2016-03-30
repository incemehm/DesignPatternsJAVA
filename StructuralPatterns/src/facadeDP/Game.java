package facadeDP;

public class Game {
	public void KickOff()
    {
        Ball ball = new Ball();
        Team team = new Team();

        ball.Position = "0,0";
        team.Name = "Beþiktaþ JK";
        team.AddPlayer(new Player("Gomez"));
        team.AddPlayer(new Player("Tore"));
        team.AddPlayer(new Player("Quaresma"));
        team.StartWithPlayer(new Player("Olcay"));
     
    }
}
