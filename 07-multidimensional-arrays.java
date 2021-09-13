import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] numbers = new int[2][3];

        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;

        System.out.println();

        System.out.println(Arrays.deepToString(numbers));

        System.out.println("=".repeat(30));

        int[][] numbers2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.deepToString(numbers2));
    }

}