public class Main {
    public static void main(String[] args) {
        int choice = 1;

        switch (choice) {
            case 1:
                System.out.println("You ordered Coffee");
                break;

            case 2:
                System.out.println("You ordered Tea");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}