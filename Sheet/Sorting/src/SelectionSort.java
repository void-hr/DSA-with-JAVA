public class SelectionSort {

    public int[] sort (int[] numbs) {
        for (int i = 0; i < numbs.length; i++) {
            int min = i;
            for (int j = i; j < numbs.length - 1; j++) {
                if(numbs[j] < numbs[min]) min = j;
            }
            swap(numbs, min, i);
        }
        return numbs;
    }

    void swap( int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
