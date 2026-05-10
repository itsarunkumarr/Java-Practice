package practice;

public class Array2D {
    public static void main(String[] args) {

        System.out.println(findArray(5, new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }));

        int[][] array = new int[][]{
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };
        System.out.println(findArray(30, array));
    }

    static boolean findArray(int num, int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == num) {

                    return true;
                }
            }
        }
        return false;
    }

}
