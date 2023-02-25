package exercice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 36, 9, 8};

        // Utilisation de forEach() avec une expression lambda en appelant une méthode séparée
        iterateArray(arr);
    }

    private static void iterateArray(int[] arr) {
        Arrays.stream(arr).forEach(element -> System.out.println(element));
    }
}
