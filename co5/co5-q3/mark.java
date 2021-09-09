
---smiley condition is not checked----

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class mark extends Applet implements ActionListener{
Button b1;
TextField t1,t2,t3,t4,t5,t6;
Label l1,l2,l3,l4,l5,l6;
       public void init(){
l1=new Label("Maths");
l1.setBounds(100,40,100,20);
t1=new TextField();
t1.setBounds(210,40,100,20);

l2=new Label("English");
l2.setBounds(100,80,100,20);
t2=new TextField();
t2.setBounds(210,80,100,20);

l3=new Label("Hindi");
l3.setBounds(100,120,100,20);
t3=new TextField();
t3.setBounds(210,120,100,20);

l4=new Label("Computer");
l4.setBounds(100,160,100,20);
t4=new TextField();
t4.setBounds(210,160,100,20);

l5=new Label("Science");
l5.setBounds(100,200,100,20);
t5=new TextField();
t5.setBounds(210,200,100,20);

l6=new Label("Result(%)");
l6.setBounds(100,240,100,20);
t6=new TextField();
t6.setBounds(210,240,100,20);


b1=new Button("FIND");
b1.setBounds(210,280,60,50);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(b1);

b1.addActionListener(this);

setLayout(null);
   }
public void actionPerformed(ActionEvent ev){
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=Integer.parseInt(t3.getText());
int d=Integer.parseInt(t4.getText());
int e=Integer.parseInt(t5.getText());

      if(ev.getSource()==b1){
      int sum=(a+b+c+d+e)/5;
      t6.setText(""+sum);
      }

}

}
/*
<applet code="mark.class" width="500" height="300">
</applet>
*/