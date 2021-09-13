public class Main {

    public static void main(String[] args) {
        // Redundant Code
        // String message = new String("Hello World");

        String message = "Hello World" + "!!";

        System.out.println(message);
        System.out.println("Ends with !! " + message.endsWith("!!"));
        System.out.println("Starts with !! " + message.startsWith("!!"));
        System.out.println("Length " + message.length()  + " characters");
        System.out.println("Index of W " + message.indexOf("W") + " position");
        System.out.println("Replace ! with * | " + message.replace("!", "*"));
    }

}
