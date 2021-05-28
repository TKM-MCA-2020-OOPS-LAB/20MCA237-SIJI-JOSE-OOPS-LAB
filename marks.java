package myproject;
import java.util.*;

class student
{
	String name ;
	int sid,eng,math ;
	public  student()
	{
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Name : ");
		 name = x.next();
		 System.out.println("Enter student ID : ");
		 sid= x.nextInt();
		 System.out.println("Enter Marks in English :");
		 eng = x.nextInt();
		 System.out.println("Enter Marks in Maths :");
		 math = x.nextInt();
		
	}
}

class sports extends student
{
	String rank;
	
	public sports()
	{
		Scanner y = new Scanner(System.in);
		System.out.println("Enter rank");
		 rank = y.next();
	}
}

class result extends sports
{
	
	public void display()
	{
		System.out.println("Name : " + name);
		System.out.println("sid : " + sid);
		System.out.println("***ACCADEMIC***");
		System.out.println("English :" + eng);
		System.out.println("Maths :" + math);
		System.out.println("***SPORTS***");
		System.out.println("Sports Rank : " + rank);
	}
}
public class marks {
	public static void main(String[] args)
	{
		result student = new result();
		student.display();
		
		
	}
}