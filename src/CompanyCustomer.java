public class CompanyCustomer extends Customer{

    String companyName;
    String companyAddress;
    String companyPhoneNumber;
    int CRN;

    public CompanyCustomer(String name, String address, int postNumber,
                         String city, String phoneNumber, String email, int id, String companyName,
                         String companyAddress, String companyPhoneNumber, int CRN){
        super(name, address, postNumber, city, phoneNumber, email, id);

        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhoneNumber = companyPhoneNumber;
        this.CRN = CRN;
    }

    public String toString(){
        String customerToString = super.toString();

        customerToString += ", " + companyName + ", " + companyAddress
                + ", " + companyPhoneNumber + ", " + CRN + ", C";

        return customerToString;
    }
}
