// 12S24056-ENJEL AYUTI NAPITUPULU
// 12S24033-DOY SIMANJUNTAK

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double harga;
        double total;
        double hargatermurah;
        double totalakhir;

        harga = Double.parseDouble(input.nextLine());
        total = harga;
        hargatermurah = harga;
        while (harga != 0) {
            if (hargatermurah < harga) {
                hargatermurah = hargatermurah;
            } else {
                hargatermurah = harga;
            }
            harga = Double.parseDouble(input.nextLine());
            total = total + harga;
        }
        if (total >= 100) {
            totalakhir = total - hargatermurah;
        } else {
            totalakhir = total;
        }
        System.out.println(toFixed(totalakhir,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

