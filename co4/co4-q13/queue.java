import java.util.*;
class queue{  
    public static void main(String args[]){  
        PriorityQueue<String> city=new PriorityQueue<String>();  
        //initialize the PriorityQueue with values
        city.add("Mumbai");  
        city.add("Bengaluru");  
        city.add("Kolkata");  
        city.add("Chennai");  
        city.add("pune");  
        //print the head of the PriorityQueue
        System.out.println("PriorityQueue Head:"+city.element());  
        //Define the iterator for PriorityQueue and print its elements 
        System.out.println("\nPriorityQueue elements:");  
        Iterator iter=city.iterator();  
        while(iter.hasNext()){ 
            System.out.print(iter.next() + " ");  
        }  
    }  
}

