import java.applet.Applet;
import java.awt.Graphics;
public class draw extends Applet{
public void paint(Graphics g){		
g.drawLine(30,30, 300, 30);
g.drawRect(60, 80, 200, 40);
g.drawOval(200, 200, 200, 160);
}
}