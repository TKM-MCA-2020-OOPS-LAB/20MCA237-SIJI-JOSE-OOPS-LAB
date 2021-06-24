//Maintain a list of Strings using ArrayList from collection framework, perform built-in operations

/*
1) add( Object o): This method adds an object o to the Array List.

2) add(int index, Object o): It adds the object o to the array list at the given index.

3) remove(Object o): Removes the object o from the ArrayList.

4) remove(int index): Removes element from a given index.

5) set(int index, Object o): Used for updating an element.

6) int indexOf(Object o): Gives the index of the object o. 

7) Object get(int index): It returns the object of list which is present at the specified index.

8) int size(): It gives the size of the ArrayList – Number of elements of the list.

9) boolean contains(Object o): It checks whether the given object o is present in the array list if its there then it returns true else it returns false.

10) clear(): It is used for removing all the elements of the array list in one go.

*/
import java.util.*;
public class Array_List {
	public static void main(String[] args) {
		
		// Creating ArrayList of type "String" which means we can only add "String" elements
		
		 ArrayList<String> obj = new ArrayList<String>();
		 
		 //adding elements to an ArrayList
		 
	      obj.add("One");
	      obj.add("Three");
	      obj.add("Four");
	      obj.add("Five");
	      obj.add(1, "Two");

	      // Displaying elements
	      
	      System.out.println("\n ArrayList after add operation:");
	      for(String str:obj)
	         System.out.println(str);

	      //Remove elements from ArrayList 
	      
	      obj.remove("Five");
	      obj.remove(3);
	     
	      // Displaying elements
	      
	      System.out.println("\n ArrayList after remove operation:");
	      for(String str:obj)
	         System.out.println(str);

	      // Displaying final Array List
	      
	      System.out.println("\n Final ArrayList:");
	      for(String str:obj)
	         System.out.println(str);
	      
	      //Sorting the ArrayList
	      
	      Collections.sort(obj);
	      
	      System.out.println("\n  ArrayList after sorting:");
	      for (String str : obj) 
	         System.out.println(str);
	
	
	      //returns the object of list which is present at the specified index  
	      
	      System.out.println("\n Object at index 2:"+obj.get(2));
	     
	      // Checks whether the object is in the ArrayList
	      
	      System.out.println("\n Six is in the ArrayList :"+obj.contains("Six"));
	      System.out.println("\n Two is in the ArrayList :"+obj.contains("Two"));
	      
	      //Size of the ArrayList
	      
	      System.out.println("\n Size of the ArrayList:"+obj.size());
	      
	      // removing all the elements of the array list
	      
	      obj.clear();
	      
	      System.out.println("\n  ArrayList after clear method:"+obj);
	      
	}
}


