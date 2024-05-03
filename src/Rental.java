public class Rental {
    private Customer customer;
    private Car car;

    public Rental(Customer customer, Car car){
        this.customer = customer;
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String toString() {
        return "Rental Details: \n" + "Customer: " + customer + "\n" +
                "Car: " + car;
    }
}