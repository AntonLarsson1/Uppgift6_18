import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {

	
	
	
	 public static void main(String[] args){
		 Graph hej = new Graph();
		 
		 System.out.println("hej");
	    	try{
	    			File file = new File("C:/Users/anton/workspace/Uppgift6_18/sveland");
	    			Scanner scan = new Scanner(file);
	    			while(scan.hasNext()){
	    				;
	    				String hejjj = scan.next();
	    				String tja = scan.next();
	    				int hejj = Integer.parseInt(scan.next());
	    				
	    				hej.addEdge(hejjj,tja,hejj);
	    				
	    		}
	    			
	    			System.out.println("HEEEJ");	
	    		System.out.println(hej.isEmpty());	
	    			
	    			
	    	}catch(IOException e){
	    		System.out.println("sitt ner");
	    		
	    	}
	    	
	    	hej.getNode("Bergbo");
	    	
	    	List wi = (hej.getNode("Bergbo")).adj;
	    	
	    	System.out.println(wi.size());
	    	
	    	System.out.println(Arrays.asList(hej.getMap())); // method 1
	    	System.out.println(Collections.singletonList(hej.getMap())); // method 2
	    	
	 
	 }
	 
}
	    		
	    		

	    	


