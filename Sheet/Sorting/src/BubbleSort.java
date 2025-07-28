public class BubbleSort {
    public int[] sort (int[] numbs) {

        for(int i = 0; i < numbs.length; i++) {
            for (int j = 0; j < numbs.length - 1 - i; j++) {
                if( numbs[j] > numbs[j+1]) {
                    swap(numbs, j, j + 1 );
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


// 23  1  3  4  21  30
//  |  |  |  |  |   |
//  0  1  2  3  4   5

