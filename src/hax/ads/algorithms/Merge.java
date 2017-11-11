package hax.ads.algorithms;

public class Merge {

    private int[] numbers;
    private int[] aux;
    private int amount;

    public void sort(int[] values){
        this.numbers = values;
        amount = values.length;
        this.aux = new int[amount];
        mergesort(0, amount - 1);
    }

    private void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int mid = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, mid);
            // Sort the right side of the array
            mergesort(mid + 1, high);
            // Combine them both
            merge(low, mid, high);
        }
    }

    private void merge(int low, int middle, int high) {
        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            aux[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (aux[i] <= aux[j]) {
                numbers[k] = aux[i];
                i++;
            } else {
                numbers[k] = aux[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = aux[i];
            k++;
            i++;
        }

    }

}
