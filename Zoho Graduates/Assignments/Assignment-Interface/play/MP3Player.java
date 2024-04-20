package play;

public class MP3Player implements Playable {
    public void play(Action action) {
        if (action != Action.PLAY) {
            System.out.println("\nPlaying mp3 file\n");
        } else if (action == Action.PLAY) {
            System.out.println("\nmp3 file is already playing\n");
        }
    }

    public void stop(Action action) {
        if (action != Action.STOP) {
            System.out.println("\nStopping mp3 file\n");
        } else if (action == Action.STOP) {
            System.out.println("\nmp3 file is already stopped\n");
        }
    }

    public void pause(Action action) {
        if (action == Action.PLAY) {
            System.out.println("\nPausing mp3 file\n");
        } else if (action == Action.PAUSE) {
            System.out.println("\nmp3 file is already paused\n");
        } else {
            System.out.println("\nmp3 file is not playing\n");
        }
    }

}
