public class PrivateCustomer extends Customer{

    String driversLicenceNumber;
    String driverSinceDate;

    // Dette er vores constructor til at lave en instans af private rental klassen.
    public PrivateCustomer(String name, String address, int postNumber,
                         String city, String phoneNumber, String email, String driversLicenceNumber, String driverSinceDate){
        super(name, address, postNumber, city, phoneNumber, email);
        this.driversLicenceNumber = driversLicenceNumber;
        this.driverSinceDate = driverSinceDate;
    }

    // Vores ToString metode, der gør det muligt at printe. Vi bruger super.toString fordi vi bruger CustomersToString.
    public String toString(){
        String customerToString = "Private Rental \n" + super.toString();

        customerToString += "drivers license number: " + driversLicenceNumber +
                "\ndriver since date: " + driverSinceDate + "\n";

        return customerToString;
    }


}
