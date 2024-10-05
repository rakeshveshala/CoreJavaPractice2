package corejava.strings;
public class MergeArraysUsingLoop {
    public static void main(String[] args) {
        int array1[] = {11,22,33,44};
        int array2[] = {111,222,333,444};

        int[] mergedArray = new int[array1.length + array2.length];
        int index = 0;
        for (int element : array1) {
            mergedArray[index++] = element;
        }
        for (int element : array2) {
            mergedArray[index++] = element;
        }
        System.out.println("Array after merging: ");
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }
    }
}