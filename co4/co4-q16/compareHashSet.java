import java.util.*;
  public class compareHashSet {
  public static void main(String[] args) {
     // Create a empty hash set
        HashSet<String> h_set1 = new HashSet<String>();
     // use add() method to add values
          h_set1.add("Red");
          h_set1.add("Green");
          h_set1.add("Black");
          h_set1.add("White");
          System.out.println("Frist HashSet : "+h_set1);
          HashSet<String>h_set2 = new HashSet<String>();
          h_set2.add("Red");
          h_set2.add("Pink");
          h_set2.add("Black");
          h_set2.add("Orange");
          System.out.println("Second HashSet : "+h_set2);
          
          // To find union
          Set<String> union = new HashSet<String>(h_set1);
          union.addAll(h_set2);
          System.out.println("Union:"+union);
    
          // To find intersection
          Set<String> intersection = new HashSet<String>(h_set1);
          intersection.retainAll(h_set2);
          System.out.println("Intersection:"+intersection);
   
          // To find the symmetric difference
          Set<String> difference = new HashSet<String>(h_set1);
          difference.removeAll(h_set2);
          System.out.println("Difference:"+difference);
          
     }
}


