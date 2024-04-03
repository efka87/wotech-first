public class Main {
    public static void main(String[] args) {
        var temperature = -6; 

        if (temperature <= 5) {
            System.out.println("Wear super warm clothing!");
        } else if (temperature <= 15) {
            System.out.println("Wear warm clothing!");
        } else if (temperature <= 30) {
            System.out.println("Wear normal clothing.");
        } else {
            System.out.println("Wear cooling clothing.");
        }
    }
}
