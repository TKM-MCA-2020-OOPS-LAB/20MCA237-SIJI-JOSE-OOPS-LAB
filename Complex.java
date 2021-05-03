package myproject;
public class Complex{
   double real, img ;
   Complex(double r, double i){
	this.real = r;
	this.img = i;
   }	
   public static Complex sum(Complex c1, Complex c2)
   {
        Complex temp = new Complex(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
    public static void main(String args[]) {
	Complex c1 = new Complex(6, 2);
	Complex c2 = new Complex(1, -1);
        Complex temp = sum(c1, c2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
    }
}
