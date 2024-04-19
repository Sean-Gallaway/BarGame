package bargame.Loop.Motion;

import bargame.Gui.Sprite;

public class Segment {
    Coord start;
    Coord current;
    Coord end;
    double stepX, stepY;
    boolean started;

    public Segment (double x1, double y1, double x2, double y2) {
        start = new Coord(x1, y1);
        end = new Coord(x2, y2);
    }

    public Segment (Coord start, Coord end) {
        this.start = start;
        this.end = end;
    }

    public void start (int stepCount) {
        current = new Coord(start.x, start.y);
        stepX = (end.x - start.x) / stepCount;
        stepY = (end.y - start.y) / stepCount;
        started = true;
    }

    public boolean isStarted () {
        return started;
    }

    public void progress (Sprite sprite) {
        current.x += stepX;
        current.y += stepY;
        sprite.setLayoutX(current.x);
        sprite.setLayoutY(current.y);
        started = current.x != end.x || current.y != end.y;
    }
}
