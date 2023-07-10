package main;

public class BinarySearch {

    public int searchElement(int[] array, int target) {

        var leftBoarder = 0;
        var rightBoarder = array.length - 1;

        while (leftBoarder <= rightBoarder) {

            var midArr = (leftBoarder + rightBoarder) >> 1;

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
