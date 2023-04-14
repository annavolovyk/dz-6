public class ArraySum {

    public static int pairArray() {
        int[] array = {8, 2, 3, 4, 5, 6, 7};
        int evenSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                evenSum += array[i];
            }
        };
        System.out.println(evenSum);
        return evenSum;
    }
}
