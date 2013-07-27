package mytest;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyObject obj1 = new MyObject();
		MyObject obj2 = new MyObject();
		
		obj1.setIdentifier(1);
		obj2.setIdentifier(1);
		System.out.println("Obj1 equals Obj2? " + obj1.equals(obj2));
		assert(obj1.equals(obj2));
		
		obj1.setDummyHashCode(1);
		obj2.setDummyHashCode(1);
		
		Set<MyObject> objSet = new HashSet<MyObject>();
		
		objSet.add(obj1);
		objSet.add(obj2);
		System.out.println("Added same obj to set. Size should be 1: " + objSet.size());
		assert(objSet.size() == 1);
		
		objSet.clear();
		System.out.println("Cleared set. Size now: " + objSet.size());
		assert(objSet.size() == 0);
		
		obj2.setDummyHashCode(2);
		System.out.println("Changed hashCode of obj2 so they are not equal");
		
		objSet.add(obj1);
		objSet.add(obj2);
		System.out.println("Added objects again. Size now: " + objSet.size());
		assert(objSet.size() == 2);	
	}

}
