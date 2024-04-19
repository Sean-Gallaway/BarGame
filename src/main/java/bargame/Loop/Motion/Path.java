package bargame.Loop.Motion;

import bargame.Gui.Animated;
import bargame.Gui.Sprite;
import bargame.Loop.Cycle;
import bargame.Loop.Motion.Coord;

import java.util.ArrayList;

public class Path implements Animated {
    Animated subject;
    ArrayList<Segment> pathCoordinates = new ArrayList<>();
    int current, stepCount;

    public Path (Animated subject, Cycle animationCycle, Segment[] segments, int stepCount) {
        this.subject = subject;
        this.stepCount = stepCount;
        animationCycle.addSubject(this);
        for (Segment s : segments) {
            pathCoordinates.add(s);
        }
        current = 0;
        pathCoordinates.add(new Segment(pathCoordinates.get(pathCoordinates.size()-1).end, pathCoordinates.get(0).start));
        segments[0].start(stepCount);
    }

    @Override
    public void animate() {
        if (subject instanceof Sprite) {
            if (!pathCoordinates.get(current).isStarted()) {
                current++;
                if (current >= pathCoordinates.size()) {
                    current = 0;
                }
                pathCoordinates.get(current).start(stepCount);
            }
            pathCoordinates.get(current).progress((Sprite)subject);
        }
    }

    @Override
    public boolean endOfLoop() {
        return false;
    }
}
