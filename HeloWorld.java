import java.applet.Applet;
import java.awt.Graphics;

public class HeloWorld extends Applet {
    public void paint(Graphics g) {
        g.drawString("Helo world!", 50, 25);
    }
}
/*
<applet code="HeloWorld.class" height=300 width=200>
</applet>
*/