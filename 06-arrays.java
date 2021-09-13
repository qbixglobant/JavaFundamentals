import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 7;
        numbers[1] = 8;
        numbers[2] = 2;
        numbers[4] = 1;

        System.out.println(Arrays.toString(numbers));

        String[] colors = { "red", "green", "blue"};

        System.out.println(Arrays.toString(colors));
        System.out.println("Numbers Length: " + numbers.length);
        System.out.println("Colors Length: " + colors.length);
        System.out.println("Colors Length: " + colors.length);

        Arrays.sort(numbers);
        System.out.println("Numbers Sorted: " + Arrays.toString(numbers));
    }

}
