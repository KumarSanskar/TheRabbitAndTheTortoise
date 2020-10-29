package thread.tortoise;

import javax.swing.*;

public class Tortoise extends Thread {
    private static final int MILESTONE = 5;

    public Tortoise() {
        super("Tortoise");
    }

    @Override
    public void run() {
        for (int i = 0; i < MILESTONE; i++) {
            switch (i) {
                case 0:
                    System.out.println("The tortoise has started from the start line!");
                    break;
                case 1:
                    System.out.println("The tortoise has reached The Cool River!");
                    break;
                case 2:
                    System.out.println("The tortoise has reached The Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The tortoise has reached The Big Oak Tree!");
                    System.out.println("The tortoise is leading and hence is going to sleep!");
                    try {
                        Thread.sleep(18000L);
                    } catch (InterruptedException e) {
                        System.out.println("Tortoise's sleep got interrupted!");
                    }
                    break;
                case 4:
                    System.out.println("The tortoise has reached the finish line!");
                    break;
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.err.println("The tortoise has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(null, "The tortoise has completed the race!", "tortoise", JOptionPane.OK_CANCEL_OPTION);
    }
}
