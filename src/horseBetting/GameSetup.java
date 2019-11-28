package horseBetting;

import java.util.Random;
import java.util.Scanner;

public class GameSetup {
	Speler[] players;
	
	void makePlayers(Speler user, int aantSpelers) {
		if (aantSpelers <= 0) {
			players = new Speler[1];
			players[0] = user;
			return;
		}
		players = new Speler[aantSpelers];
		players[0] = user;
		//andere spelers(bots) aanmaken
		for(int x = 1; x < aantSpelers; x++) {
			players[x] = getRandomSpeler();
		}
		return;
	}
	
	String askName() {
		Scanner input = new Scanner(System.in);
		String inputNaam = input.nextLine();
		input.close();
		return inputNaam;
	}
	
	Speler getRandomSpeler() {
		String[] names = {"Kees", "Jan", "Piet", "Klaas", "Irene", "Justus", "Dylan", "Jimmie", "Joshua"};
		int[] startCash = {50, 100, 200, 250, 500, 750, 1000, 1500, 2000, 5000};
		String playerName = names[new Random().nextInt(9)];
		int playerCash = startCash[new Random().nextInt(10)];
		return new Speler(playerName, playerCash);
	}
	
	String getPlayerStats(Speler[] players) {
		String stats = "";
		for (int playerIndex = 0; playerIndex < players.length; playerIndex++) {
			stats = stats + players[playerIndex].name + " - cash: $" + players[playerIndex].getCash() + "\n";
		}
		return stats;
	}
}
