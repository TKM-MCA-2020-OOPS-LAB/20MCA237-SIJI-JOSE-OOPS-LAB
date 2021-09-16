import java.net.*;
import java.io.*;
public class server {
public static void main(String args[])throws Exception{
	try {
ServerSocket ss=new ServerSocket(2665);
System.out.println("Server is waiting for the client..!!!");
Socket sk=ss.accept();
System.out.println("Connection established...!!");
InputStreamReader isr=new InputStreamReader(sk.getInputStream());
BufferedReader br=new BufferedReader(isr);
String s=br.readLine();
System.out.println("Message is"+s);
PrintWriter pw=new PrintWriter(sk.getOutputStream(),true);
pw.println("Server: Hello Client!!!");
pw.close();
}
catch(Exception e) {}
}
}