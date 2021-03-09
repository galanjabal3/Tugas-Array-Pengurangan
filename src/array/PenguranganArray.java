package array;

import java.util.Arrays;

public class PenguranganArray {

    public static void main(String[] args) {
        int[] arrayAngka1 = {7, 12, 3, 2, 12, 2, 20, 56, 12, 90};
        int[] arrayAngka2 = {5, 6, 13, 2, 9, 1, 15, 14, 6, 99};

        // pengurangan dua buah array

        int[] arrayHasil1 = kurangArray(arrayAngka1, arrayAngka2);
        System.out.println("~~~~Pengurangan~~~~");
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil1, "hasil 1");
    }
    private static int[] kurangArray(int[] arrayInt1, int[] arrayInt2){
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i =0; i < arrayInt1.length; i++){
            arrayHasil[i] = arrayInt1[i] - arrayInt2[i];
        }
        return arrayHasil;
    }

    private static void printArray(int[] dataArray, String message){
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }
}
