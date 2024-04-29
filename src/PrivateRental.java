public class PrivateRental extends Customer{

    String driversLicenceNumber;
    String driverSinceDate;


    public PrivateRental(String name, String address, int postNumber,
                         String city, String phoneNumber, String email, String driversLicenceNumber, String driverSinceDate){
        super(name, address, postNumber, city, phoneNumber, email);
        this.driversLicenceNumber = driversLicenceNumber;
        this.driverSinceDate = driverSinceDate;
    }

    public String toString(){
        String customerToString = "Private Rental \n" + super.toString();

        customerToString += "drivers license number: " + driversLicenceNumber +
                "\ndriver since date: " + driverSinceDate + "\n";

        return customerToString;
    }


}
