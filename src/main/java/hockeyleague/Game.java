package hockeyleague;

import java.util.HashMap;
import java.util.Map;

public class Game {
	private final String location;
	//private final Map<HockeyTeam, Integer> score;
	private final HockeyTeam homeTeam;
	private final HockeyTeam awayTeam;
	private final int homeTeamScore;
	private final int awayTeamScore;

	public Game(String location, HockeyTeam homeTeam, int homeTeamScore, HockeyTeam awayTeam, int awayTeamScore, int homeTeamScore1, int awayTeamScore1) {
		this.location = location;
		this.homeTeamScore = homeTeamScore1;
		this.awayTeamScore = awayTeamScore1;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		//this.score = initScore(homeTeam, homeTeamScore ,awayTeam, awayTeamScore);
	}

//	private Map<HockeyTeam, Integer> initScore(HockeyTeam homeTeam,int homeTeamScore, HockeyTeam awayTeam, int awayTeamScore) {
//		Map<HockeyTeam, Integer> score = new HashMap<>();
//		score.put(homeTeam, homeTeamScore);
//		score.put(awayTeam, awayTeamScore);
//		return score;
//	}

	public HockeyTeam getWinner(){
		if (homeTeamScore > awayTeamScore) return homeTeam;
		if (homeTeamScore < awayTeamScore) return awayTeam;
		return null;
	}

	public String getLocation() {
		return location;
	}

	public HockeyTeam getHomeTeam() {
		return homeTeam;
	}

	public HockeyTeam getAwayTeam() {
		return awayTeam;
	}

	public int getHomeTeamScore() {
		return homeTeamScore;
	}

	public int getAwayTeamScore() {
		return awayTeamScore;
	}
}
