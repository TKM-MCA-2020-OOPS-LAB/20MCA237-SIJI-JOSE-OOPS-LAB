import java.util.*;
public class map{
	public static void main(String args[])
	{
		// initialization of a Map
		Map<Integer, String> mp= new HashMap<Integer, String>();

		// inserting the Elements
		mp.put(1,"kerala");
		mp.put(2,"karnataka");
		mp.put(3,"tamil nadu");
        
		System.out.println("After adding: " + mp);
		
        //changing an element
		mp.put(2,"goa");

		System.out.println("After changing " + mp);
		
		//removing an element
		mp.remove(1,"kerala");
		  
        System.out.println("After Removing:"+mp);
	}
}


