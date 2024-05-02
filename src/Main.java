import java.util.*;
import java.io.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Car> carList = new ArrayList<>();
    static ArrayList<Customer> customerList = new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }

    // Switchen der bruges til metoder
    private static void menu() {
        System.out.println("1. Create car\n2. Print carlist\n3. Create customer \n4. Print customerlist \n5. New rental \n6. Exit");
        switch (sc.nextInt()) {
            case 1:
                createCar();
                menu();
            case 2:
                //printCarList();
                menu();
            case 3:
                createCustomer();
                menu();
            case 4:
                printCustomerList();
                menu();
            case 5:
                newRental();
            case 6:
                System.exit(1);
            default:
        }
    }//Afslutning af menu();

    // Vores metode til at lave nye kunder
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

        if (choice == 1) {
            System.out.println("DriversLicense Number: ");
            String driversLicenceNumber = sc.nextLine();
            System.out.println("Driver Since Date: ");
            String driverSinceDate = sc.nextLine();

            PrivateCustomer privateCustomer = new PrivateCustomer(name, address, postNumber, city, phoneNumber, email, driversLicenceNumber, driverSinceDate);

            customerList.add(privateCustomer);

            // Filewriter til Privatkunde
            try (FileWriter fw = new FileWriter("Customer.txt", true)) { // Vi appender til filen
                fw.write(privateCustomer.toString() + "\n"); // Vi skriver information til filen her.
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
            }

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
            CompanyCustomer companyCustomer = new CompanyCustomer(name, address, postNumber, city, phoneNumber, email, companyName, companyAddress, companyPhoneNumber, CRN);
            
            customerList.add(companyCustomer);

            // Filewriter til Firma kunde
            try (FileWriter fw = new FileWriter("Customer.txt", true)) { // Vi appender til filen
                       fw.write(companyCustomer.toString() + "\n"); // Vi skriver information til filen her.
                       System.out.println("Successfully wrote to the file.");
                   } catch (IOException e) {
                       System.out.println("An error occurred.");
                   }
            return companyCustomer;

        } else
            System.out.println("You've entered the wrong number. Choose between 1 and 2: ");

        // Returnere null her, fordi der skal returneres en værdi.
        return null;
    }

    public static Car createCar() {
        System.out.println("brandmodel");
        String brandModel = sc.next();

        System.out.println("fueltype");
        String fuelType = sc.next();
        System.out.println("nrPlate");
        String nrPlate = sc.next();
        System.out.println("regDate");
        String regDate = sc.next();
        System.out.println("kmDriven");
        int kmDriven = sc.nextInt();

        Car car = new Car(brandModel, fuelType, nrPlate, regDate, kmDriven);
        carList.add(car);

        // Filewriter til biler
        try (FileWriter fw = new FileWriter("Cars.txt", true)) { // Vi appender til filen her.
            fw.write(car.toString() + "\n"); // Vi skriver information til filen her.
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        return car;
    }//Afslutning af rentCar();

    /* Her læser vi fra Cars.txt. Vi bruger bufferedReader fordi det er mere effektivt.
    Bufferen læser hele filen på en gang og ikke linje for linje.
    Derudover bruger vi lineSplit til at splitte dataen mellem kommaer.
     */
    private static void readCarData() {
        try (BufferedReader br = new BufferedReader(new FileReader("Cars.txt"))) {
            String line;
            // Her bruger vi != null fordi tomme linjer ikke skal læses ind som null.
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                String brandModel = parts[0];
                String fuelType = parts[1];
                String nrPlate = parts[2];
                String regDate = parts[3];
                int kmDriven = Integer.parseInt(parts[4]);
                Car car = new Car(brandModel, fuelType, nrPlate, regDate, kmDriven);
                carList.add(car);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading Cars.txt: " + e.getMessage());
        }
    }

    //Bruges kun til tests (med mindre data er læst ind fra fil)
    private static void printCarList() {
        for (Car car : carList) {
            System.out.println(car);
        }
    }//Afslutning af printCarList();

    //Bruges kun til tests (med mindre data er læst ind fra fil)
    private static void printCustomerList() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }//Afslutning af printCustomerList();

    private static void newRental() {
        System.out.println("Select a customer:");
        //Læs indhold fra filer ind i Car og customer array list (HUSK TYPE)
        //Ellers er der ikke noget indhold i vores runtime data
        printCustomerList();
        int customerIndex = sc.nextInt();
        sc.nextLine();
        if (customerIndex >= 0 && customerIndex < customerList.size()) {
            Customer selectedCustomer = customerList.get(customerIndex);

            readCarData();
            System.out.println("Select a car:");
            printCarList();
            int carIndex = sc.nextInt();
            sc.nextLine(); // Consume newline
            if (carIndex >= 0 && carIndex < carList.size()) {
                Car selectedCar = carList.get(carIndex);

                // Create a new rental with the selected customer and car
                Rental newRental = new Rental(selectedCustomer, selectedCar);

                // Perform additional actions related to the rental if needed

                System.out.println("New rental created: " + newRental);
            } else {
                System.out.println("Invalid car selection.");
            }
        } else {
            System.out.println("Invalid customer selection.");
        }
    }
}
    /*lav en rental
    laver vi en kunde
    tilføjer en nuværende bil fra listen*/


/*Tilføje bil: tage input -> lav til bil object ->  skriv til fil
* Tilføje kunde: tage input -> lav til kunde object ->  skriv til fil
*
* Tilføje rental: læs kunder og biler fra fil -> skriv til array lists ->
* print list -> tag input fra consol(valg af kunde og bil) ->
* lav rental objekt med bil og kunde -> skriv til fil
* */