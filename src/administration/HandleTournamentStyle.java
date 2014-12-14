package administration;
import java.util.Random;
import league.LeagueOwner;
import league.Tournament;
import play.Game;
import play.Player;
/**
 * 
 * @author Martin Jakobsson
 *
 */
public class HandleTournamentStyle extends OperatorTools{
    
	public static void main(String [] args){
		
		Player players[] = new Player[11];
		
		for(int i=0; i < players.length; i++){
			players[1] = new Player(null, null, i);
		}
		//System.out.print(players.length);
		deathmatches(players);
	}
	
    private int nGroups;
    
    
    public void createNewTournamentStyle(){
        // lägger denna på halt
    }
    
    public static void deathmatches(Player players[]){
        Player[] unusedPlayers, winningPlayers;
        Player[][] matches;
        int nUnusedPlayers, randomPlayer, nmatches, nWinPlayers;
        
        unusedPlayers = players;
        nUnusedPlayers = players.length;
        
        winningPlayers = new Player[nUnusedPlayers/2];
        		
        Random rand = new Random();
        if(nUnusedPlayers %2 == 1){
        	winningPlayers = new Player[(nUnusedPlayers+1)/2];
        	randomPlayer = rand.nextInt((nUnusedPlayers - 0)) + 0;
            winningPlayers[nUnusedPlayers/2] = unusedPlayers[randomPlayer];
            removePlayer(randomPlayer, unusedPlayers);            
        }           
        
        while(nUnusedPlayers> 1){
        	matches = new Player[nUnusedPlayers][2];
        	nmatches = 0;
            for(int i = 0; i < nUnusedPlayers/2; i++){//put the remaining player in to matches
                randomPlayer = rand.nextInt((nUnusedPlayers - 0)) + 0;
                matches[i][0] = unusedPlayers[randomPlayer];
                removePlayer(randomPlayer, unusedPlayers);
            
                randomPlayer = rand.nextInt((nUnusedPlayers - 0)) + 0;
                matches[i][1] = unusedPlayers[randomPlayer];
                removePlayer(randomPlayer, unusedPlayers);
                nmatches++;
            }        
            nWinPlayers = 0;
        for(int i=0; i < nmatches; i++){// spela matcherna, playmatch får göra eller
                                        // hämta ett spelschema        	
            //winningPlayers[i] = playmatch(matches[i][1], matches[i][2]);
        	nWinPlayers++;
        		}        		
        		unusedPlayers = winningPlayers;        		
        		nUnusedPlayers = nWinPlayers;    
        		winningPlayers = new Player[nUnusedPlayers/2];
        } 
        //TODO: ge spelarna poäng till turneringen.
    }
    
    
    
    private static void removePlayer(int pos, Player players[]){
        for(int i = pos; i < players.length-1; i++){
            players[i] = players[i+1];
        }
    }
    public void cup(Player players[], int numberInGroup){
        
        //grouping(players, numberInGroup);        
    }
    
    public void serie(){ // alla möter alla och de har någon sorts poäng.
        
    }
        
    private void grouping(Player players[], int numberInGroup, int numOfPassers){ //numOfPassers är hur mång som ska gå vidare från varje grupp
        
        nGroups = players.length/numberInGroup;
        
       
    }
}
