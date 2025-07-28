public class InsertionSort {
    public int[] sort (int[] numbs) {

        for(int i = 0; i < numbs.length - 1; i++) {
            for (int j = i+ 1; j > 0 ; j--) {
                if( numbs[j] < numbs[j - 1]) {
                    swap(numbs, j, j - 1 );
                }
                else {
                    break;
                }
            }
        }
        return numbs;
    }
    void swap( int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
