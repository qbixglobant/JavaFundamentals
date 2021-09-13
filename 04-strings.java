public class Main {

    public static void main(String[] args) {
        // Redundant Code
        // String message = new String("Hello World");

        String message = "Hello World" + "!!";
        String message2 = "    Java    ";

        System.out.println(message);
        System.out.println("Ends with !! " + message.endsWith("!!"));
        System.out.println("Starts with !! " + message.startsWith("!!"));
        System.out.println("Length " + message.length()  + " characters");
        System.out.println("Index of W | " + message.indexOf("W") + " position");
        System.out.println("Replace ! with * | " + message.replace("!", "*"));
        System.out.println("Lowercase | " + message.toLowerCase());
        System.out.println("Uppercase | " + message.toUpperCase());
        System.out.println("--" + message2 + "--");
        System.out.println("Trim | " + "--" + message2.trim() + "--");
    }

}
