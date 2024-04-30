import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Customer newCustomer = createCustomer();
        System.out.println(newCustomer);

        // Test af kunder - privatkunder
        PrivateRental private1 = new PrivateRental("bob", "her", 2000, "Sim"
        , "2947278927", "hej@test.dk", "376537gd6", "12/12222");

        // Test af Firma - Companykunde
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

    private static Customer createCustomer() {
        System.out.println("Type 1. for Private Customer or type 2. for Company Customer: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("You chose: " + choice);
        System.out.println("Fill in the data and hit enter");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("PostNumber: ");
        int postNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("PhoneNumber: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        if (choice == 1){
            System.out.println("DriversLicense Number: ");
            String driversLicenceNumber = sc.nextLine();
            System.out.println("Driver Since Date: ");
            String driverSinceDate = sc.nextLine();

            PrivateRental privateCustomer = new PrivateRental(name,address,postNumber,city,phoneNumber,email,driversLicenceNumber,driverSinceDate);
            return privateCustomer;

        } else if (choice == 2) {
            System.out.println("Company Name: ");
            String companyName = sc.nextLine();
            System.out.println("Company Address: ");
            String companyAddress = sc.nextLine();
            System.out.println("Company Phone Number: ");
            String companyPhoneNumber = sc.nextLine();
            System.out.println("CRN: ");
            int CRN = sc.nextInt();
            CompanyRental companyCustomer = new CompanyRental(name,address,postNumber,city,phoneNumber,email,companyName,companyAddress,companyPhoneNumber,CRN);
            return companyCustomer;

        } else
            System.out.println("You've entered the wrong number. Choose between 1 and 2: ");

        // Jeg returnere null fordi der skal returneres en værdi.
        return null;
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
