import java.util.*;
public class hashset
{
public static void main(String[] args) 
{
// Creating a Linked hash set 	
 LinkedHashSet<String> hset1= new LinkedHashSet<String>();
 
// Checking the size of LinkedHashSet 
  int size1 = hset1.size();
  System.out.println("Size of LinkedHashSet before adding elements: " +size1);

// Adding elements in the linked hash set
   hset1.add("Red"); 
   hset1.add("Green"); 
   hset1.add("Yellow"); 
   hset1.add("Blue"); 
   hset1.add("Orange"); 
   
System.out.println("Elements in Set: " +hset1);   
int size2 = hset1.size();
System.out.println("Size of LinkedHashSet after adding elements: " +size2);

// Adding duplicate elements 
  hset1.add("Red"); 
  hset1.add("Yellow"); 
   
// Create another set of String type.
   LinkedHashSet<String> hset2 = new LinkedHashSet<String>();
   hset2.add("Brown");
   
// Adding elements of set2 into set.
   hset1.addAll(hset2);
   System.out.println("Elements in Set after adding: " +hset1);
 }
}
