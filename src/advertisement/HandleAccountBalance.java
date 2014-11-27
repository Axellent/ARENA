package advertisement;

/**
 * Handles the advertisers balance account
 * @author Albin Olausson
 *
 */
public class HandleAccountBalance {
    private int credits;
    
    
/**
 * Sets the  credits
 * @author Albin Olausson    
 * @param credits
 */
    public HandleAccountBalance(){
    
    }
    
    public void setCredits(int credits){
    	this.credits = credits;
    }
    
    /**
     * Returns the  credits
     * @author Albin Olausson
     * @return
     */
    public int getCredits(){
        return credits;
    }
    
    
    /**
     * Let's the user make a deposit
     * @author Albin Olausson
     * @param amount
     * @return
     */
    public boolean deposit(int amount){
        if(amount > 0){
            credits += amount;
          return true;
        }
        return false;
    }
    
    
    /**
     * Let's the user make a withdraw
     * @author Albin Olausson
     * @param amount
     * @return
     */
    public boolean withdraw(int amount){
        if(credits >= amount){
            credits -= amount;
            return true;
        }
        return false;
    }
}
