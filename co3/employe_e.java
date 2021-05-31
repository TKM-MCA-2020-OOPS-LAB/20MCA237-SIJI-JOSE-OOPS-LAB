package myproject;
import java.util.*;
public class employe_e {
	int empid;
	String name;
	float salary;
	String address;
	
	public employe_e(int id, String name,float salary, String address ) {
		this.empid = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		
	}
	
static class Teacher extends employe_e{
        String Department;
        String Subject;    
     public Teacher(int id, String name, float salary, String address, String dept, String subj) {
        super(id, name, salary, address);
			
			
		this.Department = dept;
		this.Subject = subj;
		}
		public void Display() {
			
			System.out.println("\nId: "+empid);
			System.out.println("Name: "+name);
			System.out.println("Salary: "+salary);
			System.out.println("Address: "+address);
			System.out.println("Department: "+Department);
			System.out.println("Subject: "+Subject);
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,count, id_;
		float sal;
		String nam,adr,dep,sub;
		

		System.out.println("Enter the number of records to be stored:");
		count = sc.nextInt();
        
		Teacher[] e = new Teacher[count];
      
		
		for( i=0; i<count; i++)
			{
			
			   System.out.println("Enter the ID:");
			    id_= sc.nextInt();
			   System.out.println("Enter the name:");
			    nam= sc.next();
			   System.out.println("Enter the salary:");
			    sal= sc.nextFloat();
			   System.out.println("Enter the address:");
			    adr= sc.next();
			   System.out.println("Enter the department:");
			    dep= sc.next();
			   System.out.println("Enter the subject:");
			    sub= sc.next();
	        
			   e[i] = new Teacher(id_,nam,sal,adr,dep,sub);
			
			}
		System.out.println("----EMPLOYEE DETAILS-----");
		for( i=0; i<count; i++)
	        {
			   e[i].Display();
		    }         
	}

}