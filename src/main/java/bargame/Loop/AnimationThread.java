package bargame.Loop;

import bargame.App;
import bargame.Gui.Animated;
import java.util.ArrayList;

public class AnimationThread extends Thread {
    ArrayList<Cycle> animationCycleGroups = new ArrayList<>();

    /**
     * Starts an animation thread, an animation thread will create a cycle that will call the subjects .animate() method at the desired framerate.
     */
    public AnimationThread (FPS[] targetedFramesPerSeconds) {
        App.animationThreads.add(this);
        for (FPS fps : targetedFramesPerSeconds) {
            animationCycleGroups.add(new Cycle(fps));
        }
    }

    /**
     * Adds an animation Cycle to this thread to manage.
     *
     * @param fps   FPS that the cycle should be.
     */
    public void addCycle (FPS fps) {
        for (Cycle cycle : animationCycleGroups) {
            if (cycle.getFPS() == fps) {
                System.out.println("Cycle of stated FPS already exists in this Thread.");
                return;
            }
        }
        animationCycleGroups.add(new Cycle(fps));
    }

    /**
     * Removes an animation Cycle from this Thread.
     *
     * @param fps   targeted FPS to remove a Cycle by.
     */
    public void removeCycle (FPS fps) {
        for (int a = 0; a < animationCycleGroups.size(); a++) {
            if (animationCycleGroups.get(a).getFPS() == fps) {
                animationCycleGroups.get(a).stop();
                animationCycleGroups.remove(a);
                return;
            }
        }
        System.out.println("Specified Cycle does not exist in this Thread.");
    }

    /**
     * Add an animation object to a specified FPS group
     *
     * @param animated  The object to be added
     * @param fps       The FPS group to add it to.
     */
    public void addSubject (Animated animated, FPS fps) {
        for (Cycle cycle : animationCycleGroups) {
            if (cycle.getFPS() == fps) {
                cycle.addSubject(animated);
                return;
            }
        }
        System.out.println("Specified FPS group does not exist in this Thread.");
    }

    /**
     * Remove an animated object from a specified FPS group.
     *
     * @param animated  The object to be removed
     * @param fps       The FPS group to remove it from.
     */
    public void removeSubject (Animated animated, FPS fps) {
        for (Cycle cycle : animationCycleGroups) {
            if (cycle.getFPS() == fps) {
                cycle.removeSubject(animated);
                return;
            }
        }
        System.out.println("Node is not apart of the specified FPS group.");
    }

    /**
     * Override of the run method. If a cycle animation timer is not started, start it.
     */
    @Override
    public void run () {
        while (!Thread.currentThread().isInterrupted()) {
            for (Cycle animationCycleGroup : animationCycleGroups) {
                if (!animationCycleGroup.isRunning()) {
                    animationCycleGroup.start();
                }
            }
        }
    }

    /**
     * Override of the interrupt method, where in addition to interrupting the thread, stop all the Cycle animation timers.
     */
    @Override
    public void interrupt () {
        for (Cycle animationCycleGroup : animationCycleGroups) {
            animationCycleGroup.stop();
        }
        super.interrupt();
    }
}
