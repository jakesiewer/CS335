package atm;
import javax.swing.JOptionPane;
/**
 * @author Jake Siewer
 * 19725989
 * 10/02/2021
 */
public class Transactions
{
	public int answer1,answer2,amount;
	public boolean withdrawOK = true;
	public BankAccount ba;
    
	/**
	 * variable declarations for Transactions class
	 */
	public Transactions() {
    	answer1=0;
    	answer2=0;
    	amount=0;
    	ba = new BankAccount(1000);
    	
    }
    
	/**
	 * Main method to initialize methods
	 * @param args
	 */
	public static void main(String[] args)
	{
	  Transactions transaction = new Transactions();
	  transaction.getInput();
	  System.exit(0);
		  
	  }
	   
	/**
	 * gets input from user and and adjusts balance accordingly
	 */
   public void getInput() {	   
	   answer1 = JOptionPane.showConfirmDialog(null,
	                "Make a Depoist?", null, JOptionPane.YES_NO_OPTION);
	     
	   if (answer1 == JOptionPane.YES_OPTION){
	    	  String depString =
	    		         JOptionPane.showInputDialog(
	    		                               "Enter amount:");
	    	  amount = Integer.parseInt(depString);
	    	 
	    	  ba.deposit(amount);
	    	  //deposit an amount in the account
	    	
	    		     
	      }
	   
	   else if (answer1 == JOptionPane.NO_OPTION){
		   answer2 = JOptionPane.showConfirmDialog(null,
	                "Make a Withdraw?", null, JOptionPane.YES_NO_OPTION);
	   
		   if (answer2 == JOptionPane.YES_OPTION){
		    	  String withString =
		    		         JOptionPane.showInputDialog(
		    		                               "Enter amount:");
		    	  amount = Integer.parseInt(withString);
		    	  
		    	  ba.deposit(amount);
		    	  
		   //withdraw an amount from the account 	  
		    	  
	   
	   }
		 
			
	   }
	   if (!withdrawOK)
		   JOptionPane.showMessageDialog(
			         null, "Your Balance  = " + ba.getBalance()+ " which is not enough for this withdraw ");
	   else
		   JOptionPane.showMessageDialog( 
				     null, " Your balance is " + ba.getBalance());

		      	   
	      }
}