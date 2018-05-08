import java.util.*;
import java.io.*;
public class PriorityQueue implements Comparable{
	
	private int items;
	ArrayList<Vertex> list;
	
	public PriorityQueue() {
		list= new ArrayList();
		list.add(null);
		
		
	}
	public boolean add(Vertex o) {
		if(list.contains(o)) {
		return false;
		}
		list.add(o);
		return true;
		
	}
	public void print() {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public boolean isEmpty() {
		return  list.size()==0;
		
	}
	public boolean MakeEmpty() {
		list.removeAll(list);
		return list.size()==0;
		
	}
	public Vertex peek() {
		return  list.get(1);
		
	}
	public Vertex pull() {
		if(isEmpty()) {
			return null;
		}
		return list.remove(1);
		
	}
	public void Heap(int n) {
		int size = list.size();
		int child = n;
		int i = n;
		int parent=child/2;
		Object last = list.get(n);
		while(2*i<=size) {
			child = 2*i;
			
			if(child<size && parent < child) {
//				int tempInd = (int) list.get(parent);//index for parent
//				int tempInd2 = (int) list.get(child); // index for child
//				list.set(tempInd, 1);
//				list.set(tempInd2, 2);
			}
		}
	}
	public static void main(String[]cmdLn) {
		PriorityQueue q = new PriorityQueue();
		Graph h = new Graph();
		Vertex v = new Vertex("Göteborg");
		
		

	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
//class distance implements Comparator<PriorityQueue>{  // Comparator that sorts by population
//	@Override
//	public int compare(PriorityQueue o1, PriorityQueue o2) {
//		// TODO Auto-generated method stub
//		return  (int)(o1.schabla() - (o2.schabla()));  // sorts so we can print out the land with biggest population first
//	}
//}
//class time implements Comparator<PriorityQueue>{ // Comparator that compares land, alphabetical
//	
//	public int compare(PriorityQueue o1, PriorityQueue o2) {
//		// TODO Auto-generated method stub
//		return (int)o1.time() - (o2.time());  // compares Land object o1 with Land o2
//	}
//}

