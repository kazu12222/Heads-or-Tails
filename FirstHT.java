import java.util.*;

public class FirstHT {
    public static void main(String[] args) {
        int cnt = 0, cnt2 = 0;
        System.out.println("Tossing a coin...");
        String[] twoside = { "Heads", "Tails" };
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            String ans = twoside[rand.nextInt(2)];
            System.out.println("Round " + (i + 1) + ": " + ans);
            if (ans == twoside[0]) {
                cnt++;
            } else
                cnt2++;
        }
        System.out.println("Heads:" + cnt + ",Tails:" + cnt2);
    }

}