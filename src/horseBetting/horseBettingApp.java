package horseBetting;

public class horseBettingApp {
	public static void main(String[] args) throws Exception{
		System.out.println("Welkom bij de paardenraces!");
		GameSetup game = new GameSetup();
		//speler aanmaken
		Speler[] players = new Speler[4];
		System.out.println("Wat is jou naam?");
		game.makePlayers(new Speler(game.askName()), 4);
		
		//print spelers
		System.out.println(game.getPlayerStats(game.players));
	}
}
