import java.applet.Applet;
import java.awt.*;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(50, 50, 100, 50); // Draw rectangle
        
        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 100); // Draw filled oval
        
        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 250, 200); // Draw line
    }
}
