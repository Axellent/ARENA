package advertisement;

import general.User;

/**
 * Handles the advertiser
 * @author Albin
 *
 */
public class Advertiser extends User {
    private HandleAccountBalance balance;
    
    /**
     * Sets the name and password for the user and adds credits to their balance
     * @author Albin Olausson
     * @param name
     * @param id
     * @param password
     * @param credits
     */
    public Advertiser(String name, String password, int credits){
        super(name, password);
        balance = new HandleAccountBalance(credits);
    }       
    
    /**
     * Used to withdraw credits from the advertiser
     * @author Albin Olausson
     * @param amount
     * @return
     */
    public boolean withdraw(int amount){
        return balance.withdraw(amount);
    }
    
    
    /**
     * Let's the advertiser add credits to their account
     * @author Albin Olausson
     * @param amount
     * @return
     */
    public boolean deposit(int amount){
        return balance.deposit(amount);
    }
    
    /**
     * Returns the advertisers balance
     * @author Albin Olausson
     * @return
     */
    public int getBalance(){
        return balance.getCredits();
    }
}
