package play;

public interface Playable {
    void play(Action action);

    void pause(Action action);

    void stop(Action action);
}
