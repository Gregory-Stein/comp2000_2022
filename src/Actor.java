
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public abstract class Actor {
  Color color;
  Cell loc;
  ArrayList<Polygon> polys;

  public void paint(Graphics g) {
    
    for(Polygon p: polys){
      g.setColor(color);
      g.fillPolygon();
      g.setColor(Color.GRAY);
      g.drawPolygon();
    }
    //g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    //g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
  }

}
