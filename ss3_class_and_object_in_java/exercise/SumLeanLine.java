package ss3_class_and_object_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumLeanLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hàng: ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cột: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập số vào phần tử [" + i + "][" + j + "]");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == m - 1) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng của đường chéo trong mảng vuông là " + sum);
    }
}
