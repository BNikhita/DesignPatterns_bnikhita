package creational.factorypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;

import behavioral.mementopattern.MementoPatternDemo;

public class GenerateBill{  
    public static void main(String args[])throws IOException{
    	final org.apache.logging.log4j.Logger logger=LogManager.getLogger(GenerateBill.class);
		
        GetPlanFactory planFactory = new GetPlanFactory();  
          
        logger.info("Enter the name of plan for which the bill will be generated: ");  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    
        String planName=br.readLine();  
        logger.info("Enter the number of units for bill will be calculated: ");  
        int units=Integer.parseInt(br.readLine());  
    
        Plan p = planFactory.getPlan(planName);  
        logger.debug("Bill amount for "+planName+" of  "+units+" units is: ");  
             p.getRate();  
             p.calculateBill(units);  
              }  
      }