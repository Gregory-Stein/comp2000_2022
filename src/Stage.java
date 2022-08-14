
    Grid grid;
    Actor dog;
    Actor cat;
    Actor bird;

public class Stage {
    Grid grid = new Grid();
    dog = new Dog(grid.cells[0][0]);
    cat = new Cat(grid.cells[1][10]);
    bird = new Bird(grid.cells[15][9]);
}

public void paint(Graphics g, Point mouseLoc){
    grid.paint(g, mouseLoc);
    //rest of the Actors go here, pretty much the same. Except no mouseLoc.
}