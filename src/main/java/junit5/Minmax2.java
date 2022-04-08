package junit5;

public class Minmax2 {
    public String findMinmax2(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];

        }
        return "Min = " + min + ", Max = " + max;
    }
}

