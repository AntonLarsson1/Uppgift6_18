import java.util.*;

public class Graph
	{
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

	    /**
	     * Driver routine to handle unreachables and print total cost.
	     * It calls recursive routine to print shortest path to
	     * destNode after a shortest path algorithm has run.
	     */
	    public void printPath( String destName )
	    {
	        Vertex w = vertexMap.get( destName );
	        if( w == null )
	            throw new NoSuchElementException( "Destination vertex not found" );
	        else if( w.dist == INFINITY )
	            System.out.println( destName + " is unreachable" );
	        else
	        {
	            System.out.print( "(Cost is: " + w.dist + ") " );
	            printPath( w );
	            System.out.println( );
	        }
	    }

	    /**
	     * If vertexName is not present, add it to vertexMap.
	     * In either case, return the Vertex.
	     */
	    private Vertex getVertex( String vertexName )
	    {
	        Vertex v = vertexMap.get( vertexName );
	        if( v == null )
	        {
	            v = new Vertex( vertexName );
	            vertexMap.put( vertexName, v );
	        }
	        return v;
	    }

	    /**
	     * Recursive routine to print shortest path to dest
	     * after running shortest path algorithm. The path
	     * is known to exist.
	     */
	    private void printPath( Vertex dest )
	    {
	        if( dest.prev != null )
	        {
	            printPath( dest.prev );
	            System.out.print( " to " );
	        }
	        System.out.print( dest.name );
	    }
	    
	    /**
	     * Initializes the vertex output info prior to running
	     * any shortest path algorithm.
	     */
	    private void clearAll( )
	    {
	        for( Vertex v : vertexMap.values( ) )
	            v.reset( );
	    }
	    
	    class Vertex
		{
		    public String     name;   // Vertex name
		    public List<Edge> adj;    // Adjacent vertices
		    public double     dist;   // Cost
		    public Vertex     prev;   // Previous vertex on shortest path
		    public int        scratch;// Extra variable used in algorithm

		    public Vertex( String nm )
		      { name = nm; adj = new LinkedList<Edge>( ); reset( ); }

		    public void reset( )
		      { dist = Graph.INFINITY; prev = null; pos = null; scratch = 0; }    
		      
		    public PairingHeap.Position<Path> pos;  // Used for dijkstra2 (Chapter 23)
		}
	    class Path implements Comparable<Path>
		{
		    public Vertex     dest;   // w
		    public double     cost;   // d(w)
		    
		    public Path( Vertex d, double c )
		    {
		        dest = d;
		        cost = c;
		    }
		    
		    public int compareTo( Path rhs )
		    {
		        double otherCost = rhs.cost;
		        
		        return cost < otherCost ? -1 : cost > otherCost ? 1 : 0;
		    }
		}
	    class Edge
		{
		    public Vertex     dest;   // Second vertex in Edge
		    public double     cost;   // Edge cost
		    
		    public Edge( Vertex d, double c )
		    {
		        dest = d;
		        cost = c;
		    }
		}

	}
