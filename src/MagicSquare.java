public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {

        int sum = 0;

        for (int i = 0; i< array2d[0].length; i++){
            sum = sum + array2d[0][i];
        }

        return sum;

    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {

        int sum = 0;
        checkSum = calculateCheckSum(array2d);

        for (int row = 0; row< array2d.length; row++){
            for (int col = 0; col< array2d[row].length; col++){
                sum = sum + array2d[row][col];
            }
            if (sum == checkSum){
                return true;
            }
            return false;

        }

    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {

        int sum = 0;
        checkSum = calculateCheckSum(array2d);

        for (int row = 0; row< array2d.length; row++){
            for (int col = 0; col< 1; col++) {
                sum = sum + array2d[row][col];
            }

        }
        if (sum == checkSum){
            return true;
        }
        return false;

    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        checkSum = calculateCheckSum(array2d);

        if (array2d[0][0] + array2d[1][1] + array2d[2][2] == checkSum){
            if (array2d[0][2] + array2d[1][1] + array2d[2][0] == checkSum){
            return true;
        }
        return false;

    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {

        boolean magicR = magicRows(array2d, int checkSum);

        if magicR = true;

    }

}
