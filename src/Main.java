import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] weights = new int[]{90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);

        }
        System.out.println("Задание №1");
        int[] winner = new int [3];
        winner[0] = 1;
        winner[1] = 2;
        winner[2] = 3;
        float[] second = {1.57f, 7.654f, 9.986f};
        int[] kg = new int [3];
        kg[0] = 90;
        kg[1] = 67;
        kg[2] = 33;
        int cat = kg[0];
        int dog = kg[1];
        int parret = kg[2];
        System.out.println("Задание №2");
        for (int i = 0; i < winner.length; i++) {
            if (i == winner.length - 1) {
                System.out.println(winner[i]);
                break;
            }
            System.out.println(winner[i] + ",");
        }
        System.out.println();
        for (int r=0; r < second.length; r++) {
            if (r == second.length - 1) {
                System.out.println(second[r]);
                break;
            }
            System.out.println(second[r] + ",");
        }
        System.out.println();
        System.out.println(cat + "," + dog + "," + parret);
        System.out.println("Задание №3");
        for (int w = 2; w <= winner.length; w--) {
            if (w == 0) {
                System.out.println(winner[w]);
                break;
            }
            System.out.println(winner[w] + ",");
        }
        System.out.println();
        for (int s = 2; s <= second.length; s--) {
            if (s == 0){
                System.out.println(second[s]);
                break;
            }
            System.out.println(second[s] + ",");
        }
        System.out.println();
        for (int a = 2; a <= kg.length; a-- ) {
            if (a == 0) {
                System.out.println(kg[a]);
                break;
            }
            System.out.println(kg[a] + ",");
        }
        System.out.println("Задание №4");
        for (int f = 0; f < winner.length; f++) {
            if (winner[f] % 2 == 0){
            } else {
                winner[f] +=1;
            }
        }
        System.out.println(Arrays.toString(winner));
    }
}
