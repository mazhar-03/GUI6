package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Garment g1 = new Garment(Size.S, 130, "Cotton");
        Garment g2 = new Garment(Size.M, 140, "Leather");
        Garment g3 = new Garment(Size.L, 95, "Jean");
        Garment g4 = new Garment(Size.XL, 60, "Cotton");

        Garment[] u = new Garment[]{g3,g1,g4,g2};
        Arrays.sort(u);
        for (Garment i : u) {
            System.out.println(i);
        }

        System.out.println("SORTING BY PRICE");

        Arrays.sort(u, (x, y) -> {
            return Integer.compare(x.getPrice(), y.getPrice());
        });
        for (Garment i : u) {
            System.out.println(i);
        }
    }
}
