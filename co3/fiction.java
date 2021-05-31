package myproject;
import java.util.Scanner;
class publisher {
	String pname;
	Scanner sc=new Scanner(System.in);
	publisher()
	{
		System.out.println("Enter publisher name");
		pname=sc.next();
	}
}
class book extends publisher {
	String author;
	int cost;
	Scanner sc=new Scanner(System.in);
	book() {
		System.out.println("Enter author");
		author=sc.next();
		System.out.println("Enter cost");
		cost=sc.nextInt();
	}
}
class literature extends book {
	String edition;
	Scanner sc=new Scanner(System.in);	
	literature() {
		System.out.println("Enter which edition");
		edition=sc.next();
	}
	void display()
	{
		System.out.println("******BOOK DETAILS*******");
		System.out.println("Publisher "+pname);
		System.out.println("Author "+author);
		System.out.println("Cost"+cost);	
	}
}
public class fiction extends book {
	String edition;
	Scanner sc=new Scanner(System.in);	
	fiction() {
		System.out.println("Enter which edition");
		edition=sc.next();
	}
	void display()
	{
		System.out.println("Publisher "+pname);
		System.out.println("Author "+author);
		System.out.println("Cost "+cost);
		
	}
	public static void main(String[] args) {
		int li,fn,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of  literature books");
		li=sc.nextInt();
		literature l[]=new literature[li];
		for(int i=0;i<li;i++) {
			l[i]=new literature();
		}
		System.out.println("Enter no. of fictions books");
		fn=sc.nextInt();
		book f[]=new book[fn];
		for(int i=0;i<fn;i++) {
			f[i]=new book();
		}
		System.out.println("\"\\nSelect the Genre(L/F):\\nL - Literature\\nF - Fiction");
		s=sc.nextInt();
		if(s==1) {
			for(int i=0;i<fn;i++) {
				l[i].display();
			}
	}
		else
			System.out.println("no ");
	sc.close();
	}
}