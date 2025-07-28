//Problem Statement: Given a matrix if an element in the matrix is 0
// then you will have to set its entire column and row to 0 and
// then return the matrix.

// input matrix
//[0,1,2,0]
//[3,4,5,2]
//[1,3,1,5]

// output matrix
//[0,0,0,0]
//[0,4,5,0]
//[0,3,1,0]

//brute: if all elements are +ve in matrix mark 0th with negative value
//better: take two more boolean arrays to track 0's
//optimal: time is sorted for space use 0th row and col as tracking matrix

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4}, {5,0,7,8}, {0,10,11,12}, {13,14,15,0}};
//       ask yourself why col0
        int col0 = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
// this is crucial part of intuition
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else col0 = 0;
                }


            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }

        }

        if (matrix[0][0] == 0) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println("]");
        }


    }
}
