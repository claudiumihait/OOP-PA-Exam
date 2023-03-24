package hockeyleague;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HockeyTeam {
	private final String name;
	private final List<Player> players;
	private Player captain;
	private Optional<Coach> coach = Optional.empty();
	private final List<Game> gameHistory;

	public HockeyTeam(String name, List<Player> players, Player captain) {
		this.name = name;
		this.players = players;
		this.captain = captain;
		this.gameHistory = new ArrayList<>();
		checkTeamSize();
	}

	private void checkTeamSize() {
		if(players.size() < 6 || players.size() > 12){
			throw new IllegalArgumentException("Team size must have minimum 6 players and maximu 12 players");
		}
	}

	public Player getCaptain() {
		return captain;
	}

	public void setCaptain(Player captain) {
		this.captain = captain;
	}

	public void setCoach(Coach coach){this.coach = Optional.of(coach);}


	public String getName() {
		return name;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public Optional<Coach> getCoach() {
		return coach;
	}

	public List<Game> getGameHistory() {
		return gameHistory;
	}
}
