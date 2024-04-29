import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Test af kunder - privatkunder
        PrivateRental private1 = new PrivateRental("bob", "her", 2000, "Sim"
        , "2947278927", "@lort", "376537gd6", "12/12222");

        //Companykunde
        CompanyRental Company1 = new CompanyRental("Henrik", "Testvej 1", 2000,
                "Stenløse", "233341", "Test@live.dk", "Amnesty",
                "Testvej 24", "1234123", 24415);
        //System.out.println(private1);
        //System.out.println(Company1);

        ArrayList<Customer> Customers = new ArrayList<>();
        Customers.add(private1);
        Customers.add(Company1);

        //menu();
    }

    private static void menu() {
        System.out.println("1.\n2.\n3.\n4.");
        switch (sc.nextInt()){
            case 1:
                //rentCar();
                break;
            case 2:
                //carList();
                break;
            case 3:
                //customerList();
                break;
            default:
        }
    }


}
