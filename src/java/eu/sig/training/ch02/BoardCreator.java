package eu.sig.training.ch02;

public class BroadCreator {
    private Square[][] grid;
    private Broad board;
    private int width;
    private int height;
    BroadCreator(Square[][] grid){
        assert grid != null;
        this.grid = grid;
        this.broad = new Broad(grid);
        this.width = broad.getWidth();
        this.height = broad.getHeight();
    }
    Board create(){
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Square square = grid[x][y];
                for (Direction dir : Direction.values()) {
                    setLink(square, dir, x, y);
                }
            }
        }
        return this.board;
    }

    private void setLink(Square square, Direction dir, int x, int y) {
        int dirX = (width + x + dir.getDeltaX()) % width;
                    int dirY = (height + y + dir.getDeltaY()) % height;
                    Square neighbour = grid[dirX][dirY];
                    square.link(neighbour, dir);
    }
}