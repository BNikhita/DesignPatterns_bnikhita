package creational.builderpattern;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;

import behavioral.mementopattern.MementoPatternDemo;

public class CDType {
	final org.apache.logging.log4j.Logger logger=LogManager.getLogger(CDType.class);
	
	private List<Packing> items=new ArrayList<Packing>();  
    public void addItem(Packing packs) {    
           items.add(packs);  
    }  
    public void getCost(){  
     for (Packing packs : items) {  
               packs.price();  
     }   
    }  
    public void showItems(){  
     for (Packing packing : items){  
    logger.debug("CD name : "+packing.pack());  
    logger.debug(", Price : "+packing.price());  
 }       
   }    
}
