public abstract class Car {
    String brandModel;
    String fuelType;
    String plate;
    String registrationDate;
    int km;
    String info = "";

    public Car(String brandModel, String fuelType, String plate, String registrationDate, int km){
        this.brandModel = brandModel;
        this.fuelType = fuelType;
        this.plate = plate;
        this.registrationDate = registrationDate;
        this.km = km;
    }


}