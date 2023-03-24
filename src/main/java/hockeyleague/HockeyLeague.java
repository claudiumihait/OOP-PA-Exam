package hockeyleague;

import java.util.*;

public class HockeyLeague {
	private final List<HockeyTeam> teams;

	public HockeyLeague(List<HockeyTeam> teams) {
		this.teams = teams;
		checkNumberOfTeams();
	}

	private void checkNumberOfTeams() {
		if (teams.size() < 4) {
			throw new IllegalArgumentException("There must be a minimum of 4 teams");
		}
	}

	public List<HockeyTeam> getTeamsWithSameCoach(Coach coach){
		return teams.stream()
				.filter(team -> team.getCoach().isPresent())
				.filter(team -> team.getCoach().get().equals(coach))
				.toList();
	}

	public HockeyTeam getTeamWithMostWins(){
		Map<HockeyTeam, Integer> numberOfWinsForEachTeam = getNumberOfWinsForEachTeam();

		List<Map.Entry<HockeyTeam, Integer>> numberOfWinsForEachTeamList = new ArrayList<>(numberOfWinsForEachTeam.entrySet());
		return numberOfWinsForEachTeamList.stream()
				.min(Comparator.comparingInt(Map.Entry<HockeyTeam, Integer>::getValue))
				.get()
				.getKey();
	}

	public Map<HockeyTeam, Integer> getNumberOfWinsForEachTeam(){
		Map<HockeyTeam, Integer> numberOfWinsForEachTeam = new HashMap<>();
		for(HockeyTeam team : teams){
			for(Game game : team.getGameHistory()){
				HockeyTeam winner = game.getWinner();
				if (winner.equals(team)){
					numberOfWinsForEachTeam.put(winner, numberOfWinsForEachTeam.getOrDefault(winner, 0) +1);
				}
			}
		}

		return numberOfWinsForEachTeam;
	}

	public List<HockeyTeam> getTeams() {
		return teams;
	}
}
