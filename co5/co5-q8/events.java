import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
/* <applet code="events.class" width ="500" height="700"></applet> */
public class events extends Frame implements KeyListener{
Label l;
TextArea a;
public events(){
l=new Label();
l.setBounds(60,100,420,60);
a=new TextArea();
a.setBounds(60 , 160 , 200 , 200);
a.addKeyListener(this);
add(l);
add(a);
setSize(800,800);
setLayout(null);
setVisible(true);
}
public void keyPressed( KeyEvent e ) {
}
public void keyReleased( KeyEvent e )
{
String t=a.getText();
String w[]=t.split("\\s");
l.setText("No. of words: "+ w.length +" No. of Characters: "+ t.length() );
}
public void keyTyped( KeyEvent e ) {
}
public static void main(String[] args) {
new events();
}  
}