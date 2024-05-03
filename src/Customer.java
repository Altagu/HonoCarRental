public abstract class Customer {
    String name;
    String address;
    int postNumber;
    String city;
    String phoneNumber;
    String email;
    int id;

    public Customer(String name, String address, int postNumber, String city, String phoneNumber, String email, int id){
        this.name = name;
        this.address = address;
        this.postNumber = postNumber;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return id + ", " + name+ ", " + address + ", " + postNumber
                + ", " + city + ", " + phoneNumber + ", " + email;
    }

}
