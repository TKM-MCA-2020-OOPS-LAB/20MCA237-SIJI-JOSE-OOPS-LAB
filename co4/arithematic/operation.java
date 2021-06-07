package arithematic;
import java.util.Scanner;
interface math{
	void input();
	void add();
	void sub();
	void div();
	void mult();
}
public class operation implements math {
    double a,b,ad,sb,ml,di;
    Scanner sc= new Scanner(System.in);
	public void input() {
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
        
	
    }
	public void add() {
		ad=a+b;
		System.out.println("Addition :"+ad);
	}
	public void sub() {
		sb=a-b;
		System.out.println("Subtraction:"+sb);
	}
	public void mult() {
		ml=a*b;
		System.out.println("Multiplication:"+ml);
	}
	public void div() {
		di=a/b;
		System.out.println("Divison:"+di);
	}
}
	