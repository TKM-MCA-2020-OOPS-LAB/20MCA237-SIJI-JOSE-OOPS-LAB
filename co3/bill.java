package myproject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

interface calc
{
	void total();
}
class  product1 implements calc
{
	int pid=101,qty=2,pr=25,total;
	String name="A";
	
	public void total()
	{
		total=qty*pr;
	}
}
class product2 extends product1 implements calc
{
	int product_id=102,quantity=1,unit_pr=100,total;
	String name="B";
	DateFormat df=new SimpleDateFormat("dd/MM/yy");
	Date d= new Date();
	@Override
	public void total()
	{
		super.total();
		total=quantity*unit_pr;
	}
	public void display()
	{
		System.out.println("Order No.112\n");
		System.out.println("Date: "+df.format(d));
		System.out.println("\nProduct Id\t\tName\t\t\tQuantity\t\t\tunit price\t\t\tTotal");
		System.out.println("________________________________________________________________________________________________________________________________");
		System.out.println(pid+"\t\t\t"+name+"\t\t\t"+qty+"\t\t\t\t"+pr+"\t\t\t\t"+total);
		System.out.println(product_id+"\t\t\t"+name+"\t\t\t"+quantity+"\t\t\t\t"+unit_pr+"\t\t\t\t"+total);
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t\tNet. Amount"+"\t\t\t\t"+(total+total));
		
	}
}
public class bill
{

	public static void main(String[] args) 
	{
		product1 p1=new product1();
		product2 p2=new product2();
		p1.total();
		p2.total();
		p2.display();
	}

}


