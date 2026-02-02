import java.util.Random;

public class Poker {
    public static void play() {
        DiceThrow("Gép");
        DiceThrow("Ember");
    }
    private static void DiceThrow(String role) {
        Random random = new Random();
        System.out.println(
            (random.nextInt(6)+1) + " " +
            (random.nextInt(6)+1) + " " +
            (random.nextInt(6)+1) + " " +
            (random.nextInt(6)+1) + " " +
            (random.nextInt(6)+1) + " " +
            (random.nextInt(6)+1)
        );
    }

}
