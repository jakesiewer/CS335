package atm;
/**
 * 
 * @author
 * Jake Siewer
 * 19725989
 * 10/02/2021
*/
public class BankAccount {

    private double balance;

	//Constructors
    /*
     * Declarations for bank account balance
     */
	public BankAccount()
	{
		balance = 0;
	}
	
	/**
	 * initial balance for account
	 * @param intialBalance
	 */
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	
	// Methods
	/**
	 * takes in amount to deposit into account
	 * @param amount
	 */
	public void deposit(double amount)
	   {      
		balance = balance + amount;
	       
	    } 
	
	/**
	 * takes in amount to withdraw from account
	 * @param amount
	 * @return
	 */
	public boolean withdraw(double amount)    
	{ 
		if (balance>= amount)
			{
			balance = balance - amount;
			return true;
			}
		else
			return false;
        
    } 
	
	/**
	 * gets amount in account
	 * @return
	 */
	public double getBalance() 
	{ 
		return balance;
	}
}