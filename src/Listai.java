import java.util.ArrayList;
import java.util.Scanner;


public class Listai {
    public static void main(String[] args) {

        ArrayList<Integer> skaicius = new ArrayList<>();

        skaicius.add(4);
        skaicius.add(11);
        skaicius.add(3);
        skaicius.add(26);
        skaicius.add(17);
        skaicius.add(20);

        System.out.println("skaicius = " + skaicius);


        System.out.println(didesniUz(skaicius));


    }
    public static int didesniUz(ArrayList<Integer> skaicius) {
        int didesni = 0;
        for (int i = 0; i < skaicius.size(); i++) {
            if (skaicius.get(i) > 10) {
                didesni++;
            }

        }
        return didesni;
    }
}
