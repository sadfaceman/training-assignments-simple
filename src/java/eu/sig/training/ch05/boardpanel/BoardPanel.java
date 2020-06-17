package eu.sig.training.ch05.boardpanel;

import java.awt.Graphics;
import java.util.List;

public class BoardPanel {
    @SuppressWarnings("unused")
    // tag::render[]
    /**
     * Renders a single square on the given graphics context on the specified
     * rectangle.
     * 
     * @param square
     *            The square to render.
     * @param g
     *            The graphics context to draw on.
     * @param r
     *            The r Rectangnle with Point and size data.
     */
    private void render(Square square, Graphics g, Rectangle r) {
        Point p = r.getPosition();
        square.getSprite().draw(g, p.x, p.y, r.getWidth(), r.getHeight());
        for (Unit unit : square.getOccupants()) {
            unit.getSprite().draw(g, r);
        }
    }
    // end::render[]

    private class Sprite {
        @SuppressWarnings("unused")
        public void draw(Graphics g, Rectangle r) {

        }
    }

    private class Unit {
        public Sprite getSprite() {
            return null;
        }
    }

    private class Square extends Unit {

        public List<Unit> getOccupants() {
            return null;
        }

    }

}
