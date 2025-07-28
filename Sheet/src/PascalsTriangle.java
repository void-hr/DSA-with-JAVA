public class PascalsTriangle {

    public static void main(String[] args) {

        int n = 4;

        // staircase of mount meru
        int c = 3;
        String temp = Integer.toString(11*11*11*11);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
//    0 based indexing
        System.out.println(newGuess[c-1]);
    }
}
