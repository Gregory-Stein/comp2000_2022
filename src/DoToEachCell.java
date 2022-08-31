public void doToEachCell(Consumer<Cell> func) {
    // My job to make the body
    //Currently most of this is nonsense, I got to do a combination of tearing down and reslotting code into the right places.

    public Optional<Cell> cellAtPoint(Point p) {
        for(int i=0; i < cells.length; i++) {
          for(int j=0; j < cells[i].length; j++) {
            //Here is where we have the lambda function do it's thing, I think.
            if(cells[i][j].contains(p)) {
              return Optional.of(cells[i][j]);
            }
          }
        }
    }
}
