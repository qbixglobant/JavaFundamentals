import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");

        String name = scanner.nextLine().trim();

        System.out.print("What is your age? ");

        byte age = scanner.nextByte();

        System.out.println("Your name is ****" + name + "****");
        System.out.println("You are " + age + " years old");
    }

}
