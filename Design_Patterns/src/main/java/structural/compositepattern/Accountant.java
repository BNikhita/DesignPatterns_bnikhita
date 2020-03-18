package structural.compositepattern;

import org.apache.logging.log4j.LogManager;

import structural.compositepattern.Accountant;

public class Accountant implements Employee{  
	final org.apache.logging.log4j.Logger logger=LogManager.getLogger(Accountant.class);
	
    private int id;  
    private String name;  
    private double salary;  
   public Accountant(int id,String name,double salary)  {  
       this.id=id;  
       this.name = name;  
       this.salary = salary;  
   }    
   public void add(Employee employee) {  
       }  
   public Employee getChild(int i) {  
       return null;  
   }   
    public int getId() {  
        return id;  
   }  
   public String getName() {  
       return name;  
   }   
   public double getSalary() {  
       return salary;  
   }   
   public void print() {  
	   logger.info("=========================");  
	   logger.debug("Id ="+getId());  
	   logger.debug("Name ="+getName());  
	   logger.debug("Salary ="+getSalary());  
       logger.info("=========================");  
   }    
   public void remove(Employee employee) {  
        }  
}  