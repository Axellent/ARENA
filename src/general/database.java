package general;

import java.util.ArrayList;
import play.Game;
import league.Tournament;
import league.League;

public class database extends GeneralTools {

	private ArrayList<Game> games = new ArrayList<Game>();
	private ArrayList<Tournament> tournaments = new ArrayList<Tournament>(); 
	private ArrayList<League> league = new ArrayList<League>(); 
	//private ArrayList<HandleAdvertisement> ads = new ArrayList<HandleAdvertisement>();
	
	
	public database() {

	}
	
	public void saveTournament(int tournamentId,Tournament tournament){
		tournaments.add(tournamentId, tournament);
		
	}
	public void savBeGame(int gameId, Game game){
		games.add(gameId, game);
	}
	
	public void saveLeague(int leagueId, League league){
		//leagues.add(leagueId, league);		
	}
	
	public ArrayList getTournaments(){
		return tournaments;
	}
	
	public ArrayList getGames(){
		return games;
	}
	
	public ArrayList getLeague(){
		//return leagues;
		return null;
	}
	
	

}
