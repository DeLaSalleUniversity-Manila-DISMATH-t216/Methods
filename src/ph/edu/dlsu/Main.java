package ph.edu.dlsu;

public class Main {

    public static void main(String[] args) {
        printSomething();
        Looping();
    }

    private static void printSomething() {
        System.out.println("List of numbers from zero to ten:");
    }

    private static void Looping() {
        for (int i = 0; i <= 10 ; i++){
            System.out.println("Number " +i);
        }
    }
}
