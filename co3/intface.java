package myproject;
interface Shape
{
    void input();
    void area();
    void perimeter();
}
class Circle implements Shape
{
    int r = 0;
    double pi = 3.14, ar = 0,pr =0;
    public void input()
    {
        r = 5;
    }
    public void area()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }
    public void perimeter()
    {
    	pr=2*pi*r;
    	System.out.println("Perimeter of circle:"+pr);
    }
}
class Rectangle extends Circle
{
    int l = 0, b = 0;
    double ar,pr;
    public void input()
    {
        super.input();
        l = 6;
        b = 4;
    }
    public void area()
    {
        super.area();
        ar = l * b;
        System.out.println("Area of rectangle:"+ar);
    }
    public void perimeter()
    {
        super.perimeter();
        ar = 2*l + 2*b;
        System.out.println("Perimeter of rectangle:"+pr);
    }
}
public class intface
{
public static void main(String[] args)
{
    Rectangle obj = new Rectangle();
    obj.input();
    obj.area();
    obj.perimeter();
}
}
