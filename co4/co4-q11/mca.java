import java.util.*;
public class mca {
public static void main(String[] args) {
	    LinkedList<String> student = new LinkedList<>();

	    // add elements in LinkedList
	    
	    student.add("Ajitha");
	    student.add("Soumya");
	    student.add("Archana");
	    student.add("Fathima");
	    student.add("Siji");
	    System.out.println("Students in MCA: " + student);

	    // removing an elements
	    
	    String str = student.remove(3);
	    System.out.println("Removed student: " + str);
         
	    //displaying the list
	    
	    System.out.println("Updated List: " + student);
	    
	    // clearing the list
	    
        student.clear();
  
        // removing all elements from the linked list
        
        System.out.println("List after clearing all elements: " + student);
  
	  }

}
