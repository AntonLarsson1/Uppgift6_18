import java.util.Comparator;
import java.util.*;
import java.io.*;
public class PriorityQueue<AnyType> implements Comparator{
	private AnyType [] theArray; 
	private int size;
	private int items;
	public PriorityQueue(int size) {
		items = 0;
		this.size = size;
		theArray = (AnyType[]) new Object[size];
		
	}
	public boolean add(AnyType e) {
		if(items==size) {
			throw new IllegalArgumentException();
			
		}
		
		
		return true;
	}
	public boolean contains(AnyType e) {
		return false;
	}
	public boolean offer(AnyType e) {
		if(items == size) {
			System.out.println("Sorry dick, Queue is full");
			return false;
		}
		return true;
	}
	public void clear() {
		
	}
	public AnyType peek() {
		return null;
	}
	public AnyType poll() {
		return null;
	}
	
	//hej johannes
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

