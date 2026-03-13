public class MaxMinFinder {

    public static Comparable[] maxAndMin(Comparable[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Массив должен содержать минимум 2 элемента");
        }

        Comparable max = array[0];
        Comparable min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }

        return new Comparable[]{max, min};
    }
}