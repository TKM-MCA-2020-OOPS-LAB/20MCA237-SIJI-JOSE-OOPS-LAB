import java.net.*;
import java.io.*;
public class client {
public static void main(String args[])throws Exception{
	try {
	  Socket sk=new Socket("localhost",2665);
	  PrintWriter pw=new PrintWriter(sk.getOutputStream(),true);
	  pw.println("Client: Hello Server!!!");
	 
InputStreamReader isr=new InputStreamReader(sk.getInputStream());
BufferedReader br=new BufferedReader(isr);
String s1=br.readLine();
System.out.println(" Message is "+s1);
pw.close();
sk.close();
	}
	catch(Exception e) {}
}
}
