package play;

public class StreamingPlayer implements Playable {
    public void play(Action action) {
        if (action != Action.PLAY) {
            System.out.println("\nPlaying stream\n");
        } else if (action == Action.PLAY) {
            System.out.println("\nstream is already playing\n");
        }
    }

    public void stop(Action action) {
        if (action != Action.STOP) {
            System.out.println("\nStopping stream\n");
        } else if (action == Action.STOP) {
            System.out.println("\nstream is already stopped\n");
        }
    }

    public void pause(Action action) {
        if (action == Action.PLAY) {
            System.out.println("\nPausing stream\n");
        } else if (action == Action.PAUSE) {
            System.out.println("\nstream is already paused\n");
        } else {
            System.out.println("\nnstream is not playing\n");
        }
    }
}
