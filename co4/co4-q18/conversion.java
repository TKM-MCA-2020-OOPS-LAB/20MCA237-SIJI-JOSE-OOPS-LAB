import java.util.*;
public class conversion {
   public static void main(String args[]) {
      Map<String, String> map = new HashMap<>();
      map.put("1","kerala");
	  map.put("2","karnataka");
	  map.put("3","tamil nadu");
      
      System.out.println("HashMap :" + map);
      Map<String, String> treeMap = new TreeMap<>();
      treeMap.putAll(map);
      System.out.println("TreeMap : " + treeMap);
   }
}
