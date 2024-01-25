package bargame.Loop;

import bargame.Gui.Animated;

public class AnimationThread extends Thread {
    Cycle[] animationCycleGroups;

    /**
     * Starts an animation thread, an animation thread will create a cycle that will call the subjects .animate() method at the desired framerate.
     *
     */
    public AnimationThread (FPS[] targetedFramesPerSeconds) {
        animationCycleGroups = new Cycle[targetedFramesPerSeconds.length];
        for (int a = 0; a < targetedFramesPerSeconds.length; a++) {
            animationCycleGroups[a] = new Cycle(targetedFramesPerSeconds[a]);
        }
    }

    public void addSubject (Animated animated, FPS fps) {
        for (Cycle cycle : animationCycleGroups) {
            if (cycle.getFPS() == fps) {
                cycle.addSubject(animated);
                return;
            }
        }
    }

    public void removeSubject (Animated animated, FPS fps) {
        for (Cycle cycle : animationCycleGroups) {
            if (cycle.getFPS() == fps) {
                cycle.removeSubject(animated);
                return;
            }
        }
    }

    @Override
    public void run () {
        while (!Thread.currentThread().isInterrupted()) {
            for (int a = 0; a < animationCycleGroups.length; a++) {
                if (!animationCycleGroups[a].isRunning()) {
                    animationCycleGroups[a].start();
                }
            }
        }
    }

    @Override
    public void interrupt () {
        for (int a = 0; a < animationCycleGroups.length; a++) {
            animationCycleGroups[a].stop();
        }
        super.interrupt();
    }
}
