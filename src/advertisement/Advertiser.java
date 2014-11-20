package advertisement;

import general.User;

/**
 * Handles the advertiser
 * @author Albin Olausson
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
    public Advertiser(String name, String password, int id, int credits){

        setName(name);
        setPassword(password);
        setId(id);
        balance = new HandleAccountBalance(credits);
    }       
    
    
    /**
     * Returns withdrawn amount
     * @author Albin Olausson
     * @param amount
     * @return 
     */
    public boolean withdraw(int amount){
        return balance.withdraw(amount);
    }
    
    
    /**
     * Add credits to a account
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
