import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание№1
        int[] first = new int[]{1,2,3};
        float[] two = {1.57f, 7.654f, 9.986f};
        int[] three = new int[12];
        //Задание№2
        for (int i=0; i < first.length; i++) {
            if (i>0){
                System.out.println(",");
            }
            System.out.println(first[i]);
        }
        System.out.println();
        //Задание№3
        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        //Задание№4
        int [] find = {1,2,3};
        for (int qr =0; qr< find. length; qr++){
            if (find[qr] % 2 !=0){
                find[qr] +=1;}}
        System.out.println(Arrays.toString(three));
    }
}