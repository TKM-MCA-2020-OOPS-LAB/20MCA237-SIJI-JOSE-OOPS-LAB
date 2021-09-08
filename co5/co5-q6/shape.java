import java.applet.*;
import java.awt.*;    
import java.awt.event.*; 
/* <applet code ="shape.class" width=700 height=900></applet> */   
public class shape extends Applet implements ItemListener{
     String figure;
     Choice ch = new Choice();
          public void init(){
	      ch.add("Rectangle");
	      ch.add("Circle");
	      ch.add("Triangle");
	      ch.add("Square");
	      add(ch);
	
        ch.addItemListener(this);
}
     public void itemStateChanged(ItemEvent e){
         figure = ch.getSelectedItem();
         repaint();
}
   public void paint(Graphics g){
          g.drawString("Select any shape",40,10);
          if (figure.equals("Rectangle")){
	          g.drawRect(50,50,330,120);
        }
          if (figure.equals("Square")){
	          g.drawRect(50,50,100,100);
        }
	     if (figure.equals("Triangle")){
	          int x[] = {200,300,100};
   	          int y[] = {200,300,300};
  	          int n = 3;
	          g.drawPolygon(x, y, n);
        }
     
	        if (figure.equals("Circle")){
	          g.drawOval(20, 120, 200, 160);
       }
   }
}