package main;

public class BinarySearch {

    public static int[] bubbleSort(int[] array){

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]){
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }

        return array;
    }

    public static int searchElement(int[] array, int target){

        int leftBoarder = 0;
        int rightBoarder = array.length - 1;

        while (leftBoarder <= rightBoarder) {

            int midArr = (leftBoarder + rightBoarder) >> 1;

            if (array[midArr] == target)
                return midArr;

            else if(array[midArr] > target)
                rightBoarder = midArr - 1;


            else if (array[midArr] < target)
                leftBoarder = midArr + 1;


        }

        return -1;


    }


}
