public class Main {

    public static void main(String[] args) {
        int round = Math.round(1.1F);
        int ceil = (int) Math.ceil(1.9F);
        int floor = (int) Math.floor(1.1F);
        int max = Math.max(1, 2);
        int min = Math.max(1, 2);
        int random = (int) Math.round(Math.random() * 100);
        int random2 = (int) (Math.random() * 100);

        System.out.println("Round: " + round);
        System.out.println("Ceil: " + ceil);
        System.out.println("Floor: " + floor);
        System.out.println("Max: " + max);
        System.out.println("Max: " + min);
        System.out.println("Random: " + random);
        System.out.println("Random2: " + random2);
    }

}
