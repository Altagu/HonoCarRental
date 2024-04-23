import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("1.\n2.\n3.\n4.");
        switch (sc.nextInt()){
            case 1:
                rentCar();
                break;
            case 2:
                carList();
                break;
            case 3:
                customerList();
                break;
            default:
        }
    }
}