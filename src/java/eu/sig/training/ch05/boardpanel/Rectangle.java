package eu.sig.training.ch05.boardpanel;

import java.awt.Point;

public class Rectangle{
    private final Point point;
    private final int width;
    private final int height;
    public Rectangle(Point point, int width, int height){
        this.point = point;
        this.width = width;
        this.height = height;
    }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public Point getPosition() { return point; }
}