import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="house.class" width="1200" height="1200"></applet> */
public class house extends Applet implements MouseListener{
int x,y;
public void init(){
addMouseListener( this);
    }
public void paint(Graphics g){
g.setColor(Color.yellow);
g.fillRect(20,100,100,200);
g.setColor(Color.green);
g.fillArc(20,60,100,80,0,180);
g.setColor(Color.blue);
g.fillRect(50,200,40,100);
 if(x>200 && x<300 && y>200 && y<300)
        {
            g.setColor(Color.red);
            g.fillRect(50,200,40,100);
        }

}  
    public void mouseClicked(MouseEvent e)
    {

    }
    public void mouseEntered(MouseEvent e)
    {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        repaint();
    }
    public void mouseReleased(MouseEvent e)
    {

    }

}