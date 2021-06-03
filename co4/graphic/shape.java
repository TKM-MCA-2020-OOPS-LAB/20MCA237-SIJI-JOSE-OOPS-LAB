package graphic;
import java.util.Scanner;
public interface shape{
	 void input();
	 void area();
	
}
class Circle implements shape
{
    int r ;
    double pi = 3.14, ar ;
    Scanner cl=new Scanner(System.in);
	public void input() {
		System.out.println("enter radius:");
		r=cl.nextInt();
	}
    public void area()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }
    
}
class Rectangle extends Circle
{
    int x, y ;
    double ar;
    Scanner rl=new Scanner(System.in);
	public void input() {
		System.out.println("enter  length and breadth :");
		x=rl.nextInt();
		y=rl.nextInt();
	}
    public void area()
    {
        ar = x* y;
        System.out.println("Area of rectangle:"+ar);
    }
    
static class Triangle extends Rectangle
{
    int h , b ;
    double ar;
    Scanner tl=new Scanner(System.in);
	public void input() {
		System.out.println("enter breadth and height :");
		h=tl.nextInt();
		b=tl.nextInt();
	}
    public void area()
    {
        ar = h * b*1/2;
        System.out.println("Area of triangle:"+ar);
    }
 static class Square 
 {
	 int s;
	 double ar;
	 Scanner sq=new Scanner(System.in);
	 public void input() {
			System.out.println("enter one side:");
			s=sq.nextInt();
		}
	 
	 public void area()
	 {
		 ar=s*s;
		 System.out.println("Area of square:"+ar);
	 }
 }
}
}


