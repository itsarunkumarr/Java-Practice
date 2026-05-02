public class ArraySum2D {

    public static void main(String[] args) {

        int[][] array = new int[][]{
                {0, 1, 2},
                {4, 5}
        };

        System.out.println(sumArray(array));

        System.out.println("Total element in an array: " + elementCount(array));

        int n = elementCount(array);

        int actualSum = n * (n + 1) / 2;
        int sum = sumArray(array);

        int ans = actualSum - sum;

        System.out.println("Missing number in an Array is: " + ans);


    }

    // Sum of 2D Array
    static int sumArray(int[][] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                sum += nums[i][j];

            }
        }
        return sum;
    }

    // Find Total Element in 2D Array
    static int elementCount(int[][] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i].length;
        }

        return count;
    }
}
