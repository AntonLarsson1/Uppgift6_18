<<<<<<< HEAD
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Graph{
	
=======
package Uppgift6_18;

import java.util.*;

public class Graph {
>>>>>>> master
	    public static final double INFINITY = Double.MAX_VALUE;
	    private Map<String,Vertex> vertexMap = new HashMap<String,Vertex>();

	    /**
	     * Add a new edge to the graph.
	     */
	    public void addEdge( String sourceName, String destName, double cost )
	    {
	        Vertex v = getVertex( sourceName );
	        Vertex w = getVertex( destName );
	        v.adj.add( new Edge( w, cost ) );
	    }
	    
	    public int size(){
	    	
	    	return vertexMap.size();
	    }
	    
	    public boolean isEmpty(){
	    	
	    	return vertexMap.isEmpty();
	    }
	    public HashMap<String,Vertex> getMap(){
	    	
	    	return (HashMap<String, Vertex>) vertexMap;
	    }
	    
	    public Vertex getNode(String key){
			
	    	
	    	return vertexMap.get(key);
	    		
	    }
	    private Vertex getVertex( String vertexName ){
	    	
	        Vertex v = vertexMap.get(vertexName);
	        if( v == null ){
	            v = new Vertex(vertexName);
	            vertexMap.put(vertexName, v);
	        }
	        return v;
	    }

	    
	    /*
	     * Initializes the vertex output info prior to running
	     * any shortest path algorithm.
	     */
	    
	    class Vertex{
	    	
		    public String     name;   // Vertex name
		    public List<Edge> adj;    // Adjacent vertices
		    public double     dist;   // Cost
		    public Vertex     prev;   // Previous vertex on shortest path
		    public int        scratch;// Extra variable used in algorithm

<<<<<<< HEAD
		    public Vertex( String nm ){
		    	name = nm;
		    	adj = new LinkedList<Edge>( );
		
		    	}
		   
		    
=======
		    public Vertex( String nm )
		      { name = nm; adj = new LinkedList<Edge>( ); reset( ); }

		    public void reset( )
		      { dist = Graph.INFINITY; prev = null; scratch = 0; }

>>>>>>> master
		}
	    
	    class Path implements Comparable<Path>{
	    	
		    public Vertex     dest;   // w
		    public double     cost;   // d(w)
		    
		    public Path( Vertex d, double c )
		    {
		        dest = d;
		        cost = c;
		    }
		    
		    public int compareTo( Path rhs ){
		    	
		        double otherCost = rhs.cost;
		        
		        return cost < otherCost ? -1 : cost > otherCost ? 1 : 0;
		    }
		}
	    class Edge{
	    	
		    public Vertex     dest;   // Second vertex in Edge
		    public double     cost;   // Edge cost
		    
		    public Edge( Vertex d, double c )
		    {
		        dest = d;
		        cost = c;
		    }
		}


	}
