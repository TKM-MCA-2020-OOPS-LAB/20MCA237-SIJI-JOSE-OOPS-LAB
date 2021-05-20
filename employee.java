package myproject;
import java.util.Scanner;
public class employee {
	int empno;
	String empname;
	double empsalary;
	
	void getinfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee number: ");
		empno=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter employee name: ");
		empname=sc1.nextLine();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter employee salary: ");
		empsalary=sc2.nextDouble();
	}
	void display()
	{
		System.out.println("Employee no: "+empno);
		System.out.println("Employee name: "+empname);
		System.out.println("Salary: "+empsalary);
		
	}
	public static void main(String args[])
	{
		int n;
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter the no of employees: ");
		n=sc3.nextInt();
		employee e[]=new employee[n];
		
		for(int i=0;i<n;i++)
		{
			e[i]=new employee();
			e[i].getinfo();
		}
		System.out.println("The employee details are:");
		for(int i=0;i<n;i++)
		{
			e[i].display();
		}
		
		int no,flag=0;
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter employee no to display details: ");
		no=sc4.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(no==e[i].empno)
			{
				e[i].display();
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Not found");
		}
	}
}