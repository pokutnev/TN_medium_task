import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите массив:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        arr = BinarySearch.bubbleSort(arr);

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Введите число для поиска в массиве:");
        int target = sc.nextInt();
        boolean flag = BinarySearch.searchElement(arr, target);

        if(flag)
            System.out.println("Числа " + target + " есть в массиве");
        else
            System.out.println("Числа " + target + " нет в массиве");

    }
}