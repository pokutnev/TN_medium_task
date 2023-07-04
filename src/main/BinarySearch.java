package main;

public class BinarySearch {

    public int searchElement(int[] array, int target) {

        int leftBoarder = 0;
        int rightBoarder = array.length - 1;

        while (leftBoarder <= rightBoarder) {

            int midArr = (leftBoarder + rightBoarder) >> 1;

            if (array[midArr] == target) {
                return midArr;
            }
            else if(array[midArr] > target) {
                rightBoarder = midArr - 1;
            }
            else if (array[midArr] < target) {
                leftBoarder = midArr + 1;
            }
        }
        return -1;
    }

}
