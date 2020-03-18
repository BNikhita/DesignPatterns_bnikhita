package structural.compositepattern;
import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.List;

import org.apache.logging.log4j.LogManager;  
public class BankManager implements Employee {  
	final org.apache.logging.log4j.Logger logger=LogManager.getLogger(BankManager.class);  
     private int id;  
     private String name;  
     private double salary;  
  
     public BankManager(int id,String name,double salary) {  
      this.id=id;      
      this.name = name;  
      this.salary = salary;  
     }  
         List<Employee> employees = new ArrayList<Employee>();  
     public void add(Employee employee) {  
        employees.add(employee);  
     }  
     public Employee getChild(int i) {  
      return employees.get(i);  
     }   
     public void remove(Employee employee) {  
      employees.remove(employee);  
     }    
     public int getId()  {  
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
      Iterator<Employee> it = employees.iterator();  
        
          while(it.hasNext())  {  
            Employee employee = it.next();  
            employee.print();  
         }  
     }  
}