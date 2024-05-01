public class CompanyCustomer extends Customer{

    String companyName;
    String companyAddress;
    String companyPhoneNumber;
    int CRN;

    public CompanyCustomer(String name, String address, int postNumber,
                         String city, String phoneNumber, String email, String companyName,
                         String companyAddress, String companyPhoneNumber, int CRN){
        super(name, address, postNumber, city, phoneNumber, email);

        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhoneNumber = companyPhoneNumber;
        this.CRN = CRN;
    }

    public String toString(){
        String customerToString = "Company Rental\n" + super.toString();

        customerToString += "company name: " + companyName + "\ncompany address: " + companyAddress
                + "\ncompany phone number: " + companyPhoneNumber + "\nCRN: " + CRN + "\n";

        return customerToString;
    }
}
