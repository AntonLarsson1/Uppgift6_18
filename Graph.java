import java.io.File;
import java.io.IOException;
import java.util.*;

public class Graph{
	
	    public static final double INFINITY = Double.MAX_VALUE;
	    private Map<String,Vertex> vertexMap = new HashMap<String,Vertex>();

	    /**
	     * Add a new edge to the graph.
	     */
	    public void addEdge( String sourceName, String destName, double cost ){
	    	
	        Vertex v = getVertex(sourceName);
	        Vertex w = getVertex(destName);
	        v.adj.add(new Edge(w, cost));
	    }
	    
	    public void print(){
	    	
	    Iterator itr = vertexMap.keySet().iterator();
	    
	    while(itr.hasNext()){
	    	
	    	String keyy = (String) itr.next();
	    	Vertex value = vertexMap.get(keyy);
	    	
	    List<Edge> hi = vertexMap.get(keyy).adj;
	    
	    System.out.println(value.name + " is connnected to:");
	    System.out.println();
	    
	    Iterator<Edge> itte = hi.iterator();
	    
	    while(itte.hasNext()){
	    	
	    	Edge temm = itte.next();
	    	System.out.println(temm.dest.name);
	    }
	    	System.out.println();
	    	System.out.println("============================");
	    			
	    }
	    	
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
	    private Vertex getVertex(String vertexName){
	    	
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

		    public Vertex(String nm){
		    	name = nm;
		    	adj = new LinkedList<Edge>( );
		
		    	}
		   
		    
		}
	    
	    class Path implements Comparable<Path>{
	    	
		    public Vertex     dest;  // w
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
		    
		    public Edge(Vertex d, double c)
		    {
		        dest = d;
		        cost = c;
		    }
		}


	}
