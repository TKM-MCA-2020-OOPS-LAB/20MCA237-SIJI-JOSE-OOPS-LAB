package myproject;

class cpu
{
	int price = 10000;
	public class processor
	{
		int cores = 4;
		String manufacturer = "intel";
	}
	static class ram
	{
		int memorysize = 16;
		String manufacturer = "samsung";
	}
}
public class nested
{
   public static void main (String[] args)
   {
   	System.out.println("CPU PRICE");
   	cpu obj1 = new cpu();
   	System.out.println("Price of cpu is "+obj1.price);
   	System.out.println("PROCESSOR DETAILS");
   	cpu.processor obj2 = obj1.new processor();
   	System.out.println("No of cores is "+ obj2.cores);
   	System.out.println("Manufacturer is "+ obj2.manufacturer);
   	System.out.println("MEMORY  DETAILS");
   	cpu.ram obj3 = new cpu.ram();
   	System.out.println("Memory size is "+ obj3.memorysize+"gb");
   	System.out.println("Manufacturer is "+ obj3.manufacturer);
   }  
}
