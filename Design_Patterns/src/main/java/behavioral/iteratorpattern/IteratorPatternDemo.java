package behavioral.iteratorpattern;

import org.apache.logging.log4j.LogManager;

import behavioral.iteratorpattern.IteratorPatternDemo;

public class IteratorPatternDemo {  
    public static void main(String[] args) {  
    	final org.apache.logging.log4j.Logger logger=LogManager.getLogger(IteratorPatternDemo.class);
		
          CollectionofNames cmpnyRepository = new CollectionofNames();  
            
          for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  
              String name = (String)iter.next();  
              logger.debug("Name : " + name);  
           }      
    }  
}  