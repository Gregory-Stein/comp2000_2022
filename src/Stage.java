//<<<<<<< HEAD

//My old code
//     Grid grid;
//     Actor dog;
//     Actor cat;
//     Actor bird;

// public class Stage {
//     Grid grid = new Grid();
//     dog = new Dog(grid.cells[0][0]);
//     cat = new Cat(grid.cells[1][10]);
//     bird = new Bird(grid.cells[15][9]);
// }

// public void paint(Graphics g, Point mouseLoc){
//     grid.paint(g, mouseLoc);
//     //rest of the Actors go here, pretty much the same. Except no mouseLoc.
// }

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Stage {
  Grid grid;
  Actor cat;
  Actor dog;
  Actor bird;
ArrayList<Actor> cast;

  public Stage() {
    grid = new Grid();
    cast = new ArrayList<Actor>();

    cast.add(cat = new Cat(grid.cellAtColRow(0, 0)));
    cast.add(dog = new Dog(grid.cellAtColRow(0, 15)));
    cast.add(bird = new Bird(grid.cellAtColRow(12, 9)));

  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for(Actor a: cast){
      a.paint(g);
    }
    // cat.paint(g);
    // dog.paint(g);
    // bird.paint(g);
  }
}
