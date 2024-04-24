package play;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. CD Player\n2. MP3 Player\n3. Streaming Player");
        System.out.print("Enter your choice: ");
        int choicePlayer = scanner.nextInt();
        switch (choicePlayer) {
            case 1:
                remote(new CDPlayer());
                break;
            case 2:
                remote(new MP3Player());
                break;
            case 3:
                remote(new StreamingPlayer());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void remote(Playable player) {
        Action action = null;
        while (true) {
            System.out.println("1. Play\n2. Pause\n3. Stop\n");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    player.play(action);
                    action = Action.PLAY;
                    break;
                case 2:
                    player.pause(action);
                    action = Action.PAUSE;
                                        break;

                case 3:
                    player.stop(action);
                    action = Action.STOP;
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}
