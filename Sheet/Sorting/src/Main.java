
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] numbs = {23,1,3,4,21,30, 40};
        InsertionSort ss = new InsertionSort();
        numbs = ss.sort(numbs);

//        JAVA IS PASS BY VALUE
        System.out.println(Arrays.toString(numbs));

    }
}