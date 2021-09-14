import java.io.*; 
class copy{ 
      public static void main(String args[])throws IOException { 
               FileInputStream fr =new FileInputStream("new.txt"); 
               FileOutputStream fw=new FileOutputStream("copy.txt") ; 
               System.out.println(".....File is Copied...."); 
               int c; 
               while((c=fr.read())!=-1) 
               fw.write((char)c); 
               fr.close(); 
               fw.close(); 
          } 
 } 

