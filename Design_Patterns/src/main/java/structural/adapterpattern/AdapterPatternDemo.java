package structural.adapterpattern;

import org.apache.logging.log4j.LogManager;

public class AdapterPatternDemo {  
	 public static void main(String args[]){ 
		 final org.apache.logging.log4j.Logger logger=LogManager.getLogger(AdapterPatternDemo.class);
			 
	  CreditCard targetInterface=new BankCustomer();  
	  targetInterface.giveBankDetails();  
	  logger.debug(targetInterface.getCreditCard());  
	 }   
	}