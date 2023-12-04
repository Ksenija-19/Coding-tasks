public class E4 {
    public static void main(String[] args) {
        int[][] numbers2D = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbers2D.length; i++) {
            for (int j = 0; j < numbers2D[i].length; j++) {
                if (numbers2D[i][j] % 2 == 0) {
                    sumEven += numbers2D[i][j];
                } else {
                    sumOdd += numbers2D[i][j];
                }
            }
        }
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
    }
}
