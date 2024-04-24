package play;

public class CDPlayer implements Playable {
    public void play(Action action) {
        if (action != Action.PLAY) {
            System.out.println("\nPlaying cd file\n");
        } else if (action == Action.PLAY) {
            System.out.println("\ncd file is already playing\n");
        }
    }

    public void stop(Action action) {
        if (action != Action.STOP) {
            System.out.println("\nStopping cd file\n");
        } else if (action == Action.STOP) {
            System.out.println("\ncd file is already stopped\n");
        }
    }

    public void pause(Action action) {
        if (action == Action.PLAY) {
            System.out.println("\nPausing cd file\n");
        } else if (action == Action.PAUSE) {
            System.out.println("\ncd file is already paused\n");
        } else {
            System.out.println("\ncd file is not playing\n");
        }
    }

}
