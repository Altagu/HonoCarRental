public abstract class Customer {
    String name;
    String address;
    int postNumber;
    String city;
    String phoneNumber;
    String email;

    public Customer(String name, String address, int postNumber, String city, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.postNumber = postNumber;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String toString(){
        return "Name: " + name + "\nAddress: " + address + "\npost number: " + postNumber
                + " City: " + city + "\nphone number: " + phoneNumber + "\nemail: " + email + "\n" ;
    }

}
