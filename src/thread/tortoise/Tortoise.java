package thread.tortoise;

public class Tortoise extends Thread {
    private static final int MILESTONE = 5;

    public Tortoise() {
        super("Tortoise");
    }
}
